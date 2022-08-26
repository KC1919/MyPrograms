class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        ArrayDeque<Integer>que=new ArrayDeque<>();
        int ans[]=new int[nums.length-k+1];
        
        int j=0, idx=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(que.size()>0 && que.peek()<j){
                que.remove();
            }
            
            while(que.size()>0 && nums[que.peekLast()]<=nums[i]){
                que.removeLast();
            }
            
            que.add(i);
            
            if(i-j+1==k){
                ans[idx++]=nums[que.peek()];
                j++;
            }
        }
        
        return ans;
    }
}