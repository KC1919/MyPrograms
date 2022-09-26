class Solution {
    public boolean equationsPossible(String[] a) {
        
        List<HashSet<Integer>>graph=new ArrayList<>();
        
        HashMap<Character,Integer>hm=new HashMap<>();
        int count=0;
        
        for(String s:a){
            
            char c1=s.charAt(0);
            char c2=s.charAt(s.length()-1);
            char s1=s.charAt(1);
            char s2=s.charAt(2);
            
            if(!hm.containsKey(c1)){
                hm.put(c1,count++);
            }
            
            if(!hm.containsKey(c2)){
                hm.put(c2,count++);
            }
        }
        
        for(int i=0;i<hm.size();i++){
            graph.add(new HashSet<>());
        }
        
        for(String s:a){
            
            char c1=s.charAt(0);
            char c2=s.charAt(s.length()-1);
            char s1=s.charAt(1);
            char s2=s.charAt(2);
            
            if(s1==s2){
                int c1Index=hm.get(c1);
                int c2Index=hm.get(c2);
                
                graph.get(c1Index).add(c2Index);
                graph.get(c2Index).add(c1Index);
            }
        }
        
        System.out.println(graph);
        
        boolean visited[]=new boolean[hm.size()];
        
        for(String s:a){
            
            char c1=s.charAt(0);
            char c2=s.charAt(s.length()-1);
            char s1=s.charAt(1);
            char s2=s.charAt(2);
            
            if(s1!=s2 && hasPath(graph,hm.get(c1),hm.get(c2),visited,new HashMap<>())){
                return false;
            }
        }
        return true;
    }
    
    private boolean hasPath(List<HashSet<Integer>>graph, int src, int dst, boolean visited[], HashMap<Integer,HashSet<Integer>>path)
    {
        if(src==dst){
            return true;
        }
        
        if(graph.get(src).contains(dst) || (path.containsKey(src) && path.get(src).contains(dst))){
            return true;
        }
        
        visited[src]=true;
        
        for(int nbr:graph.get(src)){
            if(visited[nbr]==false){
                boolean res=hasPath(graph,nbr,dst,visited,path);
                
                if(!path.containsKey(src)){
                    path.put(src,new HashSet<>());
                }
                
                if(res){
                    path.get(src).add(dst);
                    visited[src]=false;
                    return true;
                }
            }
        }
        
        visited[src]=false;
        
        return false;
    }
}