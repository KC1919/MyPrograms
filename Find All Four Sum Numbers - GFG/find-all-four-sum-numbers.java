// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int target) {
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(i!=0 && a[i-1]==a[i])
                continue;
            
            ArrayList<ArrayList<Integer>>smallSum=threeSum(a,i+1,a.length-1,target-a[i]);
            
            for(ArrayList<Integer>list:smallSum)
            {
                list.add(0,a[i]);
                res.add(list);
            }
        }
        
        return res;
    }
    
    public ArrayList<ArrayList<Integer>> twoSum(int a[], int si, int ei, int target)
    {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        
        while(si<ei)
        {
            int sum=a[si]+a[ei];
            
            if(sum>target)ei--;
            else if(sum<target)si++;
            
            else
            {
                ArrayList<Integer>temp=new ArrayList<>();
                temp.add(a[si]);
                temp.add(a[ei]);
                
                res.add(temp);    
                si++;
                ei--;
                
                while(si<ei && a[si]==a[si-1])si++;
                while(si<ei && a[ei]==a[ei+1])ei--;
            }
        }
        
        return res;
    }
    
    public ArrayList<ArrayList<Integer>> threeSum(int a[], int si, int ei, int target)
    {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        
        for(int i=si;i<=ei;i++)
        {
            if(i!=si && a[i-1]==a[i])
                continue;
            
            ArrayList<ArrayList<Integer>>smallSum=twoSum(a,i+1,ei,target-a[i]);
            
            for(ArrayList<Integer>list:smallSum)
            {
                list.add(0,a[i]);
                res.add(list);
            }
        }
        
        return res;
    }
}