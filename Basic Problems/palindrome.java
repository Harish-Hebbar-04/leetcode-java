public class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // Compare characters from the start and end
            if (s.charAt(start) != s.charAt(end)) {
                return false; // If any mismatch, it's not a palindrome
            }
            start++;
            end--;
        }

        return true; // If no mismatches, it's a palindrome
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "racecar";  // Example input
        boolean result = solution.isPalindrome(str);
        System.out.println("Is palindrome: " + result); // Expected output: true
    }
}
