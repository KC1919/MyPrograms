class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>>res=new ArrayList<>();
        subsets(nums,0,new ArrayList<>(),res);
        return res;
    }
    
    public void subsets(int a[], int idx, List<Integer>list, List<List<Integer>>res){
        
        if(idx==a.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        subsets(a,idx+1,list,res);
        
        list.add(a[idx]);
        subsets(a,idx+1,list,res);
        list.remove(list.size()-1);
    }
}