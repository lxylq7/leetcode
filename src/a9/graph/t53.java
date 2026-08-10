package a9.graph;

import java.util.*;

// 课程表
public class t53 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] cp : prerequisites) {
            degree[cp[0]]++; //入度
            graph.get(cp[1]).add(cp[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            numCourses--;
            for (int cur : graph.get(pre)) {
                degree[cur]--;
                if (degree[cur] == 0) {
                    queue.add(cur);
                }
            }
        }
        return numCourses == 0;
    }
}
