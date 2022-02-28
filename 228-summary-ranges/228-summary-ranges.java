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
                
                if(start!=end){
                    list.add(start+"->"+end);
                }
                else{
                    list.add(start+"");
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