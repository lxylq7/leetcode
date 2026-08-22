package code;

import javax.print.attribute.standard.MediaName;

public class code11 {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int max = 0;
        while (left < right) {
            int x = right - left;
            int y = Math.min(height[left],height[right]);
            int area = x * y;
            max = Math.max(max,area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        //
        return max;
    }
}
