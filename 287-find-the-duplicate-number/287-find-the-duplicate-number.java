class Solution {
    public int findDuplicate(int[] a) 
    {
        int i=0;
        while(true)
        {
            if(a[0]==a[a[0]])
                return a[0];
            
            int temp=a[0];
            a[0]=a[temp];
            a[temp]=temp;
            
        }
    }
}