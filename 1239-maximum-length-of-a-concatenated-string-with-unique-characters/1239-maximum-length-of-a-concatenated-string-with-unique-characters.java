class Solution {
    
    int max=0;
    public int maxLength(List<String> list) {
        
        max=0;
        subsequence(list,0,new ArrayList<>());
        return max;
    }
    
    private void subsequence(List<String>list, int idx, List<String>res)
    {
        if(idx==list.size()){
            if(res.size()>0){
                
                StringBuilder sb=new StringBuilder();
                
                for(String ele:res){
                    sb.append(ele);
                }
                
                if(check(sb.toString())){
                    max=Math.max(max,sb.length());
                }
            }
            return;
        }
        
        //choose
        res.add(list.get(idx));
        subsequence(list,idx+1,res);
        res.remove(res.size()-1);
            
        //don't choose
        subsequence(list,idx+1,res);
    }
    
    
    private boolean check(String s)
    {
        HashSet<Character>hm=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            if(hm.contains(ch)){
                return false;
            }
            
            hm.add(ch);
        }
        
        return true;
    }
}