package leetCode.easy;//An integer is a palindrome when it reads the same backward as forward.

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 1221;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindrome = palindromeNumber.isPalindrome(number);
        System.out.println(isPalindrome);
    }


    public boolean isPalindrome(int x) {
        String intStr = String.valueOf(x);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }
}
