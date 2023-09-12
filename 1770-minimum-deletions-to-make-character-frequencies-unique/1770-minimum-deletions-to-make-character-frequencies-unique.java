class Solution {

    public int minDeletions(String s) {
        
        HashMap<Character,Integer>hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        Integer a[]=new Integer[hm.size()];

        int idx=0;
        for(char key:hm.keySet()){
            a[idx++]=hm.get(key);
        }

        Arrays.sort(a, Collections.reverseOrder());

        int count=0;

        for(int i=1;i<a.length;i++){
            while(a[i]>=a[i-1]){
                a[i]--;
                count++;
                if(a[i]==0){
                    break;
                }
            }
        }
        return count;
    }
}