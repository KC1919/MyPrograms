class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character>hm=new HashSet<>();
        
        int max=0;
        int j=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(!hm.contains(ch)){
                hm.add(ch);
                max=Math.max(hm.size(),max);
            }
            
            else{
                
                while(hm.contains(ch)){
                    
                    char rem=s.charAt(j);
                    
                    hm.remove(rem);
                    j++;
                }
                
                hm.add(ch);
                
                max=Math.max(max,hm.size());
            }
        }
        return max;
    }
}