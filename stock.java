//Q) You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
//day in the future to sell that stock. 
 
import java.util.*;
class stock 
{
    static Scanner sc=new Scanner(System.in);
    
    static public int maxProfit(int[] a) 
    {
        if(a.length==0||a.length==1)
            return 0;
            
        int max=0;      //we take a max variable to store the maximum profit
        int min=a[0];   //now we take the first element as the minimum element 
        for(int i=1;i<a.length;i++) //and start from the 2nd element
        {
            if(a[i]<min)  //now we keep comparing every element from the minimum element, if there is an element less than the minimum
                min=a[i]; //then we update the minimum by that element
            else
                max=Math.max(max,a[i]-min); //else if greater element occure, we calculate the profit
        }
        return max; //and finally return the max ,containing the maximum profit
        
        
    }
    
    public static void main(String args[])
    {
        System.out.println("enter no. of days: ");
        int n=sc.nextInt();
        int prices[]=new int[n];
        System.out.println("enter stock price of each day: ");
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        System.out.println("Max profit: "+maxProfit(prices));
    }
}