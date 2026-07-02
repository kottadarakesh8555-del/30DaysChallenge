class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> li=new HashSet<>();
        //for outerloop to keep track of i 
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 &&  nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    li.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    //li.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
            }
        }
        List<List<Integer>> lli=new ArrayList<>(li);
        return lli;
    }
}