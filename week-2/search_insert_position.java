class Solution {
    public int searchInsert(int[] nums, int target) {
      int d=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target)
        {
          d=i;
        }
        if(nums[i]<target)
        {
          d=i+1; ///////
        }
      
      }
      return d;
        
    }
}