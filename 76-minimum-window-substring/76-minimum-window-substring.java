class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length()<t.length()){
            return "";
        }
        
        HashMap<Character,Integer>sm=new HashMap<>();
        HashMap<Character,Integer>tm=new HashMap<>();
        
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        int count=0, j=0;
        int start=-1, end=-1;
        int min=s.length()+1;
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            sm.put(ch,sm.getOrDefault(ch,0)+1);
            
            if(tm.containsKey(ch) && sm.get(ch)<=tm.get(ch)){
                count++;
            }
            
            if(count==t.length() && i-j+1<min){
                min=Math.min(i-j+1,min);
                start=j;
                end=i;
            }
            
            while(j<=i && count>=t.length()){
                
                char rem=s.charAt(j);
                sm.put(rem,sm.get(rem)-1);
                
                if(tm.containsKey(rem)){
                    if(sm.get(rem)<tm.get(rem)){
                        count--;
                    }
                }
                j++;
                
                if(count==t.length() && i-j+1<min){
                    min=Math.min(i-j+1,min);
                    start=j;
                    end=i;
                }
            }
        }
        return (start!=-1 && end!=-1)?s.substring(start,end+1):"";
    }
}