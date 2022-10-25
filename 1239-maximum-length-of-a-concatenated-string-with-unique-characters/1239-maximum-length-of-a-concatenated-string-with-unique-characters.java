class Solution {
    int max=0;
    public int maxLength(List<String> arr) {
        
        max=0;
        findMax(arr,0,new StringBuilder(),0);
        return max;
    }
    
    private void findMax(List<String>list, int idx, StringBuilder sb, int len){
        
        if(idx==list.size()){
            max=Math.max(max,len);
            return;
        }
        
        // for(int i=idx;i<list.size();i++){
            
            String word=list.get(idx);
            String s=sb.toString();
            
            if(unique(word) && compare(s,word)){
                sb.append(word);
                findMax(list,idx+1,sb,len+word.length());
                sb=new StringBuilder(s);
            }
            
           
            findMax(list,idx+1,sb,len);
            
        // }
    }
    
    private boolean unique(String s){
        
        HashSet<Character>hm=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            if(hm.contains(ch))
                return false;
            
            hm.add(ch);
        }
        return true;
    }
    
    private boolean compare(String s, String t){
        
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
}