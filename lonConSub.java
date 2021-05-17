//Q) Length of the Longest Consecutive Subsequence. 


import java.util.*;
class lonConSub
{
    static Scanner sc=new Scanner(System.in);
    
    static int longConseSeq(int[] a) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<a.length;i++) //first we put all the elements in the hashmap, with their corresponding index
        {
            hm.put(a[i],i);
        }
        
        int max=-1;
        
        for(int i=0;i<a.length;i++) //then we iterate through the array
        {
            if(hm.containsKey(a[i]-1)) //for every element we check if, there exist an element, 1 less than the current element 
                continue;     //we do this is to ensure that the current element is not the starting point of the sequence, if there exist an element 
                              //one less than a[i]
            else
            {                  //if the above condition is false, then it means the current element is the starting point of some sequence
                int count=0;  //so we take a counter and initialize it to 0
                while(hm.containsKey(a[i]+count)) //then we start a loop till there are elements consecutive to the element which is starting point of
                {                                 //the sequence
                    ++count;           //till we get, we keep incrementing the count
                }
                max=Math.max(count,max); //and at last, we check if the count has exceeded max count, if so , then we update max by the present count
            }
        }
        if(max<0)
            return 0;
        
        return max;
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        int res=longConseSeq(a);
        System.out.println("Longest consecutive sequence is: "+res);
    }
}