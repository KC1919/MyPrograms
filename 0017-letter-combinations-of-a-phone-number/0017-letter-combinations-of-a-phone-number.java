class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length()==0) return new ArrayList<>();

        String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String>res=new ArrayList<>();
        combinations(digits,0,new StringBuilder(),res,keys);
        return res;
    }

    public void combinations(String digits, int idx, StringBuilder sb, List<String>res, String keys[]){

        if(idx==digits.length()){
            if(sb.length()==digits.length()){
                res.add(new StringBuilder(sb).toString());
            }
            return;
        }

        char key=digits.charAt(idx);
        int numKey=key-48;
        String letters=keys[numKey];

        for(int i=0;i<letters.length();i++){
            sb.append(letters.charAt(i));
            combinations(digits,idx+1,sb,res,keys);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}