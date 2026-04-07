class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numtabe = new HashSet<>();
        int last = nums.length -1;
        for(int i=0;i<=last;i++){
            if(numtabe.contains(nums[i])){
                return true;
            }
            else{
                numtabe.add(nums[i]);
            }
        }
        return false;
        
    }
}