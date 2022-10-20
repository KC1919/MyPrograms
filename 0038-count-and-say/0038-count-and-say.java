class Solution {
    public String countAndSay(int n) {
        return sayLoud(n);
    }
    
    private String sayLoud(int n){
        
        if(n==1){
            return "1";
        }
        
        StringBuilder myRes=new StringBuilder();
        
        String res=sayLoud(n-1);
        
        int count=1;
        char chr=res.charAt(0);
        
        if(res.length()==1){
            myRes.append(count);
            myRes.append(chr);
            return myRes.toString();
        }
        
        char ch='\0';
        
        for(int i=1;i<res.length();i++){
            ch=res.charAt(i);
            
            if(i>0 && ch==res.charAt(i-1)){
                count++;
            }
            
            else{
                myRes.append(count);
                myRes.append(res.charAt(i-1));
                count=1;
            }
        }
        
        myRes.append(count);
        myRes.append(ch);
        
        return myRes.toString();
    }
}