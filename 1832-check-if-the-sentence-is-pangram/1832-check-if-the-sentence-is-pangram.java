class Solution {
    public boolean checkIfPangram(String s) {
        
        HashSet<Character>hm=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!hm.contains(ch)){
                hm.add(ch);
            }
        }
        
        return hm.size()==26?true:false;
    }
}