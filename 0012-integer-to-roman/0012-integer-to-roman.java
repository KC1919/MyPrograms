class Solution {
    public String intToRoman(int num) {
        
        HashMap<Integer,String>hm=new HashMap<>();
        
        hm.put(1,"I");
        hm.put(2,"II");
        hm.put(3,"III");
        hm.put(4,"IV");
        hm.put(5,"V");
        hm.put(6,"VI");
        hm.put(7,"VII");
        hm.put(8,"VIII");
        hm.put(9,"IX");
        hm.put(10,"X");
        hm.put(20,"XX");
        hm.put(30,"XXX");
        hm.put(40,"XL");
        hm.put(50,"L");
        hm.put(60,"LX");
        hm.put(70,"LXX");
        hm.put(80,"LXXX");
        hm.put(90,"XC");
        hm.put(100,"C");
        hm.put(200,"CC");
        hm.put(300,"CCC");
        hm.put(400,"CD");
        hm.put(500,"D");
        hm.put(600,"DC");
        hm.put(700,"DCC");
        hm.put(800,"DCCC");
        hm.put(900,"CM");
        hm.put(1000,"M");
        hm.put(2000,"MM");
        hm.put(3000,"MMM");
        
        
        Stack<Integer>st=new Stack<>();
        int n=num;
        
        while(n>0){
            int d=n%10;
            st.push(d);
            n/=10;
        }
        
        StringBuilder sb=new StringBuilder();
        
        while(st.size()>0){
            int size=st.size();
            int ele=st.pop();
            
            int val=(int)Math.pow(10,size-1);
            val*=ele;
            
            if(hm.containsKey(val)){
                sb.append(hm.get(val));
            }
        }
        
        return sb.toString();
    }
}