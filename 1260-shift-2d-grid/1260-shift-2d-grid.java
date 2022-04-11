class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int nums[]=new int[(grid.length*grid[0].length)]; // for converting matrix to simple array
        int[] ans=new int[nums.length]; // for converting matrix to simple array
        List<List<Integer>> result = new ArrayList();
		
        for (int r = 0; r < grid.length; r++)
            result.add(new ArrayList());
		
		// converting matrix to oneD array
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
            {
                nums[(i * grid[0].length) + j]=grid[i][j];
            }
        }
        
		// shifting the oneD array k times (refer leetcode question 189)
		
        if(nums.length==1)
        {
            result.get(0).add(grid[0][0]);
            return result;
        }
        else
        {
        k=k%nums.length;
        int x=k;
        for(int i=0;i<nums.length-k;i++)
        {
            ans[x]=nums[i];
            x++;
        }
        int xx=nums.length-k;
        for(int i=0;i<k;i++)
        {
            ans[i]=nums[xx];
            xx++;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=ans[i];
        }
    }
	// array is shifted k times
	
	// Putting the k-shifted oneD array into list of lists
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
            {
                result.get(i).add(ans[(i*grid[0].length)+j]);
            }            
        }
        return result;
    }
}