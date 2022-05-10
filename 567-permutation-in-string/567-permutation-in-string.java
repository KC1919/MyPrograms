class Solution {
    public boolean checkInclusion(String t, String s) {
        
        if(t.length()>s.length())
            return false;
        
        HashMap<Character,Integer>tm=new HashMap<>();
        HashMap<Character,Integer>sm=new HashMap<>();
        
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        int j=0;
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(!tm.containsKey(ch)){
                count=0;
                sm.clear();
                j=i+1;
            }
            else{
                sm.put(ch,sm.getOrDefault(ch,0)+1);
                
                if(sm.get(ch)<=tm.get(ch)){
                    count++;
                    if(count==t.length())
                    return true;
                }
                
                //if the frequency of a character in the crrent window substring
                // exceeds the required frequency
                else if(sm.get(ch)>tm.get(ch)){
                    
                    //then we stat removing the characters from the left of the current
                    // substring, till the frequency is not in range
                    while(j<i && sm.get(ch)>tm.get(ch)){
                        
                        //character to be removed
                        char rem=s.charAt(j);
                        
                        //decrement its frequency from the main map
                        sm.put(rem,sm.get(rem)-1);
                        
                        //and check 
                        if(sm.get(rem)<tm.get(rem)){
                            count--;
                        }
                        if(sm.get(rem)==0){
                            sm.remove(rem);
                        }
                        j++;
                    }
                }        
            }
        }
        return false;
    }
}