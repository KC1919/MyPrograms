class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        
        if(source == target)return 0;
        
        HashMap<Integer,List<Integer>>hm=new HashMap<>();

        int n=routes.length;

        int max=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<routes[i].length;j++){
                if(!hm.containsKey(routes[i][j])){
                    hm.put(routes[i][j],new ArrayList<>());
                }
                hm.get(routes[i][j]).add(i);
                max=Math.max(max,routes[i][j]);
            }
        }

        Queue<Integer>que=new LinkedList<>();

        boolean busVisited[]=new boolean[n];
        boolean stopVisited[]=new boolean[max+1];
    

        int busCount=0;
        que.add(source);

        while(que.size()>0){

            busCount++;
            int size=que.size();

            while(size-->0){
                int rem=que.remove();

                if(stopVisited[rem]==true){
                    continue;
                }

                stopVisited[rem]=true;

                for(int bus:hm.get(rem)){
                    if(busVisited[bus]==false){
                        busVisited[bus]=true;
                        for(int i=0;i<routes[bus].length;i++){
                            que.add(routes[bus][i]);
                            if(routes[bus][i]==target){
                                return busCount;
                            }
                        }
                    }
                }
            }
        }

        return -1;

    }
}