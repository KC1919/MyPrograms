class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
		
		Queue<Integer>que=new LinkedList<>();
		
		for(int i=0;i<s.length();i++)
		{
		    char ch=s.charAt(i);
		    
		    if(!hm.containsKey(ch)){
		        hm.put(ch,1);
		        que.add(i);
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
		    }
		}
        
        if(que.size()==0)
        return -1;
        
        else
		return (hm.get(s.charAt(que.peek()))>1)?-1:que.peek();
    }
}