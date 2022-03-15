// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        int j=0;
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(i<k-1){
                hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            }
            
            else
            {
                hm.put(a[i],hm.getOrDefault(a[i],0)+1);
                
                if(i-j+1==k)list.add(hm.size());
                
                if(hm.containsKey(a[j]) && hm.get(a[j])==1)
                hm.remove(a[j]);
                
                else if(hm.containsKey(a[j]))
                hm.put(a[j],hm.get(a[j])-1);
                
                j++;
            }
        }
        
        return list;
    }
}

