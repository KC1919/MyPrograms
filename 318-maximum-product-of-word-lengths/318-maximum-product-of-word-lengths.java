class Solution {
    public int maxProduct(String[] words) 
    {
        
        int n= words.length;
    int[] bits = new int[n];     // array for holding integer values of words; length equal to Words array
    int result = 0;                         // variable result for storing maximum product or our answer
    
    for(int i=0; i<n; i++)          //take one word
    {
        int num=0;
        for(int j=0; j<words[i].length(); j++)      //itterate through the word
        {
            num = num | 1<< (words[i].charAt(j) - 'a');      
            // we are shifting it by one because 'a'-'a' = 0 that is  0000 in binary 
            // but we want to represent 'a' like 0001 
            // 'b' like 0010 and 
            // 'c' like 0100
        }
        bits[i] = num;          // from index 0 to 26  we set bits to 1 where chracter is presen in string
    }

   
    for(int i=0; i<n; i++) 
    {
        for(int j=i+1; j<n; j++) 
        {
            if((bits[i] & bits[j]) == 0) {
                result = Math.max(words[i].length() * words[j].length(), result);
            }
        }
    }
    return result;
       }
}