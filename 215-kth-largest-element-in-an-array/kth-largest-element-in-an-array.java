class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] boxedNums = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boxedNums[i] = nums[i]; // Autoboxing from int to Integer
        }
        List<Integer> copyList=new ArrayList<>(Arrays.asList(boxedNums));
        Collections.sort(copyList, Collections.reverseOrder());
        System.out.println(copyList);
        for(int i=0;i<copyList.size();i++){
            if(i==(k-1)){
                return copyList.get(k-1);
            }
        }
        return 0;
    }
}