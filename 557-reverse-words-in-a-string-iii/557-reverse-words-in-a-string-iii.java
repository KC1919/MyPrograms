class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb=new StringBuilder(s);
        
        sb.reverse();
        
        String a[]=sb.toString().split(" ");
        
        int left=0, right=a.length-1;
        
        while(left<right){
            String temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            
            left++;
            right--;
        }
        
        sb.setLength(0);
        
        for(String ele:a){
            sb.append(ele);
            sb.append(" ");
        }
        
        return sb.toString().substring(0,sb.length()-1);
    }
}