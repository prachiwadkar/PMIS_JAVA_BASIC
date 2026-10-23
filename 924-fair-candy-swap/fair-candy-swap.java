
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceTotal = 0;
        int bobTotal = 0;

        // Count Alice's total candies
        for (int candy : aliceSizes) {
            aliceTotal = aliceTotal + candy;
        }

        // Count Bob's total candies
        for (int candy : bobSizes) {
            bobTotal = bobTotal + candy;
        }

        // Try every box Alice has
        for (int a : aliceSizes) {

            // Try every box Bob has
            for (int b : bobSizes) {

                // Check if totals become equal after exchange
                if (aliceTotal - a + b == bobTotal - b + a) {
                    return new int[]{a, b};
                }
            }
        }

        return new int[]{0, 0};
    }
}
