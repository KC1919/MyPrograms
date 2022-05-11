class Solution {
    int count=0;
    public int countVowelStrings(int n) {
        // char vowels[]={'a','e','i','o','u'};
        // count=0;
        // combinations(n,0,0,vowels);
        // return count;
        
        int a=1,e=1,i=1,o=1,u=1;
        
        for(int j=1;j<n;j++){
            a=a+e+i+o+u;
            e=e+i+o+u;
            i=i+o+u;
            o=o+u;
            u=u;
        }
        return a+e+i+o+u;
    }
    
//     public void combinations(int n, int idx, int prev, char a[])
//     {
//         if(idx==n){
//             count++;
//             return;
//         }
        
//         for(int i=prev;i<a.length;i++){
//             combinations(n,idx+1,i,a);
//         }
//     }
}