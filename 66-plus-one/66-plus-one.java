class Solution {
    public int[] plusOne(int[] a) {
        int carry=0, rem=0, sum=0, cand=0;
        int i=a.length-1;
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        while(i>=0 || carry!=0)
        {
            if(i>=0)
            {
                cand=a[i];
                if(i==a.length-1)
                    cand+=1;
                    
                i--;
            }
            
            sum=cand;
            
            if(carry!=0)
            {
                sum+=carry;
                carry=0;
            }
            
            rem=sum%10;
            carry=sum/10;
            
            ans.add(rem);
            sum=0;
            cand=0;
        }
        
        Collections.reverse(ans);
        
        int res[]=new int[ans.size()];
        
        for(int j=0;j<res.length;j++)
            res[j]=ans.get(j);
        
        return res;
    }
}