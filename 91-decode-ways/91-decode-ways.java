class Solution {
    public int numDecodings(String s) {
        
        if(s.charAt(0)=='0')
            return 0;
        
        HashMap<String, Integer>hm=new HashMap<>();
        
        decodeWays(s,hm);
        
        return hm.get(s);
    }
    
    public int decodeWays(String s, HashMap<String,Integer>hm){
        
        if(s.length()==0){
            return 1;
        }
        
        if(hm.containsKey(s)){
            return hm.get(s);
        }
        
        String data;
        
        data=s.charAt(0)+"";
        
        int sres=0, dres=0;
        
        if(data.equals("0")){
            return 0;
        }
        
        if(!data.equals("0")){
            sres=decodeWays(s.substring(1),hm);
        }
        
        if(s.length()>=2){
            data=s.substring(0,2);

            if(Integer.parseInt(data)<=26){
                dres=decodeWays(s.substring(2),hm);
            }
        }
        
        int myRes=sres+dres;
        
        hm.put(s,myRes);
        
        return myRes;
    }
}