class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int pofit=0;
        for(int i=1;i<prices.length;i++){
            if(bp>prices[i]){
                bp=prices[i];
            }
            pofit=Math.max(pofit,prices[i]-bp);
        }
        return pofit;
        
    }
}