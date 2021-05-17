import java.util.*;                                                     //Applying the concept of next smaller
class histogram
{
    static Scanner sc=new Scanner(System.in);
    static Stack<Integer> s=new Stack<>();
    
    static int area(int a[])                            // [2,1,5,6,2,3]
    {
        int lb[]=new int[a.length];                 //array to store the left breadth of a bar   
        int rb[]=new int[a.length];                 //array to store the right breadth
        s.push(a.length-1);                         //pushing the last index
        rb[a.length-1]=a.length;                    //putting the right breadth of last bar equal to(length), because there is nothing after that 
        lb[0]=-1;                                   //putting left breadth for 1st bar as -1, because there is nothing to its left
        
        for(int i=a.length-2;i>=0;i--)              //now we start to iterate from the 2nd last element
        {
            while(s.size()!=0 && a[i]<=a[s.peek()])  //we check if the stack is not empty and the element at peek index is gretaer than or equal to
            {                                        //the ith element,then we pop the index at (peek)
                s.pop();
            }
            if(s.size()==0)           //if all the indices get popped and the stack becomes empty,it means there is no bar smaller than the ith bar
            rb[i]=a.length;           //to its right, which means it covers the right breadth up to the length of the array
            
            else
            rb[i]=s.peek();        //if there is any bar smaller than the ith bar, then we put the right breadth of ith , as the index of that smaller
                                   //element, which means it covers the span from its current position till the smaller bar index
            s.push(i);             //and push the ith index
        }
        
        s.clear();                 //when for all elements the right breadth boundary has been found, we clear the stack
        s.push(0);                 //and reuse it to find the left breadth boundary, so we push 0 index in it
        
        for(int i=1;i<a.length;i++)         //we start from the 2nd element                                       // [2,1,5,6,2,3]
        {
            while(s.size()!=0 && a[i]<=a[s.peek()])  //now we check the same on the left side, if there is any element greater than the ith element
            {
                s.pop();                             //we pop that element
            }
            if(s.size()==0)                             //and if all the elements get popped, that means the left breadth streches till 0th index
            lb[i]=-1;                                   //so we put -1;
            
            else
            lb[i]=s.peek();                             //if there is some element smaller than the ith element , we assign the index of that smaller
                                                        //element to the left breadth of the ith element
            s.push(i);                                  //and push the current index i.e ith.
        }
        int max=-1;
        for(int i=0;i<a.length;i++)
        {
            int width=rb[i]-lb[i]-1; //now for each bar, we find the width, by finding the diff between its right breadth boundary and left breadth
            int area=a[i]*width;     //boundary, and multiply by its height
            max=Math.max(area,max);             //and store the maximum area
        }
        return max; 
    }
    
    public static void main(String args[])
    {
        System.out.println("enter array size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Maximum area is: "+area(a));
        
    }
}             