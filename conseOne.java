//Q) Given a binary array, find the maximum number of consecutive 1s in this array. 
 
import java.util.*;
class conseOne
{
    static Scanner sc=new Scanner(System.in);
    
    static int findMaxConsecutiveOnes(int[] a) 
    {
        if(a.length==0)
            return 0;
            
        int k=0,count=0,max=0;
        for(int i=0;i<a.length;i++) //we traverse the array
        {
            if(a[i]==1)  //if at some place we find 1
            {
                k=i;  //we store that index in a variable
                while(k<a.length && a[i]==a[k]) //and we iterate till we keep getting consecutive 1's
                {
                    count++; //we keep incrementing the count
                    k++;     //moving k forward
                }
                max=Math.max(max,count); //then when all the consecutive 1's of a sequence have been counted, we comare the count with the max count
                i=k;                     //if its greater we update the max count, and we move the i to the (kth) index where the while loop finished
                count=0;                 //so that it can continue from there, instead of treversing again the same elements, it traverse from new set
            }                       //of element, and we also reset the count to 0, so that we can store the count of next consecutive sequence of 1's
        }
        return max;   //and finally we return the max count of consecutive 1's
        
    }
    
    static int maxOne(int a[])
    {
        int max=0;
        int count=0;
        
        for(int i=0;i<a.length;i++) //iterating through the array
        {
            if(a[i]==1)      //if we get a '1'
            {
                count++;                 //we increment the count by 1
                max=Math.max(max,count); //and check if the count becomes greater than max count, if so , then we update the max count
            }
            else           //if the there occurs an element other than one
            {
                count=0;  //the we reset the count variable to 0.
            }
            
        }
        
        return max;
    }
    
    
    
    public static void main(String args[])
    {
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        System.out.println(findMaxConsecutiveOnes(a));
        System.out.println(maxOne(a));
    }
    
    
}