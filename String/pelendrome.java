public class pelendrome {

    // Function to check if a string is a valid palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));  // Expected output: true
    }

//     public boolean isPalindrome(String x) {
//         int n = x.length();
//         for (int i = 0; i < n / 2; i++) {
//             if (x.charAt(i) != x.charAt(n - 1 - i)) {
//                 return false;
//             }
//         }                                                          //without avoiding space and capital or small letters 
//         return true;
//     }

//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         String x = "racecar";
//         System.out.println(obj.isPalindrome(x));
//     }
}