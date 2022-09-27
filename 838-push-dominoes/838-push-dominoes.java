class Solution {
    public String pushDominoes(String dominos) {
        
        char a[]=dominos.toCharArray();
        
        int left=0, right=0;
        
        StringBuilder sb=new StringBuilder();
        
        int flag=0;
        
        while(left<a.length){
            
            if(a[left]=='L'){
                
                int temp=left-1;
                while(temp>=0 && a[temp]=='.'){
                    a[temp]='L';
                    temp--;
                }
            }
            
            else if(a[left]=='R'){
                right=left+1;
                while(right<a.length && a[right]=='.'){
                    right++;
                }
                
                if(right==a.length || a[right]==a[left]){
                    int temp=left+1;
                    while(temp<right && a[temp]=='.'){
                        a[temp]='R';
                        temp++;
                    }
                    left=right;
                }
                else{
                    update(a,left,right);
                    left=right+1;
                }
                right=left;
                
                continue;
            }
            
            left++;
            right=left;
        }
        
        for(int i=0;i<a.length;i++){
            sb.append(a[i]);
        }
        
        return sb.toString();
    }
    
    private void update(char a[], int left, int right){
        
        int len=right-left-1;
        
        left++;
        right--;
        
        while(left<right){
            a[left]=a[left-1];
            a[right]=a[right+1];
            left++;
            right--;
        }
    }
}