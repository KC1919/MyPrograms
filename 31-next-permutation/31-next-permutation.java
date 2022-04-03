class Solution {
    public void nextPermutation(int[] a) 
    {
        int ind=-1;
        
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]>a[i-1])
            {
                ind=i-1;
                break;
            }
        }
        
        if(ind==-1){
            reverse(a,0,a.length-1);
            return;
        }
        
        int idx=-1, min=Integer.MAX_VALUE;
        
        for(int i=a.length-1;i>ind;i--)
        {
            if(a[i]>a[ind])
            {
                idx=i;
                break;
            }
        }
        int temp=a[ind];
        a[ind]=a[idx];
        a[idx]=temp;
        
        reverse(a,ind+1,a.length-1);
    }
    
    public void reverse(int a[], int start, int end)
    {
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}