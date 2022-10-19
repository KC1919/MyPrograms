class Solution {
    
    class Pair{
        String word;
        int count;
        
        Pair(String word, int count){
            this.word=word;
            this.count=count;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer>hm=new HashMap<>();
        
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if(a.count==b.count){
                return b.word.compareTo(a.word);
            }
            
            else{
                return a.count-b.count;
            }
        });
        
        for(String word:hm.keySet()){
            Pair p=new Pair(word,hm.get(word));
            
            pq.add(p);
            
            if(pq.size()>k){
                pq.remove();
            }
        }
        
        List<String>list=new ArrayList<>();
        
        while(pq.size()>0){
            list.add(0,pq.remove().word);
        }
        
        return list;
    }
}