public class App {

    /*
        There are some processes that need to be executed. Amount of a load that process causes on a server tha runs it, is being represented by a single
        integer. Total load caused on a server is the sum of the loads of all the processes that run on that server. You have at your disposal two servers, on which mentioned
        processes can be run, Your goal is to distribute given processes between those two servers in the way that, absolute difference of thier loads will be
        minimized.
    */

    public static int findMinimumLoad(int arr[], int i, int sumCalculated, int sumTotal){

        if(i == 0) return Math.abs((sumTotal - sumCalculated) - sumCalculated);

        return Math.min(findMinimumLoad(arr, i - 1, sumCalculated + arr[i -1], sumTotal), findMinimumLoad(arr, i - 1, sumCalculated, sumTotal));

    }


    public static int solution(int arr[]){
        int sumTotal = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            sumTotal += arr[i];
        }

        //compute result using recursive function
        return findMinimumLoad(arr, n, 0, sumTotal);
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,4,5};
        
        //int n = arr.length;

        System.out.println("The minimum absolute difference" + " of server loads is " + solution(arr));
    }
}
