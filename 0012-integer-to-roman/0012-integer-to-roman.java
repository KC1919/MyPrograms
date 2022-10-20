class Solution {
    public String intToRoman(int num) {
        
        // HashMap<Integer,String>hm=new HashMap<>();
        
        int val[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        
        // hm.put(1,"I");
        // hm.put(4,"IV");
        // hm.put(5,"V");
        // hm.put(9,"IX");
        // hm.put(10,"X");
        // hm.put(40,"XL");
        // hm.put(50,"L");
        // hm.put(90,"XC");
        // hm.put(100,"C");
        // hm.put(400,"CD");
        // hm.put(500,"D");
        // hm.put(900,"CM");
        // hm.put(1000,"M");
        
        
        StringBuilder sb=new StringBuilder();
        
        while(num>0){
            
            for(int i=12;i>=0;i--){
                
                if(num>=val[i]){
                    num=num-val[i];
                    sb.append(roman[i]);
                    break;
                }
            }
        }
        
        return sb.toString();
    }
}