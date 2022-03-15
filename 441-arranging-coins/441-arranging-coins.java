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
        
        c=(long)Math.pow(mid,2)+mid-(sum*2);
        
        
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