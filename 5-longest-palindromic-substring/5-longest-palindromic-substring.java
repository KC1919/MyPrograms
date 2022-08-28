class Solution {
    public String longestPalindrome(String s) {
        int li=-1, ri=-1;
        int max=0;
        
        for(int i=0;i<s.length();i++){
            int res[]=palind(s,i,i);
            
            if(res[0]!=-1 && res[1]!=s.length() && (res[1]-res[0]+1)>max){
                max=res[1]-res[0]+1;
                li=res[0];
                ri=res[1];
            }
        }
        
        for(int i=0;i<s.length();i++){
            int res[]=palind(s,i,i+1);
            
            if(res[0]!=-1 && res[1]!=s.length() && (res[1]-res[0]+1)>max){
                max=res[1]-res[0]+1;
                li=res[0];
                ri=res[1];
            }
        }
        
        return (li!=-1 && ri!=-1)?s.substring(li,ri+1):"";
    }
    
    private int[] palind(String s, int l, int r){
        
        int li=-1, ri=-1;
        
        while(l>=0 && r<s.length()){
            
            if(s.charAt(l)!=s.charAt(r)){
                return new int[]{li,ri};
            }
            
            li=l;
            ri=r;
            
            l--;
            r++;
        }
        
        return new int[]{li,ri};
    }
}