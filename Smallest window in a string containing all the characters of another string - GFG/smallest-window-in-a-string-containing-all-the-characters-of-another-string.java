// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String t)
    {
       if(t.length()>s.length())
            return "-1";
        
        HashMap<Character,Integer>sm=new HashMap<>();
        HashMap<Character,Integer>tm=new HashMap<>();
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        int count=0;
        int j=0;
        
        int start=-1, end=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            sm.put(ch,sm.getOrDefault(ch,0)+1);
            
            if(sm.get(ch)==tm.get(ch)){
                count++;
            }
            
            if(count==tm.size()){
                
                if(i-j<min){
                    start=j;
                    end=i;
                    min=end-start;
                }
                
                while(j<=i && count==tm.size()){
                    char rem=s.charAt(j);
                    
                    if(tm.containsKey(rem) && tm.get(rem)==sm.get(rem)){
                        count--;
                    }
                    
                    sm.put(rem,sm.get(rem)-1);
                    if(sm.get(rem)==0){
                        sm.remove(rem);
                    }
                    
                    if(i-j<min){
                        start=j;
                        end=i;
                        min=end-start;
                    }
                    j++;
                }
            }
        }
        
        return (start!=-1 && end!=-1)?s.substring(start,end+1):"-1";
    }
}