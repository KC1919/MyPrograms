class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>>res=new ArrayList<>();
        palinParti(s,0,new ArrayList<>(),res);
        return res;
    }
    
    private void palinParti(String s, int idx, List<String>list, List<List<String>>res){
        
        if(idx==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=idx;i<s.length();i++){
            
            String substr=s.substring(idx,i+1);
            if(isPalin(substr)){
                list.add(substr);
                palinParti(s,i+1,list,res);
                list.remove(list.size()-1);
            }
        }
    }
    
    private boolean isPalin(String s){
        
        int start=0, end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    
}