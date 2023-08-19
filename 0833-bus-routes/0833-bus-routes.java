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

        //added the source stop
        que.add(source);

        while(que.size()>0){

            busCount++;

            //number of stops that can be visited
            int size=que.size();

            //exploring all the other stops that can be visited from these stops
            while(size-->0){

                //remove a stop
                int rem=que.remove();

                //check if this stop has been visited earlier
                if(stopVisited[rem]==true){
                    continue;
                }

                //else mark this stop as visited
                stopVisited[rem]=true;

                //checking which all buses pass from this stop
                for(int bus:hm.get(rem)){

                    //we check if the bus has been visited earlier
                    if(busVisited[bus]==false){
                        //mark it as visited
                        busVisited[bus]=true;

                        //we check all the stops to which this bus goes
                        for(int i=0;i<routes[bus].length;i++){
                            
                            //we add those stops to the queue
                            que.add(routes[bus][i]);

                            //and if stop == target stop, then we return the current bus count
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