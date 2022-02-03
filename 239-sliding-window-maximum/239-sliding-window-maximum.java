class Solution {
    public int[] maxSlidingWindow(int[] a, int k) 
    {
        
        int n=a.length;
        
        int ans[]=new int[n-k+1];
        int c=0;
        
        Deque<Integer>que=new ArrayDeque<>();
        
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            if(!que.isEmpty() && que.peek()==i-k)
                que.poll();
            
            while(!que.isEmpty() && a[que.peekLast()]<a[i])
            {
                que.pollLast();
            }
            
            que.offer(i);
            if(i>=k-1)
            {
                ans[c++]=a[que.peek()];
            }
        }
        
        return ans;
    }
}