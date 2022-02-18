class Solution 
{
    public int largestRectangleArea(int[] heights) 
    {
        int n=heights.length;
        int ls[]=new int[n];
        
        ls[0]=-1;
        
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            while(j>=0 && heights[j]>=heights[i])
            {
                j=ls[j];
            }
            if(j==-1)
            {
                ls[i]=-1;
            }
            else
            {
                ls[i]=j;
            }
        }
        int rs[]=new int[n];
        rs[n-1]=n;
        
        for(int i=n-2;i>=0;i--)
        {
            int j=i+1;
            while(j<n && heights[j]>=heights[i])
            {
                j=rs[j];
            }
            if(j==n)
            {
                rs[i]=n;
            }
            else
            {
                rs[i]=j;
            }
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            int area=(rs[i]-ls[i]-1)*heights[i];
            max=Math.max(max,area);
        }
        return max;
    }
    
    public int maximalRectangle(char[][] matrix) 
    {
        if(matrix.length==0)
            return 0;
        
        int heights[]=new int [matrix[0].length];
        
        int max=0;
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]-'0'==1)
                {
                    heights[j]+=1;
                }
                else
                {
                    heights[j]=0;
                }
            }
            
            max=Math.max(max,largestRectangleArea(heights));
        }
        
        return max;
        
    }
}