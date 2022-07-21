class Solution 
{
    public int maxOperations(int[] a, int k) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=a.length;
            
        for(int i=0;i<n;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            int comp=k-a[i];
            
            //if compliment is present in the hashmap
            if(hm.containsKey(comp))
            {
                //get the frequency of the current element
                int freq=hm.get(a[i]);
                
                //get the frequency of the compliment
                int cfreq=hm.get(comp);
                
                //we check if the element and compliment are same
                if(a[i]==comp)
                {
                    //then we check the freq should be greater than 1, to make a pair
                    if(freq>1)
                    {
                        //we increment the count of pair
                        count++;
                        
                        //reduce the frequency by 2
                        hm.put(a[i],freq-2);
                    }
                }
                else
                {
                    //else we check if the current ele freq and comp freq is gretaer than 1
                    //means a pair can be made
                    if(freq>0 && cfreq>0)
                    {
                        //so we increment the count of pairs
                        count++;
                        
                        //and reduce the freq of curr and comp by 1
                        hm.put(a[i],freq-1);
                        hm.put(comp,cfreq-1);
                    }
                }
            }
        }
        return count;
    }
}