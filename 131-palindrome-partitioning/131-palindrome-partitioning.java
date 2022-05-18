class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>>res=new ArrayList<>();
        
        palinParti(s,0,s.length()-1,new ArrayList<>(),res);
        return res;
        
    }
    
    public void palinParti(String s, int si, int ei, List<String>list, List<List<String>>res)
    {
        if(si>ei){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=si;i<=ei;i++){
            
            if(isPalin(s,si,i)==true){
                list.add(s.substring(si,i+1));
                palinParti(s,i+1,ei,list,res);
                list.remove(list.size()-1);
            }
        }
    }
    
    public boolean isPalin(String s, int si, int ei){
        
        while(si<=ei){
            if(s.charAt(si)!=s.charAt(ei))
                return false;
            
            si++;
            ei--;
        }
        return true;
    }
}