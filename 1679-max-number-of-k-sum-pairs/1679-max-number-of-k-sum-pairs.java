class Solution {
    public int maxOperations(int[] a, int k) {
        
        Arrays.sort(a);
        
        int i=0, j=a.length-1;
        
        int count=0;
        
        while(i<j)
        {
            if(a[i]+a[j]<k)
                i++;
            
            else if(a[i]+a[j]>k)
                j--;
            
            else
            {
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}