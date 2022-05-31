class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        int total=(int)Math.pow(2,k);
        
        HashSet<String>hm=new HashSet<>();
        
        StringBuilder sb=new StringBuilder();
        
        int i=0, j=0;
        
        while(i<s.length()){
            
            char ch=s.charAt(i);
            sb.append(ch);
            
            if(sb.length()==k){
                
                String bcode=sb.toString();
                
                if(!hm.contains(bcode)){
                    hm.add(bcode);
                }
                
                sb.deleteCharAt(0);
                
                j++;
            }
            
            if(hm.size()==total)
                return true;
            
            i++;
        }
        
        if(hm.size()==total)
            return true;
        
        return false;
    }
}