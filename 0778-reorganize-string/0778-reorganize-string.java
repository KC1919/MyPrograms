class Solution {

    class Pair{

        char ch;
        int count;

        Pair(char ch, int count){
            this.ch=ch;
            this.count=count;
        }
    }

    public String reorganizeString(String s) {
        
        StringBuilder sb=new StringBuilder();

        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            return b.count-a.count;
        });

        HashMap<Character,Integer>hm=new HashMap<>();

        int maxCount=(s.length()+1)/2;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            hm.put(ch,hm.getOrDefault(ch,0)+1);

            if(hm.get(ch)>maxCount){
                return "";
            }
        }

        for(char key:hm.keySet()){
            pq.add(new Pair(key,hm.get(key)));
        }

        while(pq.size()>=2){
            Pair p1=pq.remove();
            Pair p2=pq.remove();

            sb.append(p1.ch);
            sb.append(p2.ch);

            p1.count=p1.count-1;
            p2.count=p2.count-1;

            if(p1.count>0){
                pq.add(p1);
            }

            if(p2.count>0){
                pq.add(p2);
            }
        }

        if(!pq.isEmpty()){
            sb.append(pq.peek().ch);
        }

        return sb.toString();
    }
}