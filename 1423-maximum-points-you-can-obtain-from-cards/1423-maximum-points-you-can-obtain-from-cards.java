class Solution {
    public int maxScore(int[] cardPoints, int k) {
         int l = cardPoints.length;
        int p=0;
        int t = l-k;
        int es=0,ss=0,tempsum=0,sum=0;

        for (int i = t; i < l; i++) {
            es+=cardPoints[i];
        }
        sum=es;
        int j = l-k;
        int m = 0;
        for (int i = 1; i <=k ; i++) {
            es=es-cardPoints[j];
            ss=ss+cardPoints[m];
            tempsum=es+ss;
            if(tempsum>sum){
                sum=tempsum;
            }
            j++;m++;
        }
        return sum;
    }    
}