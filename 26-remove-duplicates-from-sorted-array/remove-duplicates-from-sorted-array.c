int removeDuplicates(int* nums, int numsSize) {
    int x=0;
for(int i=0;i<numsSize;i++){
    if(nums[i]!=nums[x]){
        x++;
        nums[x]=nums[i];
    }}
return x+1;

}
