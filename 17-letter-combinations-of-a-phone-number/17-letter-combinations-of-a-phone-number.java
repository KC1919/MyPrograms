class Solution {
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0)
            return new ArrayList<>();
        
        String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        combinations(digits,0,keys,list,sb);
        return list;
    }
    
    public void combinations(String digits, int idx, String keys[], List<String>list, StringBuilder ans)
    {
        if(idx==digits.length()){
            list.add(ans.toString());
            return;
        }
        char key=digits.charAt(idx);
        
        String keyChars=keys[key-48];
        
        for(int i=0;i<keyChars.length();i++)
        {
            char ch=keyChars.charAt(i);
            ans.append(ch);
            combinations(digits,idx+1,keys,list,ans);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}