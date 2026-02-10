class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> Number = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Number.put(nums[i],i);

        } 
        for(int i=0;i<nums.length;i++){
            int wanted = target-nums[i];
            if (Number.containsKey(wanted) && Number.get(wanted) != i)
            {
                return new int []{i,Number.get(wanted)};
            }
        }       
         
         return new int[]{};
        
    }
}