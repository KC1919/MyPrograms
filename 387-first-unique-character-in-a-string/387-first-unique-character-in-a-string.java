class Solution {
    public int firstUniqChar(String s) {
        
        int[] count = new int[26];
		
		Queue<Integer>que=new LinkedList<>();
		
		for(int i=0;i<s.length();i++)
		{
		    char ch=s.charAt(i);
		    int index = ch - 'a';
            
		    if(count[index]==0){
		        count[index]++;
		        que.add(i);
		    }
		    
		    else
		    {
		        count[index]++;
	
		        if(que.size()>0)
                {
		            if(s.charAt(que.peek())==ch){
		                que.remove();
                        count[index]++;
                    }
	
                    else if(count[s.charAt(que.peek())-'a']>1)
		            {
                        int idx=s.charAt(que.peek())-'a';
		                count[idx]--;
		                que.remove();
		            }
		        }
		    }
		}
        
        while(que.size()>0 && count[s.charAt(que.peek())-'a']>1)
        {
		    int idx=s.charAt(que.peek())-'a';
		    count[idx]--;
		    que.remove();
		}
        
        if(que.size()==0)
        return -1;
        
        else
		return (count[s.charAt(que.peek())-'a']>1)?-1:que.peek();
    }
}