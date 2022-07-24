class Solution {
    public int minMoves2(int[] a) {
        
        Arrays.sort(a);
        int n=a.length;
        int left=0, right=n-1;
        int sum=0;
        
        while(left<=right){
            sum+=Math.abs(a[left]-a[right]);
            left++;
            right--;
        }
        
        return sum;
    }
}