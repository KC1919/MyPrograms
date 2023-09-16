class Solution {
    public String reverseWords(String s) {
        int len = s.length();

        int l = 0;
        int r = len-1;

        // 1. delete the starting and trailing spaces
        while( s.charAt(l) == ' '){
            l++;
        } 

        while(s.charAt(r) == ' '){
            r--;
        }

        // 2. detect and add all words into deque

        Deque<String> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        while(l <= r){
            
            char cur = s.charAt(l);
            if( cur == ' ' && sb.length()!=0){
                deque.addFirst(sb.toString());
                sb.setLength(0);
            }else if (cur!=' '){
                sb.append(cur);
            }

            l++;
        }

        deque.addFirst(sb.toString());

        // 3. take the deque and output the result from last to start
        // System.out.println(deque.peekLast());
        // System.out.println(deque.peekFirst());
        return String.join(" ", deque);
    }
}