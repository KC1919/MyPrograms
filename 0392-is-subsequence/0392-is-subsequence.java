class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int m=s.length();
        int n=t.length();

        HashMap<Character, TreeSet<Integer>>hm=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch=t.charAt(i);

            if(!hm.containsKey(ch)){
                hm.put(ch,new TreeSet<>());
            }
            hm.get(ch).add(i);
        }

        int prev=-1, j=0, idx=0;

        while(idx<m && j<n){
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

            if(idx==m)
                return true;
        }
        
        return idx==m?true:false;
    }
}