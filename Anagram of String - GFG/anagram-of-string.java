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
        
        char a[]=large.toCharArray();
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<small.length();i++)
        {
            char ch=small.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        int count=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(!hm.containsKey(a[i]))
            {
                count++;
            }
            else if(hm.containsKey(a[i]))
            {
                if(hm.get(a[i])!=0)
                hm.put(a[i],hm.get(a[i])-1);
                
                else
                count++;
            }
        }
        
        for(int e:hm.values())
        {
            if(e!=0)
            count+=e;
        }
        return count;
    }
}