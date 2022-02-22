class Solution 
{
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0)
            return new ArrayList<>();
        
        String keys[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>ans=new ArrayList<>();
        
        generateSeq(digits,keys,ans,new StringBuilder(),0);
        return ans;
    }
    
    public void generateSeq(String digits, String keys[], List<String>list, StringBuilder ans, int ind)
    {
        if(ind==digits.length())
        {
            list.add(ans.toString());
            return;
        }
        
        String key=keys[digits.charAt(ind)-'0'-1];
        
        for(int i=0;i<key.length();i++)
        {
            char ch=key.charAt(i);
            ans.append(ch);
            generateSeq(digits,keys,list,ans,ind+1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}