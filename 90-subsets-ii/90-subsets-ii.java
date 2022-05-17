class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        // HashMap<Integer,Integer>hm=new HashMap<>();
        
        // for(int i=0;i<nums.length;i++)
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        
        Arrays.sort(nums);
        
        List<List<Integer>>res=new ArrayList<>();
        
        subsets(nums,0,new ArrayList<>(),res);
        return res;
    }
    
    public void subsets(int a[], int idx, List<Integer>list, List<List<Integer>>res)
    {
        
        if(idx==a.length){
            res.add(new ArrayList<>(list));
            return;
        }
        subsets(a,idx+1,list,res);
        
        // for(int ele:hm.keySet()){
            
            // if(hm.get(ele)>0){
                
        if(idx>=0){
            
            if(idx>0 && a[idx]==a[idx-1]){
                //nothing to do;
            }
            
            else{
                list.add(a[idx]);
                a[idx]=a[idx]-20;
                // hm.put(ele,hm.get(ele)-1);
                subsets(a,idx+1,list,res);
                // hm.put(ele,hm.get(ele)+1);
                list.remove(list.size()-1);
                a[idx]+=20;
            }
        }
        
    }
}