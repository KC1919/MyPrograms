class Solution {

    public int minDeletions(String s) {
        
        HashMap<Character,Integer>hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        Set<Integer>hs=new HashSet<>();

        int count=0;

        for(char key:hm.keySet()){
            int freq=hm.get(key);
            while(freq!=0 && !hs.add(freq)){
                freq--;
                count++;
            }
        }
        return count;
    }
}