class Solution {
    public int minDeletions(String s) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        
        int freq[]=new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                pq.add(freq[i]);
            }
        }
        
        int count=0;
        
        while(pq.size()>1){
            
            int pop=pq.remove();
            
            if(pop==pq.peek()){
                pop-=1;
                
                if(pop>0)
                    pq.add(pop);
                
                count++;
            }
        }
        
        return count;
    }
}