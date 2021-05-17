import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        for(int i=1;i<=5;i++)
        {
            int count=0;
            
            for(int j=5;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=i;k<=i+i-1;k++)
            {
                count=k;
                System.out.print(k+" ");
            }
            
            for(int p=count-1;p>=i;p--)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}