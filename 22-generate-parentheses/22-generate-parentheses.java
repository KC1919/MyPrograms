class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String>list=new ArrayList<>();
        
        generate(n,n,n,new StringBuilder(),list);
        return list;
    }
    
    public void generate(int n, int op, int cp, StringBuilder combi, List<String>ans)
    {
        //if all the parenthesis has been used, means we have got a possible valid
        //sequence of paranthesis, hence we add it to the list of answers
        if(cp==0 && op==0 && combi.length()==n*2){
            String com=combi.toString();
            ans.add(com);
            return;
        }
        
        //if there are opening parenthesis avalable then we take it in our sequence and
        //make a call to the next level
        if(op>0){
            combi.append('(');
            generate(n,op-1,cp,combi,ans);
            combi.deleteCharAt(combi.length()-1);
        }
        
        //after the above call, now we have to check if we have any closing parenthesis
        //available, then we can add them in our sequence and make a call to
        //the next level
        
        if(cp>op){
            combi.append(')');
            generate(n,op,cp-1,combi,ans);
            combi.deleteCharAt(combi.length()-1);
        }
    }
}