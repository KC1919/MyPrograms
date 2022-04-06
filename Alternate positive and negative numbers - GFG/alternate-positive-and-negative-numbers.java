// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int a[], int n) {
        
        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            neg.add(a[i]);
            
            else
            pos.add(a[i]);
        }
        int pc=0, nc=0;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            if(nc<neg.size()){
                
                if(pc==pos.size()){
                    a[i]=neg.get(nc);
                    nc++;
                    flag=1;
                }
                else if(i%2!=0){
                    a[i]=neg.get(nc);
                    nc++;
                    flag=1;
                }
            }
            if(pc<pos.size())
            {
                if(flag==1)
                nc--;
                if(nc==neg.size()){
                    a[i]=pos.get(pc);
                    pc++;
                }
                else if(i%2==0){
                    a[i]=pos.get(pc);
                    pc++;
                }
                if(flag==1)
                nc++;
            }
        }
    }
}