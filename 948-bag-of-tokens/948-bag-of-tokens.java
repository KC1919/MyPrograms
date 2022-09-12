class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        
        int n=tokens.length;
        int left=0, right=n-1;
        
        int score=0;
        int max=0;
        
        while(left<=right){
            
            if(tokens[left]<=power){
                power-=tokens[left];
                score++;
                left++;
                max=Math.max(score,max);
            }
            
            else if(score>0){
                power+=tokens[right];
                score--;
                right--;
            }
            
            else
                break;
        }
        
        return max;
    }
}