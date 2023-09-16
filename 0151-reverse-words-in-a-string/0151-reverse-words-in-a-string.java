class Solution {
    public String reverseWords(String s) {
        
        String a[]=s.replaceAll("( )+"," ").trim().split(" ");

        StringBuilder sb=new StringBuilder();

        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]+" ");
        }

        return sb.toString().substring(0, sb.length()-1);
    }

    // private void reverse(String a[]){

    //     int start=0, end=a.length-1;

    //     while(start<=end){
    //         String t=a[start];
    //         a[start]=a[end];
    //         a[end]=t;
    //         start++;
    //         end--;
    //     }
    // }
}