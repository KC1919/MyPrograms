class Solution {
    public List<List<Integer>> permuteUnique(int[] a) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(a);
        permutations(a,new ArrayList<>(),0,ans);
        return ans;
    }
    
    public void permutations(int a[], List<Integer>list, int idx, List<List<Integer>>ans){
        
        if(idx==a.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<a.length;i++){
            
                if(i!=0 && a[i-1]==a[i])
                    continue;
                
                else{
                    if(a[i]>=-10){
                        list.add(a[i]);
                        a[i]+=-20;
                        permutations(a,list,idx+1,ans);
                        list.remove(list.size()-1);
                        a[i]+=20;
                    }
                }
        }
    }
}