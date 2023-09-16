class Solution {
    public String reverseWords(String s) {
        
        String a[]=s.replaceAll("( )+"," ").trim().split(" ");

        StringBuilder sb=new StringBuilder();

        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]+" ");
        }

        return sb.toString().substring(0, sb.length()-1);
    }
}