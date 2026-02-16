class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mp=m-1;
        int np=n-1;
        int pp=m+n-1;
        while ( np>=0){
            if(mp>=0&&nums1[mp]>nums2[np]){
                nums1[pp]=nums1[mp];
                mp--;

            }
            else{
                nums1[pp]=nums2[np];
                np--;

            }
            pp--;
        }
        
    }
}