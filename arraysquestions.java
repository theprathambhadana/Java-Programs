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



    public static int rotatedsortfinder(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int nums1[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(rotatedsortfinder(nums1, 0));
        System.out.println(rotatedsortfinder(nums1, 3));
        int nums2[] = {1};
        System.out.println(rotatedsortfinder(nums2, 0));
    }
}
