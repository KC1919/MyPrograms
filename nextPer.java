//Q) Next Permutation.

import java.util.*;
class nextPer
{
    static Scanner sc=new Scanner(System.in);
    
    static void permutation(int a[])
    {
        
        int ind=-1;
            
        for(int i=a.length-1;i>0;i--) //we are finding the point from where the next greater number can be generated
        {
            if(a[i]>a[i-1]) //traversing from the beck of the number, if at any point we find a digit which is smaller than its previous digit
            {
                ind=(i-1); //at that point we store the index of the smaller digit
                break;     //and break from the loop
            }
        }
        
        if(ind==-1) //if its -1, it means that we did not get the digit , and all the digits are in descending order, so next greater is not possible
        {
            reverse(0,a.length-1,a); //so we simply reverse the number and return
            //return;
        }
        
        else  //if not -1, that means smaller digit is present, somewhere
        {
            int min=Integer.MAX_VALUE; //we take a min
            int idx=-1;       //we take a variable to store the index of the digit just next greater than the smaller digit which we found earlier
            for(int i=a.length-1;i>ind;i--) //so we again traverse the number from the back, till the smaller digit
            {
                if((a[i]-a[ind])>0 && (a[i]-a[ind])<min) //we keep on checking, if there is any digit present which is,just next greater 
                {                                        //than the smaller digit ,if found
                    min=a[i]-a[ind];
                    idx=i;      //we store its index
                }
            }
            
            int p=a[ind];  //finally we swap te smaller digit ,with the just next greater digit
            a[ind]=a[idx]; //and the greater digit with the smaller digit
            a[idx]=p;
            
            reverse(ind+1,a.length-1,a); //and reverse rest of the digits,after (ind) to makke them ascending, so as to generate just next greater 
            return;                      //number of the initial number passed by the user.
            
        }
        
        
    }
    
    static void reverse(int start, int end,int a[])
    {
        while(start<end)
        {
            int p=a[start];
            a[start]=a[end];
            a[end]=p;
            start++;
            end--;
        }
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        permutation(a);
        
        for(int i=0;i<n;i++)
        System.out.println(a[i]+" ");
    }
}
        