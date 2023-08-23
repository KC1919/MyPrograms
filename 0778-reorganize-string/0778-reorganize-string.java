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
        
        // StringBuilder sb=new StringBuilder();

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

        char a[]=new char[s.length()];

        int i=0;

        Pair p=pq.remove();
        int count=p.count;

        while(count>0){
            a[i]=p.ch;
            i+=2;
            count--;
        }

        // if(i<s.length()){
        //     i++;
        // }

        while(pq.size()>0){

            if(i>=s.length()){
                i=1;
            }
            
            Pair rem=pq.remove();
            int rc=rem.count;
            while(i<s.length() && rc>0){
                a[i]=rem.ch;
                i+=2;
                rc--;

                if(i>=s.length()){
                    i=1;
                }
            }
        }
        return new String(a);
    }
}