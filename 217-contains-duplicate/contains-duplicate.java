class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Integer > numtabe = new HashMap<>();
        int last = nums.length -1;
        for(int i=0;i<=last;i++){
            if(numtabe.containsKey(nums[i])){
                return true;
            }
            else{
                numtabe.put(nums[i],i);
            }
        }
        return false;
        
    }
}