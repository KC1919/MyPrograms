import java.util.*;
class allPerm
{
    static Scanner sc=new Scanner(System.in);
    
    static void printPermutations(int a[], String ans, boolean freq[]) //uses extra memeory
    {
        if(ans.length()==a.length) //base case if the length of the ans string ecomes euqal to the total number of elements
        {
            System.out.println(ans);  //we print the answer
            return;                   //return back to the place, from where the call was placed
        }
        
        for(int i=0;i<a.length;i++)  //for each call, the loop runs from 0 to n-1     
        {
            if(freq[i]==false)    //and check at every index, if some element has not been picked at ith index
            {
                freq[i]=true;     //it marks it as picked
                printPermutations(a,ans+a[i]+"",freq);  //and add it to the answer string,and make a call to the next level
                freq[i]=false;             //after returning from the call, we mark it as unpicked, so that it can be combined further with other elements
            }
        }
    }
    
    
    static void permutations(int a[],int ind)  //uses no extra memory, Optimal Approach
    {
        if(ind==a.length)
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]);
            }
            System.out.println();
        }
        
        for(int i=ind;i<a.length;i++)
        {
            swap(a,ind,i);         //we are swapping all the element at (ind) index, with every ith index
            permutations(a,ind+1); //the making call to another level, for the next index
            swap(a,ind,i);         //backtrackng the change
        }   
    }
    
    static void swap(int a[],int idx,int ind) //function to swap the elements
    {
        int p=a[idx];
        a[idx]=a[ind];
        a[ind]=p;
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size: ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        boolean freq[]=new boolean[n];
        
        printPermutations(a,"",freq);
        System.out.println();
        permutations(a,0);
    }
}