class Solution {
    
    public String minRemoveToMakeValid(String s) 
    {
        StringBuilder sb=new StringBuilder();
        
        Stack<Integer>st=new Stack<>();
        
        int cc=0;  //closing count
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch>=97 && ch<=122)
                sb.append(ch);
            
            else if(ch=='('){
                
                st.push(i-cc); 
                sb.append(ch);
            }
            
            else{
                
                if(st.size()>0){
                    
                    st.pop();
                    sb.append(ch);
                }
                    
                else
                    cc++;
            }
        }
        
        if(st.size()!=0)
        {
            if(st.size()+cc==s.length())
                return "";
            
            else
                while(st.size()!=0)
                    sb.deleteCharAt(st.pop());
        }
        return sb.toString();
    }
}