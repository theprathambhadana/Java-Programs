public class Leetcode {
    public static int maxSubArrayBruteForce(int nums[]) {    //Brute Force
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int n= nums.length;

        for(int i=0; i<n; i++){
            int start=i;
            for(int j=i; j<n; j++){
                int end=j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum+=nums[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        return maxSum;
    } 
}


class Solution {
    public static int maxSubArray(int nums[]) {    //kadane 
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            cs += nums[i];
            ms = Math.max(cs , ms);
            if(cs < 0){
                cs = 0;
            }
        }
        return ms;
    } 
}


class Solution {
    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}