class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int slen=s.length();

        for(int i=1;i<=slen/2;i++){

            String str=s.substring(0,i);
            int flag=0;
            int len=str.length();

            if(slen%len!=0) continue;

            for(int j=i;j+str.length()<=slen;){

                if(s.substring(j,j+str.length()).equals(str)==true){
                    j=j+str.length();
                    len+=str.length();
                }
                else{
                    flag=1;
                    break;
                } 
            }
            if(flag==0 && len==slen){
                return true;
            }
        }
        return false;
    }
}