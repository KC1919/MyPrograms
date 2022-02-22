class Solution 
{
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0)
            return new ArrayList<>();
        
        // String keys[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        HashMap<Character,String>hm=new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        
        List<String>ans=new ArrayList<>();
        
        generateSeq(digits,hm,ans,new StringBuilder(),0);
        return ans;
    }
    
    public void generateSeq(String digits,HashMap<Character,String>hm, List<String>list, StringBuilder ans, int ind)
    {
        if(ind==digits.length())
        {
            list.add(ans.toString());
            return;
        }
        
        String key=hm.get(digits.charAt(ind));
        
        for(int i=0;i<key.length();i++)
        {
            char ch=key.charAt(i);
            ans.append(ch);
            generateSeq(digits,hm,list,ans,ind+1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}