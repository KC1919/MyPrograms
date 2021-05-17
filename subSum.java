import java.util.*;
class subSum
{
    static Scanner sc=new Scanner(System.in);
    
    static void subsetSum(int a[],int i,int sum)
    {
        if(i==a.length)    //if the index reaches end of the array, 
        {
            System.out.print(sum+" "); //we print the sum, that we got,after the choice of the elements
            return;                         //we again return back to the call and explore other choices
        }
                                   //the element has two  choice ,they can be the part of the subset or they cannot be the part of the subset
        subsetSum(a,i+1,sum);      //1) element dont want to be the part of the subset
        subsetSum(a,i+1,sum+a[i]); //2) elements wants to be the part of the subset
        
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        subsetSum(a,0,0);
    }
}