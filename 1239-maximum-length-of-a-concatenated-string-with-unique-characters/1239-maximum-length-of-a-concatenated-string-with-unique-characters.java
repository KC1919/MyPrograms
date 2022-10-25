class Solution {
    
    int max=0;
    public int maxLength(List<String> list) {
        
        max=0;
        subsequence(list,0,new ArrayList<>(),"",new StringBuilder());
        return max;
    }
    
    private void subsequence(List<String>list, int idx, List<String>res, String s, StringBuilder sb)
    {
        if(idx==list.size()){
            if(res.size()>0){
                max=Math.max(max,s.length());
            }
            return;
        }
        
        //choose
        
        if(checko(s) && checko(list.get(idx)) && check(s,list.get(idx))){
            res.add(list.get(idx));
            sb.append(list.get(idx));
            subsequence(list,idx+1,res,sb.toString(),sb);
            res.remove(res.size()-1);
            sb=new StringBuilder(s);
        }
        
            
        //don't choose
        subsequence(list,idx+1,res,s,sb);
    }
    
    
    private boolean check(String s, String t)
    {
        HashSet<Character>hm=new HashSet<>();
        
        for(int i=0;i<t.length();i++){
            
            char ch=t.charAt(i);
            
            hm.add(ch);
        }
        
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.contains(ch)){
                return false;
            }
        }
        return true;
    }
    
    private boolean checko(String s){
        
        HashSet<Character>hm=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            if(hm.contains(ch))
                return false;
            
            hm.add(ch);
        }
        return true;
    }
}