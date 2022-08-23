class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        
        Arrays.sort(a);

        List<List<Integer>>res=new ArrayList<>();
        combi(a,0,new ArrayList<>(),res,target,new int[a.length]);
        return res;
    }
    
 
    private void combi(int a[], int idx, List<Integer>list, List<List<Integer>>res, int target, int slots[]){
        
        if(idx==a.length || target==0){
            
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            
            return;
        }
        
        for(int i=idx;i<a.length;i++){
            
            if(i>0 && a[i]==a[i-1] && slots[i-1]==0)
                continue;
            
            if(a[i]<=target){
                list.add(a[i]);
                slots[i]=1;
                combi(a,i+1,list,res,target-a[i],slots);
                slots[i]=0;
                list.remove(list.size()-1);
            }
        }
    }
}