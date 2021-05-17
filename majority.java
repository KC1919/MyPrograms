//Q) Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than (nk/2) times. You may assume that the majority element always exists in the array.

 

import java.util.*;
class majority
{   
    static Scanner sc=new Scanner(System.in);
    static int majorityElement(int[] a)   //brute-force approach, O(n) time and O(n) space
    {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(hm.get(a[i])==null)
                hm.put(a[i],1);
            
            else
                hm.put(a[i],hm.get(a[i])+1);
        }
        
        for (Map.Entry<Integer, Integer> set : hm.entrySet())
        {
            if(set.getValue()>(a.length/2))
                return set.getKey();
        }
            
        return -1;
    }
    
    static int majority(int[] a)   //Boyer-Moore Voting Algorithm   O(n) time and O(1) space
    {
        Integer cand=null;
        int count=0;
        
        for(int i=0;i<a.length;i++) //we traverse thru the array, means all the elements
        {
            if(count==0)    //if the count becomes 0,
            {
                cand=a[i];  //we chnge the candidate to the present element, at ith position
            }
            
            //count+=(a[i]==cand)?1:-1;
              
            if(a[i]==cand)   //if that element, occurred consecutively
            {
                count++;  //we increment the count
            }
            
            else
            {
                count--;  //else if some other element comes, we decrement the count
            }
        }
        
        return cand;  //and finally when all the elements have been visited ,we return the , we got the majority  element
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        int res=majority(a);
        System.out.println("majority element is: "+res);
    }
        
}

//Intuition

/*
 * the intuition behind this approach is that, when we get a candidate in consecutive sequence, we keep incrementing the count,
 * and if there comes any other element, we decrement the count, so if there is an majority element, means its count would be greater than 
 * n/2, so there would be at the end, majority element stored in the candidate variable, because there ae less number of other elements, so they cannot
 * outnumber the majority element , so they can't make its count to 0, but if at some point they are able to make it 0, then again majority element
 * will, occupy the candidtae place, as it occurs maximum number of times, so it can make the count of ither elements to 0, and make its place in 
 * the candidate variable
 */