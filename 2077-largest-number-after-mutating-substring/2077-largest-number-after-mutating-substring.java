class Solution {
    public String maximumNumber(String num, int[] change) {

        StringBuilder sb=new StringBuilder();
        int seq=0;
        
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            int changeDigit=change[digit];

            if(changeDigit>digit && seq>=0){
                sb.append(changeDigit);
                seq++;
            }
            else if(changeDigit==digit){
                if(seq>0) seq++;
                sb.append(digit);
            }
            else{
                sb.append(digit);
                if(seq>0) seq=-1;
            }
        }

        return sb.toString();
    }
}