//Q) Given an integer array of size n, find all elements that appear more than  n/3  times.

import java.util.*; 
class majority_2 
{
    public List<Integer> majorityElement(int[] a) //used the same Boyer-Moore algorith, the diff is only that,we are tracking for 2 elements
    {                                             //because there can be 2 majority element,whose frequency is greater than n/3.
        List<Integer>list=new ArrayList<>();
        
        if(a.length==1)
        {
            list.add(a[0]);
            return list;
        }
            
        int n1=Integer.MIN_VALUE;
        int n2=Integer.MIN_VALUE;
        int c1=0;
        int c2=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n1)  //if the element matches with n1
                c1++;     //we increment its count by 1
            
            else if(a[i]==n2)  //if the element is equal to n2, 
                c2++;      //we increment the count by 1
            
            else if(c1==0) //if the count of one candidate becomes, zero
            {
                n1=a[i];  //we change the candidate
                c1=1;     //and reset the count to 1
            }
            
            else if(c2==0)  //we do same for the 2nd candidate also
            {
                n2=a[i];
                c2=1;
            }
            
            else    //if any other element occures, other than n1 and n2, we decrement count of both the candidates
            {
                c1--;
                c2--;
            }
        }
        
        int f1=0,f2=0;
        for(int i=0;i<a.length;i++)  //now we check that the elements that we have in n1 and n2, whether they are truly majority elements or not
        {
            if(a[i]==n1)   //so we calculate the frequency of each of them
                f1++;
            
            if(a[i]==n2)
                f2++;
        }
        
        int maj=a.length/3;  
        if(f1>maj)     //and check whether they are greater than n/3 or not
            list.add(n1);
        
        if(f2>maj)
            list.add(n2);
            
        return list; //we return the list, containing the majority element
    }
}