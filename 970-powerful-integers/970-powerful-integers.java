class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        List<Integer>px=getPowers(x,bound);
        List<Integer>py=getPowers(y,bound);
        
        List<Integer>list=new ArrayList<>();
        
        HashSet<Integer>hm=new HashSet<>();
        
        for(int i=0;i<px.size();i++)
        {
            for(int j=0;j<py.size();j++)
            {
                int val=(int)Math.pow(x,px.get(i))+(int)Math.pow(y,py.get(j));
                
                if(val<=bound && !hm.contains(val))
                {
                    list.add(val);
                    hm.add(val);
                }
                    
            }
        }
        
        return list;
    }
    
    public List<Integer> getPowers(int x, int bound)
    {
        List<Integer>list=new ArrayList<>();
        
        if(x==1)
        {
            list.add(0);
            return list;
        }
            
        int power=0;
        int res=0;
        
        
        
        while(true)
        {
            res=(int)Math.pow(x,power);
            if(res<=bound){
                list.add(power);
                power++;
            }
            
            else
                break;
        }
        
        return list;
    }
}