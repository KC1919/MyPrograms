class Solution {
    public int slidingPuzzle(int[][] board) {
        Queue<String>que=new LinkedList<>();

        String target="123450";

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                sb.append(board[i][j]);
            }
        }

        String init=sb.toString();

        if(init.equals(target)) return 0;

        que.add(init);

        HashSet<String>vis=new HashSet();

        int swapidx[][]={{1,3},{0,2,4},{1,5},{0,4},{3,1,5},{2,4}};

        int level=0;
        while(que.size()>0){

            int size=que.size();
            int idx=-1;

            // level++;

            while(size-->0){
                String rem=que.remove();

                if(rem.equals(target)){
                    return level;
                }
                
                idx=rem.indexOf('0');
                int swap[]=swapidx[idx];

                for(int i=0;i<swap.length;i++){
                    String tobeadded=swapchar(rem,idx,swap[i]);

                    // if(tobeadded.equals(target)){
                    //     return level;
                    // }

                    if(vis.contains(tobeadded)){
                        continue;
                    }
                    
                    que.add(tobeadded);
                    vis.add(tobeadded);
                }
            }
            level++;
        }
        return -1;
    }

    public String swapchar(String rem, int idx, int swapind){

        StringBuilder sb=new StringBuilder(rem);

        // System.out.println(sb);
        sb.setCharAt(idx, rem.charAt(swapind));
        sb.setCharAt(swapind, rem.charAt(idx));

        // System.out.println(sb);
        return sb.toString();
    }
}