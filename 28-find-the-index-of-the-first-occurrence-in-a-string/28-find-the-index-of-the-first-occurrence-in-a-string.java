class Solution {
    public int strStr(String s, String t) {
        
        if(t.length()>s.length()) return -1;
        
        int si=-1, ei=-1;
        
        // int i=0, j=0;
        
//         while(i<=(s.length()-t.length()+1)){
            
//             if(s.charAt(i)==t.charAt(j)){
                
//                 if(si==-1) si=i;
                
//                 ei=i;
                
//                 j++;
//                 i++;
                
//                 if((ei-si+1)==t.length()) return si;
//             }
            
//             else{
//                 i=si+1;
//                 si=i;
//                 ei=-1;
//                 j=0;
//             }
//         }
        
//         if((ei-si+1)==t.length()) return si;
        
//         return -1;
        
        for(int i=0;i<=s.length()-t.length();i++){
            
            int k=i;
            si=-1;
            ei=-1;
            for(int j=0;j<t.length();j++){
                if(s.charAt(k)==t.charAt(j)){
                    si=si==-1?k:si;
                    ei=k;
                    
                    k++;
                    
                    if(ei-si+1==t.length()){
                        return si;
                    }
                }
                
                else break;
            }
        }
        
        if((ei-si+1)==t.length()) return si;
        
        return -1;
    }
}