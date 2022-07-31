class Solution {
    public int[] searchRange(int[] a, int target) 
    {
        int n=a.length;
        
        if(n==0)
            return new int[]{-1,-1};
        
        int l=0, h=n-1;
        int mid=0;
        
        int fi=findFirstIndex(a,n,target);
        int li=findLastIndex(a,n,target);
        
        return new int[]{fi,li};
    }
    
    public static int findFirstIndex(int a[],int n, int data)
    {
        int l=0, h=n-1;

        int mid=0;

        while(l<=h)
        {
            mid=(l+h)/2;

            if(a[mid]==data){
                if(mid>0 && a[mid-1]==data)
                    h=mid-1;
                else
                    return mid;
            }
            
            else if(data<a[mid])
                h=mid-1;
                
            else if(data>a[mid])
                l=mid+1;
        }
        return -1;
    }
    
    public static int findLastIndex(int a[], int n, int data)
    {
        int l=0, h=n-1;

        int mid=0;

        while(l<=h)
        {
            mid=(l+h)/2;

            if(a[mid]==data){
                if(mid<n-1 && a[mid+1]==data)
                    l=mid+1;
                else
                    return mid;
            }
            
            else if(data<a[mid])
                h=mid-1;
    
            else if(data>a[mid])
                l=mid+1;
        }
        return -1;
    }
}