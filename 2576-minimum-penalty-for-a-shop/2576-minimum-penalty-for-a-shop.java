class Solution {
    public int bestClosingTime(String customers) {
        
        int n=customers.length();

        int pair[][]=new int[n+1][2];

        int zcount=0;

        if(customers.charAt(0)=='N') zcount++;

        for(int i=1;i<n;i++){
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

        if(customers.charAt(n-1)=='Y'){
            ocount++;
            pair[n-1][1]=ocount;
        } 

        // System.out.println(ocount);

        for(int i=n-2;i>=0;i--){
            if(customers.charAt(i)=='Y'){
                ocount++;
                pair[i][1]=ocount;
            }
            else{
                pair[i][1]=pair[i+1][1];
            }
        }
        
        // System.out.println(ocount+"-"+pair[0][1]+"-"+pair[n-1][1]);
        
        int ans[]=new int[n];

        int min=Integer.MAX_VALUE;
        int idx=-1;

        for(int i=0;i<n;i++){
            ans[i]=pair[i][0]+pair[i][1];

            System.out.println(ans[i]+"-"+i);
            if(ans[i]<min){
                min=ans[i];
                idx=i;
            }
        }

        if((pair[n][0]+pair[n][1])<min){
            return n;
        }

        // System.out.println(pair[n-1][0]+"-"+pair[n-1][1]+"-"+idx+"-"+(n-1));

        // if(idx==n-1 && pair[n-1][1]==1) return idx+1;

        return idx;
    }
}