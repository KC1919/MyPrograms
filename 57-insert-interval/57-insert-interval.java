class Solution {
    public int[][] insert(int[][] a, int[] interval) {
        
        if(interval.length==0)
            return a;
        
        int pos=findPos(a,interval[0]);
    
        int n=a.length;
        
        int ans[][]=new int[n+1][2];
        
        for(int i=0;i<pos;i++){
            ans[i][0]=a[i][0];
            ans[i][1]=a[i][1];
        }
        
        ans[pos][0]=interval[0];
        ans[pos][1]=interval[1];
        
        for(int i=pos+1;i<=n;i++){
            ans[i][0]=a[i-1][0];
            ans[i][1]=a[i-1][1];
        }
        
        return mergeInterval(ans);
    }
    
    public int[][] mergeInterval(int a[][]){
        List<int[]>list=new ArrayList<>();
        
        int start=a[0][0];
        int end=a[0][1];
        
        for(int i=1;i<a.length;i++){
            if(a[i][0]<=end){
                end=Math.max(end,a[i][1]);
            }
            
            else{
                
                list.add(new int[]{start,end});
                start=a[i][0];
                end=a[i][1];
            }
        }
        
        list.add(new int[]{start,end});
        
        int ans[][]=new int[list.size()][2];
        
        for(int i=0;i<list.size();i++){
            ans[i][0]=list.get(i)[0];
            ans[i][1]=list.get(i)[1];
        }
        return ans;
    }
    
    public int findPos(int a[][], int target){
        
        int l=0, h=a.length-1;
        
        int mid=-1;
        
        while(l<=h){
            
            mid=(l+h)/2;
            
            if(a[mid][0]<target)
                l=mid+1;
            
            else if(a[mid][0]>target)
                h=mid-1;
            
            else
                return mid;
        }
        return l;
    }
}