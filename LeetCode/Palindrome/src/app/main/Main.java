package app.main;

public class Main {

    //  Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same
    //  backward as forward
    //  example: 121 -> 121 -> true
    //  example: -121 -> 121- -> false
    //  example: 10 -> 01 -> false
    //  if the given number is negative -> false
    //  if the given number is a multiple of 10 (last integer is 0) -> false
    //  A reversed integer might cause an overflow
    // it can be solved by reversing the half (right->left) of the integer
    // if the length is even split at middle; if the reverse of the first half == to the second half then it is palindrome
    // if the length is NOT even then use integer division. Reverse the first half and remove the last digit. If the
    // result is == to the second half then it is palindrome

    public static boolean isPalinddrome(int n){

        if (n < 0 || (n % 10 == 0 && n != 0)){
            return false;
        }
        int reverseNum = 0; // return the reverse of the first half (right->left)
        while (n > reverseNum){
            // once the modified original number is equal or less than the reverse string ("middle") it breaks
            int lastDigit = n % 10; //get the last digit
            reverseNum = reverseNum * 10 + lastDigit; //appends the reverseNum to store the reverse of the first half
            n = n / 10; // deletes the last integer from the original number.
        }

        return n == reverseNum /*even*/ || n == reverseNum / 10; /*odd*/

        // since we are iterating through each digit of the number the time complexity is O(n) -> linear
        // since we are just creating 1 variable, each just keeps changing, the space complexity is O(1) -> constant
    }

    public static void main(String[] args) {

        int test = 121; //true
        int test2 = -121; //false
        int test3 = 12321; //true
        int test4 = 1230; //false

        System.out.println("is Test 1 a palindrome?: " + isPalinddrome(test));
        System.out.println("is Test 2 a palindrome?: " + isPalinddrome(test2));
        System.out.println("is Test 3 a palindrome?: " + isPalinddrome(test3));
        System.out.println("is Test 4 a palindrome? " + isPalinddrome(test4));
    }
}
