// class Solution {
//     public List<Integer> findSubstring(String s, String[] words) {
        
//         List<Integer>list=new ArrayList<>();
        
//         HashMap<String,Integer>wordMap=new HashMap<>();
        
//         for(String word:words){
//             wordMap.put(word,wordMap.getOrDefault(word,0)+1);
//         }
        
//         int len=words[0].length();
//         int tlen=words.length*len;
        
//         int i,j=0;
        
//         for(i=0;i<s.length()-len;){
            
//             String temp=s.substring(i,i+len);
            
//             if(wordMap.containsKey(temp)){
//                 i+=len;
//             }
            
//             else{
//                 i+=len;
//                 j=i;
//             }
            
//             if(i-j==tlen){
                
//                 int flag=0;
//                 String sub=s.substring(j,i);
                
//                 HashMap<String,Integer>hm=new HashMap<>(wordMap);
//                 for(int k=0;k<tlen;k+=len){
//                     String word=sub.substring(k,k+len);
//                     if(hm.containsKey(word)){
//                         hm.put(word,hm.get(word)-1);
//                         if(hm.get(word)==0){
//                             wordMap.remove(word);
//                         }
//                     }
//                     else{
//                         flag=1;
//                         break;
//                     }
//                 }
                
//                 if(flag==0){
//                     list.add(j);
//                 }
//             }
//         }
//         return list;
//     }
// }

class Solution {
    private HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
    private int n;
    private int wordLength;
    private int substringSize;
    private int k;
    
    private void slidingWindow(int left, String s, List<Integer> answer) {
        HashMap<String, Integer> wordsFound = new HashMap<>();
        int wordsUsed = 0;
        boolean excessWord = false;
        
        // Do the same iteration pattern as the previous approach - iterate
        // word_length at a time, and at each iteration we focus on one word
        for (int right = left; right <= n - wordLength; right += wordLength) {
            
            String sub = s.substring(right, right + wordLength);
            if (!wordCount.containsKey(sub)) {
                // Mismatched word - reset the window
                wordsFound.clear();
                wordsUsed = 0;
                excessWord = false;
                left = right + wordLength;
            } else {
                // If we reached max window size or have an excess word
                while (right - left == substringSize || excessWord) {
                    String leftmostWord = s.substring(left, left + wordLength);
                    left += wordLength;
                    wordsFound.put(leftmostWord, wordsFound.get(leftmostWord) - 1);

                    if (wordsFound.get(leftmostWord) >= wordCount.get(leftmostWord)) {
                        // This word was an excess word
                        excessWord = false;
                    } else {
                        // Otherwise we actually needed it
                        wordsUsed--;
                    }
                }
                
                // Keep track of how many times this word occurs in the window
                wordsFound.put(sub, wordsFound.getOrDefault(sub, 0) + 1);
                if (wordsFound.get(sub) <= wordCount.get(sub)) {
                    wordsUsed++;
                } else {
                    // Found too many instances already
                    excessWord = true;
                }
                
                if (wordsUsed == k && !excessWord) {
                    // Found a valid substring
                    answer.add(left);
                }
            }
        }
    }
    
    public List<Integer> findSubstring(String s, String[] words) {
        n = s.length();
        k = words.length;
        wordLength = words[0].length();
        substringSize = wordLength * k;
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < wordLength; i++) {
            slidingWindow(i, s, answer);
        }
        
        return answer;
    }
}