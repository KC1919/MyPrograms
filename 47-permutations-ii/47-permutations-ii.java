class Solution {
    public List<List<Integer>> permuteUnique(int[] a) 
    {
        List<List<Integer>>res=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        
        List<Integer>list=new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
            list.add(0);
        
        permutations(a,list,res,0,hm);
        return res;
    }
    
    public void permutations(int a[], List<Integer>list, List<List<Integer>>res, int idx, HashMap<Integer,Integer>hm)
    {
        if(idx==a.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int ele:hm.keySet())
        {
            if(hm.get(ele)>0)
            {
                list.set(idx,ele);
                hm.put(ele,hm.get(ele)-1);
                permutations(a,list,res,idx+1,hm);
                hm.put(ele,hm.get(ele)+1);
                list.set(idx,null);
            }
        }
    }
}