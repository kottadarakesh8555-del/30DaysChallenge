class Solution {
    public void moveZeroes(int[] nums) {
        int j=1;
        int temp=0;
        for(int i=0;j<nums.length;){
            if(nums[i]==0 && nums[j]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if(nums[i]!=0){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}