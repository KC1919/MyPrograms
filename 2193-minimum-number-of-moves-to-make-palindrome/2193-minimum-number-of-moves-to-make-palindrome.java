class Solution {
    public int minMovesToMakePalindrome(String str) {
        int n=str.length();
        char[] s=str.toCharArray();
        int lptr=0;
        int rptr=n-1;
        
        int res=0;
        while(lptr<rptr){
            int r=rptr;
            
            //if the left and the right character matches, then nothing to do
            //move both the pointer ahead
            if(s[lptr]==s[r]){
                lptr++;
                rptr--;
                continue;
            }
            
            //if the left and right character mismatch
            //then keep moving the right pointer till any matching character
            //is reached
            while(s[lptr]!=s[r]) r--;
            
            
            //if no matching chracter is found, and the right pointer reached
            //left pointer, that means this charzcter will become the middle 
            //character, since it does not have any pair
            
            //so we swap the character with the character on its right
            if(lptr==r){
                swap(s,lptr,lptr+1);
                
                //increment the count of swaps by 1
                res++;
            }
            else{
                
                //if the matching character is found, we take it to the right
                // pointer, to make corresponding match to the left
                while(r!=rptr){
                    
                    //keep swapping the chracter with its right character
                    //till the right pointer is reached
                    swap(s,r,r+1);
                    r++;
                    
                    //keep incrementing the count of swaps
                    res++;
                }
            }
        }
        return res;
    }
    
    //function to swap the characters
    public void swap(char[] s,int l,int r){
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
    }
}