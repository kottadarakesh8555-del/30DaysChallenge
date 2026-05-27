class Solution {
    public void moveZeroes(int[] nums) {
        int r=0;
        int[] arr =new int[nums.length];
        int temp;
        if(nums.length==1){
            System.out.println(Arrays.toString(nums));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[r]=nums[i];
                    r++;
                }
            }
            for(;r<nums.length;r++){
                nums[r]=0;
            }
            System.out.println(Arrays.toString(nums));            
        }
    }
}