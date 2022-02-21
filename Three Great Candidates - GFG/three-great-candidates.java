// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

    
            long ans = new Solution().maxProduct(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long maxProduct(int[] a, int n) 
    {
        if(n==3)
            return a[0]*a[1]*a[2];
            
        int negi=0, posi=0;
        long fm=Integer.MIN_VALUE, sm=Integer.MIN_VALUE, tm=Integer.MIN_VALUE;
        
        long pmax=0, pnmax=0;
        
        long nfm=0, nsm=0, ntm=0;
        
        for(int i=0;i<n;i++){
            if(a[i]<0)negi++;
            else posi++;
        }
        
        if(negi==n || posi==n){
            for(int i=0;i<n;i++){
                if(a[i]>fm){
                    tm=sm;
                    sm=fm;
                    fm=a[i];
                }
                else if(a[i]>sm){
                    tm=sm;
                    sm=a[i];
                }
                else if(a[i]>tm)tm=a[i];
            }
            pmax=fm*sm*tm;
        }
        
        else{
            if(negi>=2){
                for(int i=0;i<n;i++){
                    if(a[i]<0 && Math.abs(a[i])>Math.abs(nfm)){
                        nsm=nfm;
                        nfm=a[i];
                    }
                    else if(a[i]<0 && Math.abs(a[i])>Math.abs(nsm)){
                        nsm=a[i];
                    }
                }
                pnmax=nfm*nsm;
            }
            
            if(posi>=1){
                for(int i=0;i<n;i++){
                    if(a[i]>=0 && a[i]>fm){
                        tm=sm;
                        sm=fm;
                        fm=a[i];
                    }
                    else if(a[i]>=0 && a[i]>sm){
                        tm=sm;
                        sm=a[i];
                    }
                    else if(a[i]>=0 && a[i]>tm){
                        tm=a[i];
                    }
                }
                pnmax*=fm;
            }
        }
        
        if(posi==2 && negi==2){
            pnmax=fm*sm;
        }
        
        else if(posi>2){
            pmax=fm*sm*tm;
        }
        
        return pnmax==0?pmax:Math.max(pnmax,pmax);
    }
}
