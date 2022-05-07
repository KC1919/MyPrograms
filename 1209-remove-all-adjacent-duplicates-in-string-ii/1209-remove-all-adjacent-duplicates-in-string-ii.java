class Solution {
    class Pair
    {
        char ch;
        int count;
        
        Pair(char ch,int count)
        {
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) 
    {
        Stack<Pair>st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(st.size()>0 && st.peek().ch==ch){
                st.push(new Pair(ch,st.peek().count+1));
                    
                if(st.peek().count==k){
                    int c=k;
                        
                    while(c>0){
                        st.pop();
                        c--;
                    }
                }
            }
            else
                st.push(new Pair(ch,1));
        }
        StringBuilder sb=new StringBuilder();
        
        while(st.size()>0){
            Pair p=st.pop();    
            sb.insert(0,p.ch);
        }
        return sb.toString();
    }
}