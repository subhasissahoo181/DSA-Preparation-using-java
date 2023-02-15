
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;       
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
           arr[i] =1;
        }
         int prefix=1 ;
        int postfix =1;
        for(int  i=0; i<n; i++){
            
            arr[i] = arr[i] * prefix;
            prefix = prefix * nums[i];
            arr[n-i-1]= arr[n-i-1] * postfix;
            postfix=postfix * nums[n-i-1];
           
        }
        return arr;
        
    }
}
