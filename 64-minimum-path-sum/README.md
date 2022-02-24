<h2><a href="https://leetcode.com/problems/minimum-path-sum/">64. Minimum Path Sum</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <code style="user-select: auto;">m x n</code> <code style="user-select: auto;">grid</code> filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong> You can only move either down or right at any point in time.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/minpath.jpg" style="width: 242px; height: 242px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,3,1],[1,5,1],[4,2,1]]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,2,3],[4,5,6]]
<strong style="user-select: auto;">Output:</strong> 12
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= grid[i][j] &lt;= 100</code></li>
</ul>
</div>