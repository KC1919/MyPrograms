class Solution {
    public int[] sortArrayByParity(int[] a) 
    {
        int n=a.length;
        int i=0, j=n-1;
        
        while(i<j)
        {
            if(a[i]%2 > a[j]%2)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            
            if(a[i]%2==0)i++;
            if(a[j]%2==1)j--;
        }
        return a;
    }
}