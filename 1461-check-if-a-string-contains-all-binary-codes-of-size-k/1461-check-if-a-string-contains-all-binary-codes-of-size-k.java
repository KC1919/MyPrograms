class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        //total number of binary codes of length  k = 2^k
        int total=(int)Math.pow(2,k);
        
        //to store all the binary codes of length k
        HashSet<String>hm=new HashSet<>();
        
        StringBuilder sb=new StringBuilder();
        
        int i=0, j=0;
        
        
        //used the approach of sliding window
        while(i<s.length()){
            
            char ch=s.charAt(i);
            
            //append the character
            sb.append(ch);
            
            //if the length of the binary code string becomes equal to K
            if(sb.length()==k){
                
                //convert to string
                String bcode=sb.toString();
                
                //check if it is present in the hashset, measn if it has previously
                //occurred or not
                if(!hm.contains(bcode)){
                    hm.add(bcode);
                }
                
                //sliding window, means remove the 0th character
                sb.deleteCharAt(0);
                
                //slide the window
                j++;
            }
            
            //if the size of the hashset becomes equal to 2^K ,, means all the binary codes
            //have been found, so we return true
            if(hm.size()==total)
                return true;
            
            //move to the next character
            i++;
        }
        
        if(hm.size()==total)
            return true;
        
        return false;
    }
}