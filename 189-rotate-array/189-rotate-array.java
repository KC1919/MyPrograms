class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        
        if(k==n)
            return;
        
        if(k>n)
        {
            k=k%n;
        }
        
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,nums.length-1);
        reverse(nums,0,n-1);
        
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