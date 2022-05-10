class Solution {
    public String minWindow(String s, String t) {
        
        if(t.length()>s.length())
            return "";
        
        HashMap<Character,Integer>sm=new HashMap<>();
        HashMap<Character,Integer>tm=new HashMap<>();
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        int count=0;
        int j=0;
        
        int start=-1, end=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            sm.put(ch,sm.getOrDefault(ch,0)+1);
            
            if(tm.containsKey(ch) && sm.get(ch)<=tm.get(ch)){
                count++;
            }
            
                
        while(j<s.length() && count==t.length()){
                    
            if((i-j+1)<min){
                start=j;
                end=i;
                min=i-j+1;
            }
            
            char rem=s.charAt(j);
            sm.put(rem,sm.get(rem)-1);
                    
            if(tm.containsKey(rem) && sm.get(rem)<tm.get(rem)){
                count--;
            }            
            if(sm.get(rem)==0){
                sm.remove(rem);
            }
            j++;
        }
    }  
    return (start!=-1 && end!=-1)?s.substring(start,end+1):"";
    }
}