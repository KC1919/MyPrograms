class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>>res=new ArrayList<>();
        boolean picked[]=new boolean[nums.length];
        permutations(nums,picked,new ArrayList<>(),res);
        
        return res;
    }
    
    public void permutations(int a[],boolean picked[], List<Integer>list, List<List<Integer>>res){
        
        if(list.size()==a.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<a.length;i++){
            
            if(picked[i]==false){
                picked[i]=true;
                list.add(a[i]);
                permutations(a,picked,list,res);
                list.remove(list.size()-1);
                picked[i]=false;
            }
        }
    }
}