//Q) Reverse String 
 
import java.util.*;
class revStr
{
    static Scanner sc=new Scanner(System.in);
    
    static public String reverseWords(String s) 
    {
        s=s.trim();
        
        s=s.replaceAll("\\s+"," ");
        
        s=s+" ";
        int k=s.length();
        for(int i=s.length()-2;i>=0;i--)
        {
            char ch=s.charAt(i);
            s=s+ch;
        }
        
        s=s+" ";
        String t="",f="";
        for(int i=k;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                t=ch+t;
            }
            else
            {
                f=f+t+" ";
                t="";
            }
        }
        return f.trim();
    }
    
    static String reverse(String s)
    {
        s=s.trim();
        
        s=s.replaceAll("\\s+"," ");
        String str[]=s.split(" ");
         
        String p="";
        for(int k=str.length-1;k>=0;k--)
        {
            p=p+str[k]+" ";
        }
        return p.trim();
    }
    
    public static void main(String args[])
    {
        System.out.println("enter string: ");
        String s=sc.nextLine();
        //System.out.println(reverseWords(s));
        System.out.println(reverse(s));
    }
}
        