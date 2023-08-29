class Solution {
    public int bestClosingTime(String customers) {
        
        int n=customers.length();

        int pair[][]=new int[n+1][2];

        int zcount=0;

        // if(customers.charAt(0)=='N') zcount++;

        for(int i=0;i<n;i++){
            if(customers.charAt(i)=='N'){
                pair[i][0]=zcount;
                zcount++;
            }
            else{
                pair[i][0]=zcount;
            }
        }

        pair[n][0]=zcount;

        int ocount=0;

        for(int i=n-1;i>=0;i--){
            if(customers.charAt(i)=='Y'){
                ocount++;
                pair[i][1]=ocount;
            }
            else{
                pair[i][1]=pair[i+1][1];
            }
        }
        
        int min=Integer.MAX_VALUE;
        int idx=-1;

        for(int i=0;i<n;i++){
            int penality=pair[i][0]+pair[i][1];

            if(penality<min){
                min=penality;
                idx=i;
            }
        }

        if((pair[n][0]+pair[n][1])<min) return n;

        return idx;
    }
}