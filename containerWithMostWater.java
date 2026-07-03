
class containerWithMostWater {

    int find(int height[]) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = -1;

        while (left < right) {
            int hei = Math.min(height[left], height[right]);
            int width = right - left;

            int area = hei * width;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxArea;
    }

    public static void main(String args[]) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        containerWithMostWater c = new containerWithMostWater();
        System.out.print(c.find(height));
    }
}
