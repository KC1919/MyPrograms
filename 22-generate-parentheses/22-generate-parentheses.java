class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String>list=new ArrayList<>();
        
        generate(n,n,n,new StringBuilder(),list);
        return list;
    }
    
    public void generate(int n, int op, int cp, StringBuilder combi, List<String>ans)
    {
        if(cp==0 && op==0 && combi.length()==n*2){
            String com=combi.toString();
            ans.add(com);
            return;
        }
        
        if(op>0){
            combi.append('(');
            generate(n,op-1,cp,combi,ans);
            combi.deleteCharAt(combi.length()-1);
        }
        
        if(cp>op){
            combi.append(')');
            generate(n,op,cp-1,combi,ans);
            combi.deleteCharAt(combi.length()-1);
        }
    }
}