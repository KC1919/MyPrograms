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
        
        for(int i=idx;i<list.size();i++){
            
            String word=list.get(i);
            String s=sb.toString();
            
            if(unique(word) && compare(s,word)){
                sb.append(word);
                findMax(list,i+1,sb,len+word.length());
                sb=new StringBuilder(s);
            }
            
            else{
                findMax(list,i+1,sb,len);
            }
        }
    }
    
    private boolean unique(String s){
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=s.indexOf(ch);
            if(idx!=-1 && idx!=i){
                return false;
            }
        }
        
        return true;
    }
    
    private boolean compare(String s, String t){
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(t.indexOf(ch)!=-1){
                return false;
            }
        }
        return true;
    }
}