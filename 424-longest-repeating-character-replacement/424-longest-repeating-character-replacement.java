class Solution {
    public int characterReplacement(String s, int k) {
        
        if(s==null || s.length()==0)return 0;
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        int j=0;
        int max=0;
        int maxf=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i); //extracting the charcater
            
            hm.put(ch,hm.getOrDefault(ch,0)+1); //putting the character in the hashmap and
                                                //incrementing its fequency by 1
            
            //if some character has frequency greater than the current max frequency
            //then we update the max frequency of the character in the substring
            maxf=Math.max(maxf,hm.get(ch));
            
            //and check if the difference in the length of the substring and number of 
            //max frequency character is with the range of K, then we update our max length
            //of the substring
            
            if((i-j+1)-maxf<=k)
                max=Math.max(max,i-j+1);
            
            //if the difference is greater than K,then we remove a character from the
            // window of the substring
            else
            {
                char rc=s.charAt(j);
                hm.put(rc,hm.get(rc)-1);
                j++;
            }
        }
        return max;
    }
}