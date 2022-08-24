class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        
        subsetDup(nums,0,new int[nums.length],list,res);
        return res;
    }
    
    private void subsetDup(int a[], int idx, int slots[], List<Integer>list, List<List<Integer>>res){
        
        if(idx==a.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(idx>0 && a[idx]==a[idx-1] && slots[idx-1]==0){
            subsetDup(a,idx+1,slots,list,res);
        }
        
        else{
            slots[idx]=1;
            list.add(a[idx]);
            subsetDup(a,idx+1,slots,list,res);
            list.remove(list.size()-1);
            slots[idx]=0;
            
            subsetDup(a,idx+1,slots,list,res);
        }
    }
}