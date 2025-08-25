class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        // for(int i=0;i<n-1;i=i+2){
        //     if(nums[i]!=nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return nums[n-1];
        int res=nums[0];
        for(int i=1;i<n;i++){
            res=res^nums[i];
        }
        return res;
        //We can do with set and Xor 2 different approch
    }
}