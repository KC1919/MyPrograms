class Solution {
    int count=0;
    public int countVowelStrings(int n) {
        char vowels[]={'a','e','i','o','u'};
        count=0;
        combinations(n,0,0,vowels);
        return count;
    }
    
    public void combinations(int n, int idx, int prev, char a[])
    {
        if(idx==n){
            count++;
            return;
        }
        
        for(int i=prev;i<a.length;i++){
            combinations(n,idx+1,i,a);
        }
    }
}