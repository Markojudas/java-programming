package app.main;

public class Main {

    // Given an array of positive numbers and a positive number k, find the maximum sum of any contiguous sub-array of
    //size k.

    class MaxSumSubArrayOfSizeK{

        public static int findMaxSumSubArray(int k, int[] arr){
            int result = 0;

            for (int i = 0; i <= arr.length - k; i++) {
                int temp = 0;
                for (int j = i; j < i + k; j++) {
                    temp += arr[j];
                }
                result = Math.max(temp, result);
            }
            return result;
        }

    }

    class SWMaxSumSubArrayOfSizeK{

        public static int findMaxSumSubArray2(int k, int[] arr){
            int result = 0, temp = 0;
            int start = 0, end = 0;


            for (; end < arr.length; end++){
                temp += arr[end]; //adding the next element

                // if it has reached the end of the window; its index
                if (end >= k - 1){
                    result = Math.max(result, temp);  //set the result
                    temp -= arr[start]; //subtract the first element of the previous window
                    start++; //actual sliding.
                }
            }

            return result;
        }
    }


    public static void main(String[] args) {

        int result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] {2,1,5,1,3,2});

        System.out.println("Maximum sum of any contiguous sub-array of size K: " + result);

        int result2 = MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] {2,3,4,1,5});
        System.out.println("Maximum sum of any contiguous sub-array of size K: " + result2);

        System.out.println("****SLIDING WINDOW******");
        int result3 = SWMaxSumSubArrayOfSizeK.findMaxSumSubArray2(2, new int[] {2,3,4,1,5});
        System.out.println("Maximum sum of any contiguous sub-array of size K: " + result3);

        int result4 = SWMaxSumSubArrayOfSizeK.findMaxSumSubArray2(3, new int[] {2,1,5,1,3,2});
        System.out.println("Maximum sum of any contiguous sub-array of size K: " + result4);

    }
}
