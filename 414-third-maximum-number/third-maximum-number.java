class Solution {
    public int thirdMax(int[] nums) {

        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (int num : nums) {

            // Skip duplicate numbers
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            // If num is the biggest number
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            }

            // If num is the second biggest
            else if (second == null || num > second) {
                third = second;
                second = num;
            }

            // If num is the third biggest
            else if (third == null || num > third) {
                third = num;
            }
        }

        // If third maximum does not exist, return first
        if (third == null) {
            return first;
        }

        return third;
    }
}