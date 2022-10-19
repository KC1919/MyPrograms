class Solution {
    public boolean checkIfPangram(String s) {
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        return hm.size()==26?true:false;
    }
}