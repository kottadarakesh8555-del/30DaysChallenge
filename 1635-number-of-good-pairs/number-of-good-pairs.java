class Solution {
    public int numIdenticalPairs(int[] nums) {
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    maxCount++;
                }
            }
            ///maxCount=maxCount+count;
        }
        return maxCount;
    }
}