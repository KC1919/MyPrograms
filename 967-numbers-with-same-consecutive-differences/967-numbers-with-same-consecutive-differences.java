class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        List<Integer>list=new ArrayList<>();
        formCombi(n,k,new StringBuilder(),list);
        
        int[] res = new int[list.size()];
        int idx=0;
        
        for(int ele:list){
            res[idx++]=ele;
        }
        
        return res;
    }
    
    private void formCombi(int n, int k, StringBuilder sb, List<Integer>list){
        
        if(sb.length()==n){
            
            list.add(Integer.parseInt(sb.toString()));
            return;
        }
        
        for(int i=0;i<=9;i++){
            
            if(sb.length()==0 && i==0){
                continue;
            }
            
            else if(sb.length()==0){
                sb.append(i);
                formCombi(n,k,sb,list);
                sb.deleteCharAt(sb.length()-1);
            }
            
            else if(sb.length()>0 && Math.abs(i-(sb.charAt(sb.length()-1)-48))==k){
                sb.append(i);
                formCombi(n,k,sb,list);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}