class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character,Integer>hm=new HashMap<>();

        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int sum=0;

        for(int i=0;i<s.length();){
            char ch=s.charAt(i);

            if(ch=='I'){
                if(i+1<s.length()){
                    char nch=s.charAt(i+1);
                    if(nch=='V' || nch=='X'){
                        sum=sum+hm.get(nch)-hm.get(ch);
                        i=i+2;
                    }
                    else{
                        sum+=hm.get(ch);
                        i++;
                    }
                }
                else{
                    sum+=hm.get(ch);
                    i++;
                }
            }
            else if(ch=='X'){
                if(i+1<s.length()){
                    char nch=s.charAt(i+1);
                    if(nch=='L' || nch=='C'){
                        sum=sum+hm.get(nch)-hm.get(ch);
                        i=i+2;
                    }
                    else{
                        sum+=hm.get(ch);
                        i++;
                    }
                }
                else{
                    sum+=hm.get(ch);
                    i++;
                }
            }
            else if(ch=='C'){
                if(i+1<s.length()){
                    char nch=s.charAt(i+1);
                    if(nch=='D' || nch=='M'){
                        sum=sum+hm.get(nch)-hm.get(ch);
                        i=i+2;
                    }
                    else{
                        sum+=hm.get(ch);
                        i++;
                    }
                }
                else{
                    sum+=hm.get(ch);
                    i++;
                }
            }
            else{
                sum+=hm.get(ch);
                i++;
            }
        }
        return sum;
    }
}