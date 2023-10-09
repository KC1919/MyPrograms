class Solution {
    public boolean wordPattern(String pattern, String s) {

        String a[]=s.split(" ");

        if(a.length!=pattern.length()) return false;
        
        HashMap<Character, String>hm=new HashMap<>();
        HashSet<String>hs=new HashSet<>();


        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String mapWord=a[i];

            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(mapWord)) return false;
            }
            else{
                if(hs.contains(mapWord)) return false;
                hm.put(ch,mapWord);
                hs.add(mapWord);
            }
        }
        return true;
    }
}