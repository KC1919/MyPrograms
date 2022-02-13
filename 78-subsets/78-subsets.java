class Solution {
    public List<List<Integer>> subsets(int[] a) 
    {
        List<List<Integer>>res=new ArrayList<>();
        choose(a,a.length,0,res,new ArrayList<>());
        return res;
    }
    
    public void choose(int a[], int n, int ind, List<List<Integer>>res, List<Integer>list)
    {
        if(ind==n)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        list.add(a[ind]);
        choose(a,n,ind+1,res,list);
        list.remove(list.size()-1);
        choose(a,n,ind+1,res,list);
    }
}