class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int height1=Math.min(height[left],height[right]);
            int CurrentArea=height1*(right-left);
            if(CurrentArea>area){
                area=CurrentArea;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}