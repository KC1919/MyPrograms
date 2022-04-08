class Solution {
    public int threeSumClosest(int[] a, int target) {
        Arrays.sort(a);
        
        int max=Integer.MIN_VALUE, close=Integer.MAX_VALUE;
        
        //have to go till array length-2 because we have to form triplets
        for(int i=0;i<a.length-2;i++)
        {
            if(i>0 && a[i]==a[i-1])
                continue;
            
            int comp=target-a[i];
            
                //getting target or closest to the target two sum
                int res=twoSum(a,i+1,a.length-1,comp);
                int fres=res+a[i];  //adding current element to make three sum(triplet)
                
                if(fres==target)  //if the triplet is equal to the target we return
                    return fres;
                
                else   //else we store the triplet sum that is closest to the target
                {
                    if(Math.abs(target-fres)<close)  //checking closeness by finding the absolute difference between the triplet sum and target
                    {
    	                close=Math.abs(target-fres);
    	                max=fres;   //storing the triplet sum
	                }
	                
	                //if two triplet sum occurrs with equal closeness to the target, then we take the sum which is gretaer in value
    	            else if(close==Math.abs(target-fres) && fres>max)
    	                max=fres;
                }
        }
        return max;
    }
    
    public int twoSum(int a[], int start, int end, int target)
	{
	    int diff=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    
	    while(start<end)
	    {
	        int sum=a[start]+a[end];
	        
	        if(sum==target)
	            return sum;
	        
	        //cheking the closeness of the sum formed to the target, if we get sum that is more closer to the target we store that sum and diff
	        if(Math.abs(target-sum)<=diff)
	        {
	            if(Math.abs(target-sum)<diff){
	                diff=Math.abs(target-sum);
	                max=sum;
	            }
	            
	            //is more than two sum occurrs with equal closeness to the target we take the one which is greter in value
	            else if(diff==Math.abs(target-sum) && sum>max)
	                max=sum;
	        }
	        
	        //normal index moving to get closer to the sum
	        
	        if(sum<target)
	            start++;
	        
	        
	        else if(sum>target)
	            end--;
	    }
	    return max;
    }
}