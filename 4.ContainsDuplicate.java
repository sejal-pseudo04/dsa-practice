class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int k=i+1;k<nums.length;k++){
                if(nums[i]==nums[k]){
                    return true;
                }
            }
        }
        return false;
    }
}