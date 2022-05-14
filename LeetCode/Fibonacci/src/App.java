public class App {
    
    public static long fib(long n){

        if(n <= 1) return n;

        return fib(n - 1) + fib(n - 2);

    }
    
    public static void main(String[] args) throws Exception {
        long n = 50;

        long start = System.currentTimeMillis();
        System.out.println("fibonacci of " + n + " is: " + fib(n));
        long end = System.currentTimeMillis();

        System.out.println("Elapsed time: " + ((end - start)/1000.0) + " seconds");
    }
}
