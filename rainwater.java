//Q) Trapping Rain Water   Eg.- //[0,1,0,2,1,0,1,3,2,1,2,1]

import java.util.*; 
class rainwater
{
    public int trap(int[] height)    //better approach   Time = O(n) , Space = O(3n)
    {
        if(height.length==0)
            return 0;
        Stack<Integer>s=new Stack<>();//we take a stack
        
        int rg[]=new int[height.length]; //we take an array to store the right greater of all the elements
        int lg[]=new int[height.length]; //we take another array to store the left greater of all the elements
        
        int n=height.length;
        s.push(height[n-1]);        //pushing the last element in the stack
        rg[n-1]=-1;                 //since the last element does not have any next greater, so we put -1 for it
        for(int i=n-2;i>=0;i--)     //now we start fromt he 2nd last element
        {
            if(height[i]<s.peek())  //we check if the current bar has bar of greater height next to it or not
            {
                rg[i]=s.peek();     //if yes, then we assign the next greater of the current bar
            }
            else
            {
                s.push(height[i]);  //else we push the current bar into the stack
                rg[i]=-1;          //and assign -1, as we did not find bar of gretaer height next to it
            }
        }
        s.clear(); //after getting the next bar of greater height for all the bars, we clear the stack
        
        s.push(height[0]);               //then we push the height of the 1st bar
        lg[0]=-1;                        //as we dont have left greater of 1st element, so we push -1
        for(int i=1;i<n;i++)             //now we start from the 2nd bar
        {
            if(height[i]<s.peek())      //we check if the height of the bar is smaller than the,height of the bar in the stack, which is on its left
            {
                lg[i]=s.peek();          //so we assign the left greater of the current bar 
            }
            else                        //if no bar of greater height present in the stack
            {
                s.push(height[i]);      //so we push the height of the current stack
                lg[i]=-1;               //and assign -1 to the left greater of the current bar
            }
        }
        s.clear();                      //we clear the stack, to free up space
        
        int units=0;
        for(int i=0;i<rg.length;i++)        //now we iterate thru the heights
        {
            if(rg[i]==-1||lg[i]==-1)        //we check if any of the left greater or right greater is -1, we continue
            {
                continue;
            }
            else
            {
                units+=Math.min(rg[i],lg[i])-height[i];   //we take out the minimum between the left greater and right greater  
            }                                             //and subtract the height of thr bar, to get the units of water that can be stored
        }
        return units;
    }
    
    static int trapWater(int a[])  //optimal approach Time=O(n) Space=O(1)    2-Pointer Algorithm
    {
        int lmax=0;                                                     
        int rmax=0;
        int res=0;
        int r=a.length-1;                                   
        int l=0;
        
        while(l<=r)                       
        {
            if(a[l]<=rmax) //we are checking with the right maximum, to check if the it is smaller than it
            {
                if(a[l]>=lmax) //if yes, the we check whether it is also smaller than the left maximum, if not, then we make it the lmax
                {
                    lmax=a[l];                                                     //[0,1,0,2,1,0,1,3,2,1,2,1]
                }
                else
                {
                    res+=lmax-a[l]; //else we calculate the units of water that can be trapped
                }
                l++;
            }
            else    //if the bar is greater than rmax
            {
                if(a[r]>=rmax) //then we go to right side, and check if the bar is greater than the rmax, then we change the rmax to current bar height
                {
                    rmax=a[r];
                    
                }
                else  //else, if the bar is smaller than the rmax, we 
                {
                    res+=rmax-a[r]; //calculate the units of water that can be stored
                }
                r--;
            }
        }
        return res;
    }
}