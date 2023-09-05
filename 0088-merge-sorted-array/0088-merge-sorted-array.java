class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        
        int idx=n+m-1;

        n--;
        m--;

        while(n>=0 && m>=0){
            if(a[m]>b[n]){
                a[idx--]=a[m--];
            }
            else{
                a[idx--]=b[n--];
            }
        }

        while(n>=0) a[idx--]=b[n--];
    }
}