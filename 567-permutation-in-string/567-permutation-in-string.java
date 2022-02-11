class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ls1 = s1.length(),ls2 = s2.length();
        for(int i=0;i<ls1;i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<=ls2-ls1;i++){
            String str = s2.substring(i,i+ls1);
            HashMap<Character,Integer> maps2 = new HashMap<>();
            for(int j=0;j<ls1;j++){                
                maps2.put(str.charAt(j),maps2.getOrDefault(str.charAt(j),0)+1);
            }
            if(map.equals(maps2)) return true;            
        }
        return false;
        
    }
}