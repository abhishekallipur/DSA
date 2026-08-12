class Solution {
    public int[] sortedSquares(int[] nums) {
        int saqnums []=new int[nums.length];
        for(int i=0; i<nums.length;i++){
            saqnums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int min = i;
            for(int j=i+1;j<nums.length;j++){
                if(saqnums[min]>saqnums[j]){
                    min = j;
                }}
                int temp = saqnums[i];
                saqnums[i]=saqnums[min];
                saqnums[min]=temp;
            
        }
        return saqnums;

    }
}