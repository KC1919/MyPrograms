class Solution {
    public boolean winnerOfGame(String colors) {
        
        int ma=0;
        int mb=0;
        int countA=0;
        int countB=0;

        for(int i=0;i<colors.length();i++){
            char ch=colors.charAt(i);

            if(ch=='A'){
                countB=0;
                countA++;
                if(countA>=3){
                    ma=ma+(countA-2);
                }
            }
            else if(ch=='B'){
                countA=0;
                countB++;
                if(countB>=3){
                    mb=mb+(countB-2);
                }
            }
        }

        return ma>mb?true:false;
    }
}