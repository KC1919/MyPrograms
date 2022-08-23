class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        
        Arrays.sort(a);

        List<List<Integer>>res=new ArrayList<>();
        combi(a,0,new ArrayList<>(),res,target);
        return res;
    }
    
 
    private void combi(int a[], int idx, List<Integer>list, List<List<Integer>>res, int target){
        
        if(idx==a.length || target==0){
            
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            
            return;
        }
        
        for(int i=idx;i<a.length;i++){
            
            if(i>idx && a[i]==a[i-1])
                continue;
            
            if(a[i]<=target){
                list.add(a[i]);
                combi(a,i+1,list,res,target-a[i]);
                list.remove(list.size()-1);
            }
        }
    }
}