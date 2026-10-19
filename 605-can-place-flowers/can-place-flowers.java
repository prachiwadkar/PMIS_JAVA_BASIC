
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        // If no flowers are needed, return true
        if (n == 0) {
            return true;
        }

        // Check each plot
        for (int i = 0; i < flowerbed.length; i++) {

            // Check if the current plot is empty
            if (flowerbed[i] == 0) {

                // Check if the left plot is empty or does not exist
                // Check if the right plot is empty or does not exist
                if ((i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                    // Plant a flower
                    flowerbed[i] = 1;

                    // Reduce the number of flowers needed
                    n--;

                    // If all flowers are planted, return true
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        // Not enough empty plots to plant all flowers
        return false;
    }
}
