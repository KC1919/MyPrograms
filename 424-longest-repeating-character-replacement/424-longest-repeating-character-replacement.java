class Solution {
    public int characterReplacement(String s, int k) {
        
        if(s==null || s.length()==0)return 0;
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        int j=0;
        int max=0;
        int maxf=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            for(int freq:hm.values())
            {
                maxf=Math.max(freq,maxf);
            }
            
            if((i-j+1)-maxf<=k)
            {
                max=Math.max(max,i-j+1);
            }
            
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