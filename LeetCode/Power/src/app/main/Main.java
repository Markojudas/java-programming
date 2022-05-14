package app.main;

public class Main {

    /*
        Pow(x,n)

        Implement pow(x,n) which calculates x raised to the power of n (i.e. x^n)

        algorithm:
            * we check if n is negative; if so we get the absolute value (* -1)
            * we keep a value to 1.0 for when n is not divisible by 2 (2^3 = 2^1 * 2^2)
            * this is the value we will be returning.
            * then while n is greater than 0 we get the power
            * if n is divisible by 2 then we calculate x * x and modify n /= 2
            * if n is NOT divisible by 2 then we calculate ans = ans * x and modify n - 1;
            * if n IS negative then we return 1.0/ans, otherwise return ans
            * example: 2^3 =
                            ans = 1.0 * 2 = 2.0
                            n = 3 - 1 = 2; n = 2
                            n is now divisible by 2
                            x = 2 * 2 = 4; x = 4
                            n = 2 / 2 = 1; n = 1
                            n is NOT divisible by 2
                            ans = 2.0 * 4 = 8.0; ans = 8.0
                            n = 1 - 1 = 0
                            n == 0; break
                            ans = 8.0
     */

    public static double power(double x, int n){
        double ans = 1.0;

        long num = n; //to prevent overflow

        if (n < 0){
            num = -1 * num; //abs value
        }
        while (num > 0){
            if (num % 2 == 0){
                x = x * x;
                num = num /2;
            }else{
                ans = ans * x;
                num = num - 1;
            }
        }

        if(n < 0){
            return 1.0 / ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        double testx = 2.0;
        int n = 3;

        System.out.println("answer of " + testx + " to the power of " + n + " : " + power(testx, n));

        double testx2 = 2.0;
        int n2 = 8;

        System.out.println("answer of " + testx2 + " to the power of " + n2 + " : " + power(testx2, n2));

        double testx3 = 2.0;
        int n3 = 15;

        System.out.println("answer of " + testx3 + " to the power of " + n3 + " : " + power(testx3, n3));

        double testx4 = 2.0;
        int n4 = -3;

        System.out.println("answer of " + testx4 + " to the power of " + n4 + " : " + power(testx4, n4));
    }
}
