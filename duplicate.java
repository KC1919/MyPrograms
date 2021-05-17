//Q) Given an array of integers, find if the array contains any duplicates.Your function should return true if any value 
//appears at least twice in the array, and it should return false if every element is distinct. 
 
import java.util.*;
class duplicate
{
    static Scanner sc=new Scanner(System.in);
    
    static boolean duplicate(int a[]) //this function checks for duplicate, using hashmap
    {
        HashMap<Integer,Integer>hm=new HashMap<>(); 
        
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                return true;
            }
            hm.put(a[i],i);
        }
        return false;
    }
    
    static int removeDuplicates(int[] a) //this function removes duplicates from the sorted array
    {
        int k=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                a[k++]=a[i+1];
            }
        }
        return k;
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        int size=removeDuplicates(a);
        
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(duplicate(a));
    }
        
}