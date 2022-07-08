class Solution {
    public int minMovesToMakePalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;
        
        char a[]=s.toCharArray();
        
        int count=0;
        
        while(left<right){
            
            if(a[left]!=a[right]){
                int r=right;
                while(a[left]!=a[r])
                   r--;
                
                if(left==r){
                    char temp=a[left];
                    a[left]=a[left+1];
                    a[left+1]=temp;
                    count++;
                    
                    continue;
                }
                
                else{
                    for(int j=r;j<right;j++){
                        char temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                           
                        count++;
                    }
                } 
            }
            left++;
            right--;
        }
        return count;
    }
}