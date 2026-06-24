public class arraysquestions {

    
    public static boolean repeatedvalues(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }



        
    public static int rotatedsortfinder(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;   // target is in left half
                } else {
                    start = mid + 1; // target is in right half
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // target is in right half
                } else {
                    end = mid - 1;   // target is in left half
                }
            }
        }
        return -1;
    }




    public static int ThreeSum(int[] nums){
        int n = nums.length;
        int Sum[] = new int[n];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k= j+1; k<n; k++){
                    if(i!=j  &&  j!=k  &&  i!=k){
                        if((nums[i] + nums[j]+ nums[k])==0){
                            System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]");
                        }
                    }
                }
            }
        } return 0;

    }






    
    public static void main(String args[]){
        int nums[] = {-1, 0, 1, 2, -1, -4};
        ThreeSum(nums);
        //int nums1[] = {};
        //System.out.println(rotatedsortfinder(nums1, 0));
        //System.out.println(rotatedsortfinder(nums1, 3));
        //int nums2[] = {1};
        //System.out.println(rotatedsortfinder(nums2, 0));
    }
}
