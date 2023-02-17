class Solution {
    public int maxProduct(int[] nums) {
       int ans = nums[0];
        // int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int arr[] = new int[3];
        for(int i=1; i< nums.length; i++){
            arr[0] = nums[i];
            arr[1] = max * nums[i];
            arr[2] = min * nums[i];          
             
            max = Math.max(Math.max(arr[0],arr[1]),arr[2]);
            min = Math.min(Math.min(arr[0],arr[1]),arr[2]);    


            ans = Math.max(ans,max);
          
        }
        
        return ans;
        
    }
}

           