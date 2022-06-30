class Solution {
    public int minMoves2(int[] a) {
        
        Arrays.sort(a);
        
        int start=0,end=a.length-1;
        int sum=0;
        
        while(start<end){
            
            sum+=a[end]-a[start];
            start++;
            end--;
            
        }
        
        return sum;
    }
}