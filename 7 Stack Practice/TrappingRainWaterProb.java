public class TrappingRainWaterProb {
    public static int trap(int[] height) {
        int lMax = 0;
        int rMax = 0;
        int total = 0;
        
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            if (height[l] <= height[r]) {
                if (lMax > height[l]) {
                    total += lMax - height[l];
                } else {
                    lMax = height[l];
                }
                l++;
            } else {
                if (rMax > height[r]) {
                    total += rMax - height[r];
                } else {
                    rMax = height[r];
                }
                r--;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));

    }
}
