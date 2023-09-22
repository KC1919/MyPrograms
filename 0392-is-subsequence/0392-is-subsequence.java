class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0)
            return true;

        if(s.length()>t.length())
            return false;

        HashMap<Character, TreeSet<Integer>>hm=new HashMap<>();

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);

            if(!hm.containsKey(ch)){
                hm.put(ch,new TreeSet<>());
            }
            hm.get(ch).add(i);
        }

        int prev=-1, j=0, idx=0;

        System.out.println(hm);

        while(idx<s.length() && j<t.length()){
            char ch=s.charAt(idx);

            if(!hm.containsKey(ch))
                return false;

            int ind=hm.get(ch).pollFirst();

            if(hm.get(ch).size()==0)
                hm.remove(ch);

            if(ind>prev){
                prev=ind;
                idx++;
            }
            j++;
        }
        
        return idx==s.length()?true:false;
    }
}