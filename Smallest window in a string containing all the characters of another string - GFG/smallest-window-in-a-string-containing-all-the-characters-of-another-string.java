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
        HashMap<Character,Integer>tm=new HashMap<>();
        
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        int count=0, min=s.length()+1;
        int j=0;
        int start=-1, end=-1;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            if(tm.containsKey(ch) && hm.get(ch)==tm.get(ch)){
                count++;
            }
            
            if(count==tm.size()){
                
                if(i-j<min){
                    min=i-j;
                    start=j;
                    end=i;
                }
                
                while(j<=i && count==tm.size()){
                    char rem=s.charAt(j);
                    
                    if(tm.containsKey(rem) && tm.get(rem)==hm.get(rem)){
                        count--;
                    }
                    
                    hm.put(rem,hm.get(rem)-1);
                    if(hm.get(rem)==0){
                        hm.remove(rem);
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
        if(start==-1 || end==-1){
            return "-1";
        }
        
        return s.substring(start,end+1);
    }
}