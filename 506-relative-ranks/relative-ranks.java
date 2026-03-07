class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String [] result = new String[n];

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);

        for(int i=0;i<n;i++){
            pq.add(new int[]{score[i],i});
        }
        int res =1;
        while(!pq.isEmpty()){
            int [] current = pq.poll();
            int index = current[1];
            if(res==1){
                result[index]="Gold Medal";
            }
            else if(res==2){
                result[index]="Silver Medal";
            }
            else if(res==3){
                result[index]="Bronze Medal";
            }
            else{
                 result[index] = String.valueOf(res);
            }
            res++;
        }
        return result;



        

        
    }
}