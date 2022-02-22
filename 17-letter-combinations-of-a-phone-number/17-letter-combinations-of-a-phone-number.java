class Solution 
{
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0)
            return new ArrayList<>();
        
        String keys[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>ans=new ArrayList<>();
        
        generateSeq(digits,keys,ans,"",0);
        return ans;
    }
    
    public void generateSeq(String digits, String keys[], List<String>list, String ans, int ind)
    {
        if(ind==digits.length())
        {
            list.add(ans);
            return;
        }
        
        String key=keys[digits.charAt(ind)-'0'-1];
        
        for(int i=0;i<key.length();i++)
        {
            char ch=key.charAt(i);
            generateSeq(digits,keys,list,ans+ch,ind+1);
        }
    }
}