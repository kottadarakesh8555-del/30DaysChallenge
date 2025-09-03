class Solution {
    public int maxSubArray(int[] nums) {
        // int n=nums.length-1;
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int i=0;
        while(nums.length-1>=i){
            currSum+=nums[i];
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0){// whenever our currsum exceeds and going to -ve we are setting that to 0
                currSum=0;
            }
            // currSum=Math.max(nums[i],currSum+nums[i]);
            // maxSum=Math.max(maxSum,currSum);
            i++;
        } 
        return maxSum;
    }
}