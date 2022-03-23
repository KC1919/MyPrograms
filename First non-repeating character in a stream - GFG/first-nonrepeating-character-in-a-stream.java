// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String s)
    {
        HashMap<Character,Integer>hm=new HashMap<>();
		
		Queue<Integer>que=new LinkedList<>();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
		    char ch=s.charAt(i);
		    
		    if(!hm.containsKey(ch)){
		        hm.put(ch,1);
		        que.add(i);
		        sb.append(s.charAt(que.peek()));
		    }
		    
		    else
		    {
		        hm.put(ch,hm.get(ch)+1);
		        
		        
		        if(que.size()>0){
		            
		            if(s.charAt(que.peek())==ch){
		                que.remove();
		                hm.put(ch,hm.get(ch)-1);
		            }
		            
		            while(que.size()>0 && hm.get(s.charAt(que.peek()))>1){
		                    hm.put(s.charAt(que.peek()),hm.get(s.charAt(que.peek()))-1);
		                    que.remove();
		                }
		        }
		        
		        if(que.size()>0)
		            sb.append(s.charAt(que.peek()));
		      
		        else
		            sb.append('#');
		        
		    }
		}
		
		return sb.toString();
    }
}