class Solution {
    public List<Integer> majorityElement(int[] a) 
    {
        List<Integer>list=new ArrayList<>();
        
        if(a.length==1)
        {
            list.add(a[0]);
            return list;
        }
            
        int cand1=Integer.MIN_VALUE;
        int cand2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==cand1)
                count1++;
            
            else if(a[i]==cand2)
                count2++;
            
            else if(count1==0)
            {
                cand1=a[i];
                count1=1;
            }
            
            else if(count2==0)
            {
                cand2=a[i];
                count2=1;
            }
            
            else
            {
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==cand1)
                count1++;
            
            if(a[i]==cand2)
                count2++;
        }
        
        int maj=a.length/3;
        if(count1>maj)
            list.add(cand1);
        
        if(count2>maj)
            list.add(cand2);
            
        return list;
    }
}