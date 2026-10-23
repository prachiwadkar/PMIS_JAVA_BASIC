
import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {

            // Starting number of the range
            int start = nums[i];

            // Check the next consecutive numbers
            while (i + 1 < nums.length &&
                   nums[i + 1] == nums[i] + 1) {
                i++;
            }

            // Ending number of the range
            int end = nums[i];

            // If only one number, store just that number
            if (start == end) {
                result.add("" + start);
            } else {
                // Otherwise, store start->end
                result.add(start + "->" + end);
            }

            // Move to the next range
            i++;
        }

        return result;
    }
}
