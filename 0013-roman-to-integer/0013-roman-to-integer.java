class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character,Integer>hm=new HashMap<>();
        int n=s.length();
        
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=hm.get(s.charAt(i));
        }
        
        int i=0;
        int sum=0;
        for(i=0;i<n-1;){
            
            if(a[i]>=a[i+1]){
                sum+=a[i];
                i+=1;
            }
            
            else{
                sum=sum+(a[i+1]-a[i]);
                i+=2;
            }
        }
        
        if(i==n-1)
            sum+=a[n-1];
        
        return sum;
    }
}