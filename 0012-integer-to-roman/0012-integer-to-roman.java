class Solution {
    public String intToRoman(int num) {
        
        int val[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        
        StringBuilder sb=new StringBuilder();
        
        //loop till number does not becomes 0
        while(num>0){
            
            //check if there is any number in the val array smaller or equal than
            //the current num
            for(int i=12;i>=0;i--){
                
                //so we check
                if(num>=val[i]){
                    
                    //append the roman value of the difference value
                    sb.append(roman[i]);
                    
                    //update the number to the remaining value
                    num=num-val[i];
                    
                    break;
                }
            }
        }
        
        //finally return the string
        return sb.toString();
    }
}