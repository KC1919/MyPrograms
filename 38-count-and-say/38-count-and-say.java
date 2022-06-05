class Solution {
    public String countAndSay(int n) {
        HashMap<Integer,String>hm=new HashMap<>();

        hm.put(1,"1");
        hm.put(2,"11");
        hm.put(3,"21");

        if(n==1 || n==2 || n==3)
        return hm.get(n);

        for(int i=4;i<=n;i++){
            String s=hm.get(i-1);

            char sc=s.charAt(0);
            int count=1;

            StringBuilder sb=new StringBuilder();
            for(int j=1;j<s.length();j++){
                
                char ch=s.charAt(j);
                if(sc==ch){
                    count++;
                }
                else{
                    sb.append(count+""+sc);
                    count=1;
                    sc=ch;
                }
            }
            sb.append(count+""+sc);

            hm.put(i,sb.toString());
        }

        return hm.get(n);
    }
}