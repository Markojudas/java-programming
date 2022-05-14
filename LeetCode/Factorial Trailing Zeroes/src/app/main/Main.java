package app.main;

public class Main {

    /*
        Factorial Trailing Zeroes

        Given an integer n, return the number of trailing zeroes in n!.

        Constraints: 0(log(n)) time

        When do we get trailing zeroes? when you multiply a non-zero times 10. The number of times we multiply by 10 =
        then number of trailing zeroes

       When you multiply a non-zero time 2 * 5 (10). If we multiply twice 2 * 5 == 2 trailing zeroes

        5! = 1 * 2 * 3 * 4 * 5
            = 1 * 2 * 3 * 2 * 2 * 5 -> we multiply 2 * 5 once therefore 1 trailing zero

        10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 (2 * 5) = 2 5's = 2 trailing zeros

        15! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 (2 * 5) * 11 * 12 * 13 * 14 * 15 (3 * 5) = 3 trailing zeroes

        20! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 (2 * 5) * 11 * 12 * 13 * 14 * 15 (3 * 5) * 16 * 17 * 18 * 19 * 20 (4 * 5) = 4 trailing zeroes

        25! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 (2 * 5) * 11 * 12 * 13 * 14 * 15 (3 * 5) * 16 * 17 * 18 * 19 * 20 (4 * 5) * 21 * 22 * 23 * 24 * 25 (5 * 5) = 6 5's = 6 trailing zeroes

        Therefore, keep track of the number of 5s.
     */

    public static int trailing_zeroes(int n){
        int count = 0;

        while(n > 0){
            n /= 5;
            count += n;
        }

        return count;
    }

    public static void main(String[] args) {

        int test = 25;
        int test2 = 10;
        int test3 = 15;
        int test4 = 20;

        System.out.println("The number of trailing zeroes in " + test + " is: " + trailing_zeroes(test));
        System.out.println("The number of trailing zeroes in " + test2 + " is: " + trailing_zeroes(test2));
        System.out.println("The number of trailing zeroes in " + test3 + " is: " + trailing_zeroes(test3));
        System.out.println("The number of trailing zeroes in " + test4 + " is: " + trailing_zeroes(test4));

    }
}
