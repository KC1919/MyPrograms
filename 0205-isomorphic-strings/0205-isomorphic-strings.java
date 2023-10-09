class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character>hm=new HashMap<>();
        HashSet<Character>hs=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(hm.containsKey(ch1)){
                if(hm.get(ch1)!=ch2) return false;
            }
            else{
                if(hs.contains(ch2)) return false;
                hm.put(ch1,ch2);
                hs.add(ch2);
            } 
        }
        return true;
    }
}