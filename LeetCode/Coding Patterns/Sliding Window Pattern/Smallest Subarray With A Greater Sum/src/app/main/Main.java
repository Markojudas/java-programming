package app.main;

public class Main {

    class smallestSubarrayGreaterSum{

        public static int findSmallestSubarray(int k, int[] arr){
            int sum = 0, minLength = Integer.MAX_VALUE;
            int start = 0;

            for (int end = 0; end < arr.length; end++){
                sum += arr[end];

                while(sum >= k){
                    minLength = Math.min(minLength, end - start + 1);
                    sum -= arr[start];
                    start++;
                }
            }

            return minLength == Integer.MAX_VALUE ? 0 : minLength;
        }
    }

    public static void main(String[] args) {

        int result = smallestSubarrayGreaterSum.findSmallestSubarray(7, new int[] {2,1,5,2,3,2});
        System.out.println("Result = " + result);
    }
}
