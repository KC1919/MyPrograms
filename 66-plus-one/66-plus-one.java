class Solution {
    public int[] plusOne(int[] a) {
        
        int n=a.length;
        
        a[n-1]+=1;
        int carry=0;
        
        if(a[n-1]==10){
            a[n-1]=0;
            carry=1;
        }
            
        for(int i=a.length-2;i>=0;i--){
            
            //if carry is there
            if(carry>0){
                //use the carry
                a[i]+=carry;
                
                // reset the carry to 0
                carry=0;
            }
            
            //if the digit becomes more than 9
            if(a[i]>9){
                
                //make the digit as 0
                a[i]=0;
                
                //and generate a carry of 1
                carry=1;
            }
        }
        
        //if carry is still left means every digit has been changed
        if(carry==1){
            
            //so we allocate memory to accomodate 1 more digit
            
            a=new int[n+1]; //copying the previous elements in 1 to n indices
            
            a[0]=1;  //and putting 1 at the head
        }
        return a;
    }
}