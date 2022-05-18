class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>>res=new ArrayList<>();
        helper(s,res,new ArrayList<String>());
        return res;
    }
    
    public void helper(String s, List<List<String>>res, List<String> list)
    {
        if(s.length()==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<s.length();i++)
        {
            String rem=s.substring(0,i+1);
            
            if(palindrome(rem))
            {
                list.add(rem);
                helper(s.substring(i+1),res,list);
                list.remove(list.size()-1);
            }
        }
    }
    
    public boolean palindrome(String s)
    {
        int start=0, end=s.length()-1;
        
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;
            
            start++;
            end--;
        }
        return true;
    }
}