import java.util.*;
class validPar
{
    static Scanner sc=new Scanner(System.in);
    static public boolean isValid(String s) 
    {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i); //we extract each character
            
            if(ch=='(' || ch=='{' || ch=='[') //and check if its an opening paranthesis
            {
                st.push(ch);   //then we push it into the stack
            }
            
            else if(ch==')')  //if there comes a closing paranthesis
            {
                if(st.size()!=0 && st.peek()=='(')  //we check if stack is not empty and the corresponding closing paracthesis should be on the peek
                    st.pop();    //so we pop
                else
                    return false;  //if not, means there is not proper sequence
            }
            else if(ch==']')   //we do this for all the sort of paranthesis
            {
                if(st.size()!=0 && st.peek()=='[')
                    st.pop();
                else
                    return false;
            }
            else if(ch=='}') 
            {
                if(st.size()!=0 && st.peek()=='{')
                    st.pop();
                else
                    return false;
            }
        }
        
        if(st.size()==0) //at the end, if our stack becomes empty, it means all the brackets have been popped out, means there existed a valid sequence
            return true;    //so we return true;
        
        return false; //else we return false;
        
    }
    
    public static void main(String args[])
    {
        System.out.println("enter sequence of brackets: ");
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
        
}