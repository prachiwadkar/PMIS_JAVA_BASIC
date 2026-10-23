
class Solution {
    public int calPoints(String[] operations) {

        int[] scores = new int[operations.length];
        int size = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                // Remove the last score
                size--;
            }
            else if (operations[i].equals("D")) {
                // Double the previous score
                scores[size] = 2 * scores[size - 1];
                size++;
            }
            else if (operations[i].equals("+")) {
                // Add the previous two scores
                scores[size] = scores[size - 1]
                             + scores[size - 2];
                size++;
            }
            else {
                // Convert the string into an integer
                scores[size] = Integer.parseInt(operations[i]);
                size++;
            }
        }

        // Calculate the total of all valid scores
        int total = 0;

        for (int i = 0; i < size; i++) {
            total += scores[i];
        }

        return total;
    }
}
