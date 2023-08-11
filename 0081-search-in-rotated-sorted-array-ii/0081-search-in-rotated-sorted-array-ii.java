class Solution {
    public boolean search(int[] a, int target) {
        
        int l=0, h=a.length-1;
        
        while(l<=h){
            int mid=(l+h)/2;

            if(target==a[mid])return true;

            else if(a[l]==a[mid] && a[mid]==a[h]){
                l+=1;
                h-=1;
                continue;
            }

            else if(a[mid]>=a[l]){
                if(target>=a[l] && target<a[mid]){
                    h=mid-1;
                }
                else {
                    l=mid+1;
                }
            }
            else if(a[mid]<=a[h]){
                if(target<=a[h] && target>a[mid]){
                    l=mid+1;
                }
                else {
                    h=mid-1;
                }
            }
        }
        return false;
    }
}