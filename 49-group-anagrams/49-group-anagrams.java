class Solution {
    public List<List<String>> groupAnagrams(String[] s) 
    {
        HashMap<String,Integer>hm=new HashMap<>();
        int k=0;
        for(int i=0;i<s.length;i++)
        {
            char a[]=s[i].toCharArray();
            Arrays.sort(a);
            String ns=new String(a);
            if(!hm.containsKey(ns))
                hm.put(ns,k++);
        }
        List<List<String>>list=new ArrayList<>();
        
        for(int i=0;i<k;i++)
            list.add(new ArrayList<>());
        
        for(int i=0;i<s.length;i++)
        {
            char str[]=s[i].toCharArray();
            Arrays.sort(str);
            String nss=new String(str);
            if(hm.containsKey(nss))
            {
                list.get(hm.get(nss)).add(s[i]);
            }
        }
        return list;
    }
}