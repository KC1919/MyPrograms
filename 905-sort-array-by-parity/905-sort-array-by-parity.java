class Solution {
    public int[] sortArrayByParity(int[] a) {
        
        int left=0, right=0;
        int n=a.length;
        
        while(right<n){
            
            //if the current element is even
            if(a[right]%2==0){
                
                //so we check the pointer in the left side of the array
                //to check if the left pointer is pointing to an odd element
                //if yes, then we swap the elements and move the left pointer
                if(a[left]%2!=0){
                    int temp=a[left];
                    a[left]=a[right];
                    a[right]=temp;
                }
                
                //if the left pointer is pointing to an even element the we dont swap we
                //move the left pointer by 1, bcoz we have to swap with odd elements
                //as we need to moveeven elements tot he beginning
                left++;
            }
            
            //if the current element is an odd element then we simply
            //move to the next element as we need to ove the odd eleemnts to the end 
            //if the array
            right++;
        }
        return a;
    }
}