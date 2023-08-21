class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        for(int i=1;i<s.length();i++){

            String str=s.substring(0,i);
            int flag=0;
            int len=str.length();

            for(int j=i;j+str.length()<=s.length();){

                if(s.substring(j,j+str.length()).equals(str)==true){
                    j=j+str.length();
                    len+=str.length();
                }
                else{
                    flag=1;
                    break;
                } 
            }

            System.out.println(len);
            if(flag==0 && len==s.length()){
                return true;
            }
        }
        return false;
    }
}