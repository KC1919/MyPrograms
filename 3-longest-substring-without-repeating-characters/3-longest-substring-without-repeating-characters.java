class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer>hm=new HashMap<>();
        int max=0, j=0;
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            if(hm.get(ch)>1){
                
                while(j<=i && hm.get(ch)>1){
                    
                    char rem=s.charAt(j);
                    
                    hm.put(rem,hm.get(rem)-1);
                    j++;
                }
            }
            
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}