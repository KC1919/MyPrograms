class Solution {
    public List<Integer> maxScoreIndices(int[] a) 
    {
        int n=a.length;
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        
        int count=0;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==1)
                count++;
            
            hm.put(i,count);
        }
        
        count=0;
        
        int score[]=new int[n+1];
        int k=0;
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                score[k++]=hm.get(0);
            }
               
            
            else
            {        
                if(a[i-1]==0)
                    count++;
                score[k++]=count+hm.get(i);
            }  
        }
        if(a[n-1]==0)
            count++;
        
        score[k]=count;
        
        int max=0;
        for(int i=0;i<=n;i++)
        {
            // System.out.print(score[i]+" ");
            max=Math.max(score[i],max);
        }
        
        max=Math.max(count,max);
        
        for(int i=0;i<=n;i++)
        {
            if(score[i]==max)
                list.add(i);
        }
        
        return list;
        
    }
}