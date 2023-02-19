class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int max = 0;

        while(left < right){
            int maxright = height[right];
            int maxleft = height[left];
            int min = Math.min(maxright,maxleft);
            max = Math.max(max,min*(right - left));
            if(maxleft < maxright){
                left++;
                
            }
            else{
                right--;              
                
            }

        }
        return max;
        
    }
}