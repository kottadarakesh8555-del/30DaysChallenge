class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int[] arr =new int[nums.length];
        int temp;
        if(nums.length==1){
            System.out.println(Arrays.toString(nums));
        }
        else{
            for(int r=0;r<nums.length;){
                if(nums[r]!=0){
                    temp=nums[r];
                    nums[r]=nums[i];
                    nums[i]=temp;
                    r++;
                    i++;
                }
                else{
                    r++;
                }
            }           
        }
    }
}