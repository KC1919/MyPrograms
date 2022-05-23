class Solution {
    public int[][] merge(int[][] a) {
        
        Arrays.sort(a,(b,c)->{
            return b[0]-c[0];
        });
        
        int start=a[0][0];
        int end=a[0][1];
        
        List<int[][]>list=new ArrayList<>();
        
        for(int i=1;i<a.length;i++){
            
            if(a[i][0]<=end){
                end=Math.max(end,a[i][1]);
            }
            
            else{
                list.add(new int[][]{{start,end}});
                
                start=a[i][0];
                end=a[i][1];
            }
        }
        
        int ans[][]=new int[list.size()+1][2];
        
        for(int i=0;i<list.size();i++){
            
            int pair[][]=list.get(i);
            ans[i][0]=pair[0][0];
            ans[i][1]=pair[0][1];
        }
        
        int n=ans.length;
        ans[n-1][0]=start;
        ans[n-1][1]=end;
        
        return ans;
    }
}