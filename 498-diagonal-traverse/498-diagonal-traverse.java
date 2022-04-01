class Solution {
    public int[] findDiagonalOrder(int[][] a) {
        
        List<List<Integer>>list=new ArrayList<>();
        int n=a.length;
        int m=a[0].length;
        
        int size=(n+m)-1;
        
        for(int i=0;i<size;i++)
            list.add(new ArrayList<>());
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                list.get(i+j).add(a[i][j]);
        }
        
        int k=0;
        int ans[]=new int[n*m];
        
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                for(int j=list.get(i).size()-1;j>=0;j--)
                    ans[k++]=list.get(i).get(j);
            }
            else
            {
                for(int j=0;j<list.get(i).size();j++)
                    ans[k++]=list.get(i).get(j);
            }
        }
        return ans;
    }
}