// { Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int matrix[][], int n, int m) {
        if(n==0)
            return 0;
        
        int heights[]=new int [m];
        
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==1)
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
    
    public int largestRectangleArea(int[] heights) 
    {
        int n=heights.length;
        int ls[]=new int[n];
        
        ls[0]=-1;
        
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            while(j>=0 && heights[j]>=heights[i]){
                j=ls[j];
            }
            
            if(j==-1)
                ls[i]=-1;
            
            else
                ls[i]=j;
        }
        
        int rs[]=new int[n];
        rs[n-1]=n;
        
        for(int i=n-2;i>=0;i--)
        {
            int j=i+1;
            while(j<n && heights[j]>=heights[i]){
                j=rs[j];
            }
            
            if(j==n)
                rs[i]=n;
                
            else
                rs[i]=j;
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            int area=(rs[i]-ls[i]-1)*heights[i];
            max=Math.max(max,area);
        }
        return max;
    }
}