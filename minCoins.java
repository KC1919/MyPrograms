//Q) Find minimum no. of coins (Greedy).Coin Change

import java.util.*;
class minCoins
{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Integer> coinChange(int[] coins, int amount) 
    {
        Arrays.sort(coins);  //first we sorted the coins in ascending order
        
        int i=0,j=coins.length-1;
        
        while(i<j)   //then to make the order of coins as descending, we reversed the sorted array of coins
        {
            int p=coins[i];
            coins[i]=coins[j];
            coins[j]=p;
            i++;
            j--;
        }
        
        
        
        int amt=0,k=0,count=0;
        ArrayList<Integer> res=new ArrayList<>();
        
        while(amt!=amount && k<coins.length)  //now we loop till the amount does not become to the target amount,
        {
            if(amt+coins[k]<=amount) //at each step, we check if the amount+(denomination, i.e a[i]) has not exceeded the target amount
            {
                res.add(coins[k]); //adding the coin used to the list
                amt+=coins[k];  //so we add the denomination
                count++;     //and increase the count of coins used
            }
            
            else  //if the amount exceeds the target amount, we dont use that coin, and
            {
                k++;  //we move to the next denomination of lower value, as the coins are in descending order
            }
        }     //this process repeats till, the amount does not becomes equal to the target amount
        
        
        if(amt==amount)  //finally we check if the amount becomes equal to the target amount, we return the count of the coins
            return res;
        
        return new ArrayList<>();   //else we return -1;
        
    }
    public static void main(String args[])
    {
        System.out.println("enter no. of denominations: ");
        int n=sc.nextInt();
        
        System.out.println("enter denominations: ");
        int coins[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
        }
        
        System.out.println("enter target amount: ");
        int amount=sc.nextInt();
        
        System.out.println(coinChange(coins,amount));
    }
}