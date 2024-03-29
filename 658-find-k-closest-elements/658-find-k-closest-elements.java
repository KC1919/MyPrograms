class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        
        List<Integer>list=new ArrayList<>();
        int idx=findPos(a,x);
        
        int left=idx-1, right=idx;
        int count=0;
        
        while(left>=0 && right<a.length && count<k){
                
            int ldiff=Math.abs(x-a[left]);
            int rdiff=Math.abs(x-a[right]);
                
            if(ldiff<=rdiff){
                list.add(a[left]);
                left--;
            }
                
            else if(rdiff<ldiff){
                list.add(a[right]);
                right++;
            }
            count++;
        }
            
        while(left>=0 && count<k){
            list.add(a[left]);
            left--;
            count++;
        }
            
        while(right<a.length && count<k){
            list.add(a[right]);
            right++;
            count++;
        }
        
        Collections.sort(list);
        
        return list;
    }
    
    private int findPos(int a[], int target){
        
        int l=0, h=a.length-1;
        
        while(l<=h){
            int mid=(l+h)/2;
            
            if(a[mid]<target){
                l=mid+1;
            }
            
            else if(a[mid]>target){
                h=mid-1;
            }
            
            else{
                return mid;
            }
        }
        
        return l;
    }
}