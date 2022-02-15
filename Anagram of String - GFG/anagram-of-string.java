// { Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s1,String s2)
    {
        String large="";
        String small="";
        
        if(s1.length()>s2.length())
        {
            large=s1;
            small=s2;
        }
        
        else if(s1.length()<s2.length())
        {
            large=s2;
            small=s1;
        }
        else
        {
            small=s1;
            large=s2;
        }
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<large.length();i++)
        {
            char ch=large.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        int count=0;
        
        for(int i=0;i<small.length();i++)
        {
            char ch=small.charAt(i);
            if(hm.containsKey(ch))
            {
                if(hm.get(ch)!=0)
                    hm.put(ch,hm.get(ch)-1);
                
                else
                count++;
            }
            else
            count++;
        }
        
        for(int val:hm.values())
        {
            count+=val;
        }
        
        
        return count;
    }
}