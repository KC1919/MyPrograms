class Solution {
    public String countAndSay(int n) {
        HashMap<Integer,String>hm=new HashMap<>();
        
        //storing the result for the first 3 terms
        hm.put(1,"1");
        hm.put(2,"11");
        hm.put(3,"21");

        if(n==1 || n==2 || n==3)
            return hm.get(n);
    
        //starting to calculate from the 4th term
        for(int i=4;i<=n;i++){
            
            //getting (n-1)th term
            String s=hm.get(i-1);

            //taking the 1st character as the start character
            char sc=s.charAt(0);
            
            //and count=1
            int count=1;

            StringBuilder sb=new StringBuilder();
            
            //starting to iterate from the 2nd character of the string
            for(int j=1;j<s.length();j++){
                
                //extracting jth character
                char ch=s.charAt(j);
                
                //if the jth character is same as the start character
                //incrementing the count by 1
                if(sc==ch){
                    count++;
                }
                
                //if the character is different
                else{
                    
                    //so we append the count with the character the start character
                    sb.append(count+""+sc);
                    
                    //reset the count to 1
                    count=1;
                    
                    //and update the start character to the current jth character
                    sc=ch;
                }
            }
            
            //to store the result for the last character or any string which of
            //length=1
            sb.append(count+""+sc);
            
            //store the result of the nth term in the hashmap
            hm.put(i,sb.toString());
        }
        
        //return the nth term result
        return hm.get(n);
    }
}