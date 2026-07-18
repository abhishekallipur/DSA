class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainlist = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> cout = new ArrayList<>();
            for(int j=0; j<=i;j++){
                if(j==0||j==i){
                    cout.add(1);
                }else{
                List<Integer>seccount= mainlist.get(i-1);
                cout.add(seccount.get(j-1)+seccount.get(j));}
            }
            mainlist.add(cout);

        }
        return mainlist;

        
    }
}