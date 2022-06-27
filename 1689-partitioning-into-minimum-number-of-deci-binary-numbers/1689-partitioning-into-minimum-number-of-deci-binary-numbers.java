class Solution {
    public int minPartitions(String n) {
         int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            int a=Integer.parseInt(String.valueOf(ch));
            if(a>max)
            {
                max=a;
            }
           
        }
        return max;
    }
}