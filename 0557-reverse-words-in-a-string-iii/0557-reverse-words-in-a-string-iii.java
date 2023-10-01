class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(ch!=' '){
                temp.append(ch);
            }
            else{
                if(temp.length()>0){
                    String revWord=reverse(temp.toString());
                    sb.append(revWord);
                    temp.setLength(0);
                }
                sb.append(ch);
            }
        }

        sb.append(reverse(temp.toString()));
        return sb.toString();
    }

    private String reverse(String s){

        StringBuilder sb=new StringBuilder(s);

        return sb.reverse().toString();
    }
}