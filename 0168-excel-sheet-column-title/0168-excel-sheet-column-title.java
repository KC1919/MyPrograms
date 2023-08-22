class Solution {
    public String convertToTitle(int columnNumber) {
        return getColumnName(columnNumber);
    }

    public String getColumnName(int colNum){

        int quotient  = colNum / 26;
        int remainder = colNum % 26;
        
        StringBuilder res=new StringBuilder();

        if(remainder==0){
            quotient-=1;
            remainder=26;
        }

        if(quotient>26){
            String ans=getColumnName(quotient);
            res.append(ans);
        }

        else if(quotient>0 && quotient<=26){
            char prefix=(char)(quotient-1+'A');
            res.append(prefix);
        }

        String suffix="";

        if(remainder!=0)
            suffix = (char)(remainder-1+'A')+"";


        res.append(suffix);

        return res.toString();
    }   
}