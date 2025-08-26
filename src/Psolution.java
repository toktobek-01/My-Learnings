public class Psolution {
        public boolean isPalindrome(int x) {
            // Negative numbers cannot be palindromes
            if (x < 0) return false;

            int original = x;
            int reversed = 0;

            while (x != 0) {
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x = x / 10;
            }

            return original == reversed;
        }

        public static void main(String[] args) {
            Psolution sol = new Psolution();
            System.out.println(sol.isPalindrome(121));   // true
            System.out.println(sol.isPalindrome(-121));  // false
            System.out.println(sol.isPalindrome(10));    // false
        }
    }


