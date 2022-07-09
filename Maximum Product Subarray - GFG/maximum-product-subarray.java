// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] a, int n) {
        if(n==1)
            return a[0];
        
        long oldPrev=a[0];
        long oldCurr=a[0];
        
        long max=a[0];
        
        for(int i=1;i<n;i++){
            
            long newPrev=0;
            long newCurr=0;
            
                
            if(oldPrev<0 && oldCurr<0){
                newPrev=a[i];
                newCurr=Math.min(oldPrev,oldCurr)*a[i];
            }
                
            else{
                
                if(oldPrev==0 || oldCurr==0){
                    newPrev=a[i];
                    newCurr=a[i];
                }
                
                else{
                    newPrev=oldPrev*a[i];
                    newCurr=oldCurr*a[i];
                }
            }
            max=Math.max(max,Math.max(newCurr,newPrev));
            
            oldPrev=newPrev;
            oldCurr=newCurr;
        }
        
        return max;
    }
}