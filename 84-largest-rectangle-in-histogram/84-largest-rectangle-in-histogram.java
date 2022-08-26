class Solution {
    public int largestRectangleArea(int[] a) {
        
        int n=a.length;
        
        int ls[]=new int[n];
        
        ls[0]=-1;
        
        for(int i=1;i<n;i++){
            
            int j=i-1;
            
            while(j!=-1 && a[i]<=a[j]){
                j=ls[j];
            }
            
            ls[i]=j;
        }
        
        Stack<Integer>st=new Stack<>();
        st.push(n-1);
        
        int max=0;
        
        for(int i=n-1;i>=0;i--){
            
            int j=n;
            while(st.size()>0 && a[i]<=a[st.peek()]){
                st.pop();
            }
            
            if(st.size()!=0){
                j=st.peek();
            }
            
            int wid=(j-ls[i])-1;
            max=Math.max(max,a[i]*wid);
            
            st.push(i);
        }
        
        return max;
    }
}