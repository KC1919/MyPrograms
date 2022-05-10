class Solution {
    public String minWindow(String s, String t) {
        
        if(t.length()>s.length())
            return "";
        
        HashMap<Character,Integer>sm=new HashMap<>();
        HashMap<Character,Integer>tm=new HashMap<>();
        
        
        //first map all the characters of the second string into a hashmap with their
        //frequncies
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        //the count variable helps to keep track if all the characters 
        //of the second string are contained in the subtring of the current window
        int count=0;
        int j=0;
        
        int start=-1, end=-1; //start and end wii store the start and end index of the 
        //smallest substring which contains all the characters of second string
        
        int min=Integer.MAX_VALUE; //this help determine the minimum window size
        
        //now we start from the 1st character of the main string
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            sm.put(ch,sm.getOrDefault(ch,0)+1); //put the chaarcter in the main map
            
            //we chek if the current character is part of the second substring and
            //has frequency less than or equal to that in the second string
            //then we increment the count.
            if(tm.containsKey(ch) && sm.get(ch)<=tm.get(ch)){
                count++;
            }
            
            //if the count becomes equal to the length of the second stirng that means
            //all the characters have come and are present in the current window susbtring
            //so we start to remove the characters till our susbtring is valid
            //to make the window size as small as possible, containing all the characters 
            //of the second string
            while(j<s.length() && count==t.length()){
                
                //we chekc if the window is smaller than the minimum window size, we update 
                //our start and end index and also update the window size
                if((i-j+1)<min){
                    start=j;
                    end=i;
                    min=i-j+1;
                }
                
                //now we remove a character from left(jth index) to reduce the window size
                char rem=s.charAt(j);
                sm.put(rem,sm.get(rem)-1);//reduce its frequency from the main map
                
                //and we check if the character removed is part of the second string
                //and if its frequency has reduced from the required frequncy
                //then we decrement the count
                if(tm.containsKey(rem) && sm.get(rem)<tm.get(rem)){
                    count--;
                }            
                
                //and if any character's frequency has become 0 we remove it from the map
                if(sm.get(rem)==0){
                    sm.remove(rem);
                }
                j++; //move to the next character
            }
        }  
        //in the end if our start and end index are not negative, means valid substring
        //was present, we return that substring
        return (start!=-1 && end!=-1)?s.substring(start,end+1):"";
    }
}