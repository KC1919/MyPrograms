class Solution {
    public int findKthLargest(int[] a, int k) {
        
        return quickSelect(a,a.length-k,0,a.length-1);
    }
    
    private int quickSelect(int a[], int k, int lo, int hi){
        
        int pivot=a[hi];
        int pi=partition(a,lo,hi,pivot);
        
        if(pi==k){
            return a[k];
        }
        
        else if(k<pi){
            return quickSelect(a,k,lo,pi-1);
        }
        
        else{
            return quickSelect(a,k,pi+1,hi);
        }
    }
    
    private int partition(int a[], int lo, int hi, int pivot){
        
        int i=lo, j=lo;
        
        while(i<=hi){
            
            if(a[i]>pivot){
                i++;
            }
            
            else{
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                
                i++;
                j++;
            }
        }
        
        return j-1;
    } 
}