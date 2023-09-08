class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>list=new ArrayList<>();
            if(i==0)
                list.add(1);
            else{
                List<Integer>rem=res.get(i-1);
                int j=0;
                while(j<i){
                    if(j==0) 
                        list.add(1);

                    else
                        list.add(rem.get(j-1)+rem.get(j));

                    j++;
                }
                list.add(1);
            }
            res.add(list);
        }
        return res;
    }
}