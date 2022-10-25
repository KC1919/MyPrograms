class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character,Integer>tm=new HashMap<>();
        
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        int count=0;
        int si=-1,ei=-1;
        int j=0;
        int minLen=s.length()+1;
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            if(tm.containsKey(ch) && hm.get(ch)<=tm.get(ch)){
                count++;
            }
            
            while(j<s.length() && count==t.length()){
                
                if(i-j+1<minLen){
                    si=j;
                    ei=i;
                    minLen=i-j+1;
                }
                
                char rem=s.charAt(j);
                
                hm.put(rem,hm.get(rem)-1);
                
                if(tm.containsKey(rem) && hm.get(rem) < tm.get(rem)){
                    count--;
                }
                
                if(hm.get(rem)==0){
                    hm.remove(rem);
                }
                
                j++;
            }
        }
        
        return si==-1 || ei==-1?"":s.substring(si,ei+1);
    }
}