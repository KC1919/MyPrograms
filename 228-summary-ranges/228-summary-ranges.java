class Solution {
    public List<String> summaryRanges(int[] a) {
        
        if(a.length==0){
            return new ArrayList<>();
        }
        
        List<String>list=new ArrayList<>();
        int start=a[0];
        int end=a[0];
        
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]-1){
                end=a[i];
            }
            else{
                StringBuilder sb=new StringBuilder();
                
                if(start!=end){
                    sb.append(start);
                    sb.append("->");
                    sb.append(end);
                    list.add(sb.toString());
                }
                else{
                    sb.append(start);
                    list.add(sb.toString());
                }
                start=a[i];
                end=a[i];
            }
        }
        if(start==end)
            list.add(start+"");
        
        else
        list.add(start+"->"+end);
        
        return list;
    }
}