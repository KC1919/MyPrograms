class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        
        int i=0, j=0;
        
        while(i<a1.length && j<a2.length)
        {
            if(a1[i]<=a2[j])
            {
                list.add(a1[i]);
                i++;
            }
            else if(a1[i]>a2[j])
            {
                list.add(a2[j]);
                j++;
            }
        }
        while(i<a1.length)
        {
            list.add(a1[i++]);
        }
        
        while(j<a2.length)
        {
            list.add(a2[j++]);
        }
        
        double res=0.0;
        
        if(list.size()%2==0)
        {
            res=((list.get(list.size()/2)+list.get((list.size()/2)-1))*1.0)/2;
        }
        else res=list.get(list.size()/2);
        
        return res;
    }
}