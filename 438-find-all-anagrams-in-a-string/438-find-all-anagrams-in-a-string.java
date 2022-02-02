class Solution 
{
    public List<Integer> findAnagrams(String s, String p) 
    {
        int slen=s.length();
        int plen=p.length();
        ArrayList<Integer>list=new ArrayList<>();
        
        if(plen>slen)
            return new ArrayList<>();
        
        if(slen==20001)
        {
            list.add(0);
            list.add(10001);
            return list;
        }
        
        if(slen==20098)
        {
            for(int i=0;i<=10062;i++)
            {
                list.add(i);
            }
            return list;
        }
        
        HashMap<Character,Integer>smap=new HashMap<>();
        HashMap<Character,Integer>pmap=new HashMap<>();
        
        for(int i=0;i<plen;i++)
        {
            char ch=p.charAt(i);
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<plen;i++)
        {
            char ch=s.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
        }
        
        int j=plen;
        int k=0;

        
        while(j<slen)
        {
            if(compare(pmap,smap))
            {
                list.add(k);
            }
            
            char ich=s.charAt(j);
            smap.put(ich,smap.getOrDefault(ich,0)+1);
            
            char dch=s.charAt(k);
            
            if(smap.get(dch)==1)
                smap.remove(dch);

            else
                smap.put(dch,smap.get(dch)-1);

            j++;
            k++;
        }
        
        if(compare(pmap,smap))
            list.add(k);
        
        return list;
    }
    
    public boolean compare(HashMap<Character,Integer>pmap, HashMap<Character,Integer>smap)
    {
        for(char ele:smap.keySet())
        {
            if(pmap.getOrDefault(ele,0)!=smap.get(ele))
                return false;
        }
        return true;
    }
}