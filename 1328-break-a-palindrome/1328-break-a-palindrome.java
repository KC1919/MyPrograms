class Solution {
    public String breakPalindrome(String s) {
        
        if(s.length()==1){
            return "";
        }
        
        char a[]=s.toCharArray();
        int n=a.length;
        int flag=1;
        int idx=-1;
        
        for(int i=1;i<n;i++){
            if(a[i-1]!=a[i]){
                flag=0;
                idx=i;
                break;
            }
        }
        
        if(flag==1){
            
            if(a[0]=='a'){
                a[n-1]='b';
                return new String(a);
            }
            else{
                a[0]='a';
                return new String(a);
            }
        }
        
        else{
            if(idx==n/2){
                if(a[idx-1]=='a'){
                    a[n-1]='b';
                    return new String(a);
                }
                
                else{
                    a[0]='a';
                    return new String(a);
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(a[i]!='a'){
                a[i]='a';
                break;
            }
        }
        
        return new String(a);
    }
}