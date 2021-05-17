//Q) 3. Find the element that appears once in sorted array, and rest element appears twice (Binary search) .

import java.util.*;
class appOnce
{
    static Scanner sc=new Scanner(System.in);
    
    static int findOnce(int a[], int n)   //brute force approach TC=O(n)
    {
        if(a.length==1)
            return a[0];
        
        for(int i=0;i<a.length-1;i+=2)
        {
            if(a[i]==a[i+1])
                continue;
            
            else
                return a[i];
        }
        return a[a.length-1];   
    }
    
    static int find(int a[])  //optimal approach TC=O(log n)  binary search approach
    {
        int l=0,h=a.length-1;
        
        while(l<h)
        {
            int mid=(l+h)/2;
            
            if(mid%2==0) //we check if the mid is (even),which means there would be (odd) number of elements from start till the mid
            {
                if(mid!=0 && a[mid]==a[mid-1]) //if it matches with the element just before it, that means among the odd no. of elements on the left
                {                              //everyone could not be paired,so the single element lies on the left of the mid only
                    h=mid;            //so we change the high to mid
                }
                
                else if(mid!=0 && a[mid]==a[mid+1]) //if the element at mid+1 is equal to mid,which means the single element is on the right of mid
                {
                    l=mid+1;   //so we change the low to mid+1
                }
                else
                    return a[mid];
            }
            
            else     //but if the mid is odd,which means there would be even number of elements,either side of the mid
            {
                if(mid!=0 && a[mid]==a[mid-1]) //so we check if the mid-1 is equal to mid,which means all would be paired on left of the mid,since
                {                              //there are even no. of elements    
                    l=mid+1;                   //so we change our low to mid+1
                }
                else if(mid!=0 && a[mid]==a[mid+1]) //we check if the mid+1 elements is equal to mid
                {
                    h=mid;                      //then we change out high to mid
                }
                else
                    return a[mid];          //return element at mid
            }
        }
        return a[a.length-1];
        
    }
    
    public static void main(String args[])
    {
        System.out.println("enter no. of elements: ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        System.out.println("enter elements: ");
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println(find(a));
    }
}