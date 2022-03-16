class Solution {
    
    public String getDirections(TreeNode root, int startValue, int destValue) 
    {
        StringBuilder sp=new StringBuilder();
        StringBuilder dp=new StringBuilder();
        
        if(getPath(root,startValue,sp)==false)return "";
        if(getPath(root,destValue,dp)==false)return "";
        
        int i=sp.length()-1;
        int j=dp.length()-1;
        
        int count=0;
        
        while(i>=0 && j>=0 && sp.charAt(i)==dp.charAt(j)){
            count++; i--; j--;
        }
            
        String sPath = "U".repeat(sp.length() - count);
        String dPath = dp.reverse().toString().substring(count, dp.length());
        
        return sPath+dPath;
    }
    
    public boolean getPath(TreeNode node, int target, StringBuilder path)
    {
        if(node==null)
            return false;
        
        if(node.val==target) return true;
        
        boolean lres=getPath(node.left,target,path);
        
        if(lres==true){
            path.append('L');
            return true;
        }
        boolean rres=getPath(node.right,target,path);
        
        if(rres==true){
            path.append('R');
            return true;
        }
        return false;
    }
}