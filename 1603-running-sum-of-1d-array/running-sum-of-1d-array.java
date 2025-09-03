class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        int sum=nums[0];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=sum+nums[i];
            arr[i]=sum;
        }
        return arr;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=0;j<=i;j++){
        //         sum=sum+nums[j];
        //     }
        //     arr[i]=sum;
        // }
        // return arr;
    }
}