class Solution {
    List<List<Integer>> list1 = new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i==0 || nums[i-1] != nums[i]){
                twoSumSorted(i+1,n-1,nums,0-nums[i]);
            }
        }
        return list1;
        
    }
    void twoSumSorted(int i, int j, int[] nums, int target){
        
        int a = nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                List<Integer> list2 = new ArrayList();
                list2.add(a);list2.add(nums[i]);list2.add(nums[j]);
                               

                list1.add(list2);

                while(i<j && nums[i] == nums[i+1]){
                    i++;
                }
                while(i<j && nums[j]==nums[j-1]){
                    j--;
                }
                i++;
                j--;
            }
        }
    }
    
}