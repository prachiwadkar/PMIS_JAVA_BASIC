
import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {

        // Store different email addresses
        Set<String> set = new HashSet<>();

        for (String email : emails) {

            // Split email into name and domain
            String[] parts = email.split("@");

            String name = parts[0];
            String domain = parts[1];

            // Ignore everything after +
            if (name.contains("+")) {
                name = name.substring(0, name.indexOf("+"));
            }

            // Remove all dots from the name
            name = name.replace(".", "");

            // Join the name and domain
            String newEmail = name + "@" + domain;

            // HashSet stores only unique emails
            set.add(newEmail);
        }

        // Return number of unique emails
        return set.size();
    }
}
