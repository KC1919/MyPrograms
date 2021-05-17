//Q) Merge overlapping intervals.

import java.util.*;
class interval     //My brute-force approach
{
    public int[][] merge(int[][] inter) 
    {
        int a[][]=new int[inter.length][2];
        int c=0,i;
        for(i=0;i<inter.length-1;)
        {
            if(inter[i][1]>inter[i+1][0])
            {
                a[c][0]=inter[i][0];
                a[c][1]=inter[i+1][1];
                c++;
                i+=2;
            }
            else
            {
                a[c][0]=inter[i][0];
                a[c][1]=inter[i][1];
                c++;
                i+=1;
            }
        }
        
        if(a[c-1][1]!=inter[i][1])
        {
            a[c][0]=inter[i][0];
            a[c][1]=inter[i][1];
        }
        
        return a;
        
    }
}


class Solution   //optimized approach O(nLog(n)) + O(n)
{
    public int[][] merge(int[][] inter) 
    {
        
        ArrayList<int[]>list=new ArrayList<>();
        
        if(inter.length==0||inter==null)
            return list.toArray(new int[0][]);
        
        Arrays.sort(inter,(a,b)->a[0]-b[0]);   //first sort the given intervals
        
        
        int start=inter[0][0];
        int end=inter[0][1];
        
        
        for(int i=1;i<inter.length;i++)
        {
            if(inter[i][0]<=end)  //we are checking if the, start time of the next interval is,smaller than or equal to the end time of 
            {                     //the previous interval, means they overlap, so we merge them,and take the end time of the interval 
                end=Math.max(inter[i][1],end); //which has a greater end time
            }
            else  //else if the interval is not overlapping
            {
                list.add(new int[]{start,end}); //so we add the interval which we calculated so far
                start=inter[i][0];              //and reset the start time to the current interval's start time
                end=inter[i][1];                //and end time also tot the current interval's end time
            }
        }
        list.add(new int[]{start,end});         //at the end of the loop, our last interval would be left,so we add it to the list
        
        return list.toArray(new int[0][]);      //and return the list with merged intervals
    }
    
    public int[][] merg(int[][] inter)   //Time: O(n) ,Space: O(1)
    {
        
        Arrays.sort(inter,(a,b)->a[0]-b[0]);  
        
        int ind=0;
        
        for(int i=1;i<inter.length;i++)
        {
            if(inter[i][0]<=inter[ind][1])  //cehcking if start time of curr interval is, less than the end time of previous interval
            {                     
                inter[ind][1]=Math.max(inter[i][1],inter[ind][1]); //if yes, then we update the end time of previous interval, with the end time which ever
            }                                                      //greater between the two
            else  //if itnot the case
            {
                ind++;   //then we move a index ahead,
                inter[ind][0]=inter[i][0];  //and update the start time of new interval with the start time of current interval
                inter[ind][1]=inter[i][1];  //and update the end time of new interval with the end time of current interval
            }
        }
        return Arrays.copyOfRange(inter,0,ind+1);
    }
}