public class App {


    public static boolean isMonotonic(int[] nums){
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]) isIncreasing = false;
            if(nums[i] < nums[i+1]) isDecreasing = false;
        }
        
        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) throws Exception {
        
        int[] nums1 = {1,2,2,3};
        int[] nums2 = {6,5,4,4};
        int[] nums3 = {1,3,2};

        System.out.println(isMonotonic(nums1));
        System.out.println(isMonotonic(nums2));
        System.out.println(isMonotonic(nums3));

    }
}
