//Q) Merge 2 sorted arrays.


//1st approach using 3rd array but linear time complexity.
import java.util.*;
class merge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size of the 2 array: ");
        int n=sc.nextInt();
        int a1[]=new int[n];
        int m=sc.nextInt();
        int a2[]=new int[m];
        int a3[]=new int[n+m];
        
        for(int i=0;i<n;i++)                
        a1[i]=sc.nextInt();
        
        
        for(int j=0;j<m;j++)
        a2[j]=sc.nextInt();
        
        int i=0,j=0,c=0;
        
        while(i<n && j<m)
        {
            if(a1[i]<a2[j]) //whichever is smaller we are putting that first, and incrementing the index of smaller element array
            {
                a3[c++]=a1[i];
                i++;
            }
            
            else if(a2[j]<a1[i])
            {
                a3[c++]=a2[j];
                j++;
            }
            
            else if(a1[i]==a2[j])
            {
                a3[c++]=a1[i];
                i++;
                j++;
            }
        }
        
        while(i<n) //loop for the leftover elements if any
        {
            a3[c++]=a1[i];
            i++;
        }
        
        while(j<m)
        {
            a3[c++]=a2[j];
            j++;
        }
        
        for(int k=0;k<a3.length;k++) //finally printing the merged array
        {
            System.out.print(a3[k]+" ");
        }
    }
}
                
        
        
            
    