class Solution {
    public boolean find132pattern(int[] nums) {
        
        Stack<Integer> st = new Stack<>();
        
        int thirdElement = Integer.MIN_VALUE;
        
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[i] < thirdElement) return true;
            
            while(!st.isEmpty() && st.peek() < nums[i]) 
                thirdElement = st.pop();
            
            st.push(nums[i]);
        }
        return false;
    }
}

//thirdElement is storing the value that is being popped by the 2nd element, means the stack is taking care of the 2nd and 3rd value.

// We only need to check, if the current value( 1st value) is smaller than the third value. That will mean the pattern is satisfied.

//Because the 3rd value will have valid value means there had been some greater element(2nd) who must have popped the 3rd value from the stack.