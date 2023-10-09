class Solution {
    public boolean canFinish(int numCourses, int[][] preq) {
    
        int edges=preq.length;

        if(edges==0) return true;
        
        List<List<Integer>>graph=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        
        HashMap<Integer,Integer>hm=new HashMap<>();
    
        for(int i=0;i<edges;i++){
            int src=preq[i][0];
            int nbr=preq[i][1];
            graph.get(src).add(nbr);
            if(!hm.containsKey(src)) hm.put(src,0);
            hm.put(nbr,hm.getOrDefault(nbr,0)+1);
        }

        Queue<Integer>que=new LinkedList<>();

        for(int key:hm.keySet()){
            if(hm.get(key)==0) {
                que.add(key);
            }
        }

        while(que.size()>0){
            int rem=que.remove();

            for(int nbr:graph.get(rem)){
                hm.put(nbr,hm.get(nbr)-1);
                if(hm.get(nbr)==0){
                    que.add(nbr);
                    hm.remove(nbr);  
                } 
            }
        }

        for(int key:hm.keySet()){
            if(hm.get(key)!=0) {
                return false;
            }
        }

        return true;
    }
}