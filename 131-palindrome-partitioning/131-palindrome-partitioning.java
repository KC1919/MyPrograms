class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>>res=new ArrayList<>();
        boolean dp[][]=new boolean[s.length()][s.length()];
        
        palinParti(s,0,s.length()-1,new ArrayList<>(),res,dp);
        return res;
        
    }
    
    public void palinParti(String s, int si, int ei, List<String>list, List<List<String>>res,boolean dp[][])
    {
        if(si>ei){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=si;i<=ei;i++){
            
            if(s.charAt(si) == s.charAt(i) && (i - si <= 2 || dp[si + 1][i - 1]==true)){
                dp[si][i]=true;
                list.add(s.substring(si,i+1));
                palinParti(s,i+1,ei,list,res,dp);
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