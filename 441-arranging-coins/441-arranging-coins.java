class Solution {
    public int arrangeCoins(int n) {
        
      long l=1, h=n;
      
      long c=0;
      long sum=n;
      long mid=0;
      long val=Integer.MIN_VALUE;
      
      while(l<=h)
      {
        mid=(l+h)/2;
        
        c=(long)((mid*(mid+1))/2-sum);
        
        
        if(c==0){
          val=Math.max(mid,val);
          break;
        }
        
        else if(c>0)
        {
          h=mid-1;
        }
        
        else if(c<0)
        {
          val=Math.max(mid,val);
          l=mid+1;
        }
      }
      return (int)val==Integer.MIN_VALUE?0:(int)val;
    }
}