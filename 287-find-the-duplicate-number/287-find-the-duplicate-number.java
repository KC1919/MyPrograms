class Solution {
    public int findDuplicate(int[] a) {
        
        while(true){
            int ele=a[0];
            
            if(a[ele]==ele)
                return ele;
            
            a[0]=a[ele];
            a[ele]=ele;
        }
    }
}