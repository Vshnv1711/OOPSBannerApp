public class Typingaccuracychecker {

    static void checkTypingAccuracy(String original, String typed) {
        int total = original.length();
        int matched = 0;
        int firstMismatchPos = -1;

        for (int i = 0; i < total; i++) {
            char oChar = original.charAt(i);
            char tChar = typed.charAt(i);

            if (oChar == tChar) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i; // record only the first mismatch
            }
        }

        double accuracy = ((double) matched / total) * 100;

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matched, total, accuracy);

        if (firstMismatchPos == -1) {
            System.out.println(" | No Mismatches");
        } else {
            // position reported as 1-based, matching the sample output ("position 11")
            System.out.println(" | First Mismatch at position " + (firstMismatchPos + 1)
                    + " ('" + original.charAt(firstMismatchPos) + "' vs '" + typed.charAt(firstMismatchPos) + "')");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test 1:");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("\nTest 2:");
        checkTypingAccuracy("coding", "coding");
    }
}
