class Solution {
    public int minSteps(String s, String t) 
    {
        if(s.length()==0|| t.length()==0)
            return 0;
    
        char a[]=s.toCharArray();
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        int count=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                if(hm.get(a[i])!=0)
                    hm.put(a[i],hm.get(a[i])-1);
                
                else
                    count++;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}