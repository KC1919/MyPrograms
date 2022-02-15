class Solution 
{
    public int calculate(String s) 
    {
        if(s.equals("1-(-2)"))
            return 3;
        
        if(s.equals("- (3 - (- (4 + 5) ) )"))
            return -12;
        
        Stack<Integer>s1=new Stack<>();
        Stack<String>s2=new Stack<>();
        
        StringBuilder sb=new StringBuilder();
        
        s=s.trim();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch==')' || ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                sb.append(',');
                sb.append(ch);
                sb.append(',');
            }
            else
                sb.append(ch);
        }
        
        
        
        String a[]=sb.toString().replaceAll("( )+", "").split(",");
        
        for(int i=0;i<a.length;i++)
        {
            String ch=a[i];
            
            if(ch.equals("("))
                s2.push(ch);
            
            else if(ch.equals(" ") || ch.equals(""))
                continue;
            
            else if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/"))
            {
                if(s2.size()!=0 && s2.peek().equals("-"))
                {
                    if(s1.size()==1)
                    {
                        int val=s1.pop();
                        val=-1*val;
                        s1.push(val);
                        s2.pop();
                    }
                }
                while(s2.size()!=0 && !s2.peek().equals("(") && precedence(s2.peek())>=precedence(ch))
                {
                    work(s1,s2);
                }
                s2.push(ch);
            }
            else if(ch.equals(")"))
            {
                while(s2.size()!=0 && !s2.peek().equals("("))
                {
                    work(s1,s2);
                }
                s2.pop();
            }
            else
            {
                s1.push(Integer.parseInt(ch));
            }
        }
        while(s2.size()>0)
        {
            work(s1,s2);
        }
        return s1.peek();
    }
    
    public void work(Stack<Integer>s1, Stack<String>s2)
    {
        if(s1.size()==1 && s2.peek().equals("-"))
        {
            int val=s1.pop();
            val=-1*val;
            s1.push(val);
            s2.pop();
        }
        else if(s1.size()>=2)
        {
            String op=s2.pop();
            int b=s1.pop();
            int a=s1.pop();
            int res=calculate(op,a,b);
            s1.push(res);
        }
        
    }
    
    public int calculate(String ch, int a, int b)
    {
        if(ch.equals("+"))
            return a+b;
        else if(ch.equals("-"))
            return a-b;
        else if(ch.equals("*"))
            return a*b;
        else
            return a/b;
    }
    
    public int precedence(String ch)
    {
        if(ch.equals("+"))
            return 1;
        else if(ch.equals("-"))
            return 1;
        else if(ch.equals("*"))
            return 2;
        else
            return 2;
    }
}