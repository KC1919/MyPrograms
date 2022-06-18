// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String s, ArrayList<String> list)
    {
        HashSet<String>hm=new HashSet<>();
        
        Integer dp[]=new Integer[s.length()];
        
        for(String word:list){
            hm.add(word);
        }
        
        return breakWord(s,0,hm,dp);
    }
    
    private static int breakWord(String s, int idx, HashSet<String>hm, Integer dp[]){
        
        if(idx==s.length()){
            return 1;
        }
        
        if(dp[idx]!=null){
            return dp[idx];
        }
        
        for(int i=idx;i<s.length();i++){
            
            String word=s.substring(idx,i+1);
            
            if(hm.contains(word)){
                int res=breakWord(s,i+1,hm,dp);
                if(res==1){
                    dp[i]=1;
                    return 1;
                }
            }
        }
        
        return dp[idx]=0;
    }
}