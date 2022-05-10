class Solution {
    public boolean checkInclusion(String t, String s) {
        
        if(t.length()>s.length())
            return false;
        
        HashMap<Character,Integer>tm=new HashMap<>();
        HashMap<Character,Integer>sm=new HashMap<>();
        
        //mapping all the characters with their frequncies
        //of the second string in the map
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        int j=0;
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            //if at any point a character occurs, who is not part of the substring 
            // that needs to be found, we reset the count to 0 and clear the main map
            //because the current window susbtring has become invalid so
            //there is no point to carry those characters forward because the characters
            //need to be consecutive and any invalid character in between would break the
            //sequence hence we discard the whole substring in the current window and 
            //start to look for the substring again.
            if(!tm.containsKey(ch)){
                count=0;
                sm.clear();
                j=i+1;
            }
            
            //we only put characters that are present in the substring whose 
            //permutation needs to be found
            else{
                sm.put(ch,sm.getOrDefault(ch,0)+1);
                
                if(sm.get(ch)<=tm.get(ch)){
                    count++;
                    
                    //if at any point the count of characters become equal to the length
                    //of the string to be found palindrome of, we immediately
                    //return true
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
                        
                        //and check if the frequency is smaller than the required frequency
                        //then we decrement the count of total characters required
                        //to form the permutation string
                        //beacuse all the character counts has to be exactly same as the 
                        //string that needs to be found
                        if(sm.get(rem)<tm.get(rem)){
                            count--;
                        }
                        
                        //if the frequency of a charactr becomes 0 we remove it 
                        //from the main map
                        if(sm.get(rem)==0){
                            sm.remove(rem);
                        }
                        
                        //move to next character, i.e. sliding the window
                        j++;
                    }
                }        
            }
        }
        return false;
    }
}