import java.util.*;
class encodings
{
    
    public static void solve(String s)
    {
       if(s.length()==0)
        return;
        
        String str="";
        int count=1;            //AAABBC
        String a[]=s.split("");
        int i=0;
        for(i=0;i<a.length-1;i++)
        {
            if(a[i].equals(a[i+1]))
            {
                ++count;
            }
            else                                                
            {
                str=str+count+""+a[i]; //str=3A2B
                count=1;
            }
        }
        if(count==1)
        {
            str=str+count+""+a[i];  //3A2B1C
        }
        
        System.out.println(str);
        
        
        //optimized
        
        for(i=0;i<s.length()-1;i++)  //AAABBC
        {
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            
            if(ch==ch1)
            {
                ++count;
            }
            else                                                
            {
                str=str+count+""+Character.toString(ch); //str=3A2B
                count=1;
            }
        }
        
        if(count==1)
        {
            str=str+count+""+Character.toString(s.charAt(i));  //3A2B1C
        }
        System.out.println(str);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        solve(s);
    }
}