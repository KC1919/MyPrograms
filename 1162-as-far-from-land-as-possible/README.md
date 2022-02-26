<h2><a href="https://leetcode.com/problems/as-far-from-land-as-possible/">1162. As Far from Land as Possible</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an <code style="user-select: auto;">n x n</code> <code style="user-select: auto;">grid</code>&nbsp;containing only values <code style="user-select: auto;">0</code> and <code style="user-select: auto;">1</code>, where&nbsp;<code style="user-select: auto;">0</code> represents water&nbsp;and <code style="user-select: auto;">1</code> represents land, find a water cell such that its distance to the nearest land cell is maximized, and return the distance.&nbsp;If no land or water exists in the grid, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">The distance used in this problem is the Manhattan distance:&nbsp;the distance between two cells <code style="user-select: auto;">(x0, y0)</code> and <code style="user-select: auto;">(x1, y1)</code> is <code style="user-select: auto;">|x0 - x1| + |y0 - y1|</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/05/03/1336_ex1.JPG" style="width: 185px; height: 87px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,0,1],[0,0,0],[1,0,1]]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The cell (1, 1) is as far as possible from all the land with distance 2.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/05/03/1336_ex2.JPG" style="width: 184px; height: 87px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,0,0],[0,0,0],[0,0,0]]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> The cell (2, 2) is as far as possible from all the land with distance 4.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n&nbsp;&lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">grid[i][j]</code>&nbsp;is <code style="user-select: auto;">0</code> or <code style="user-select: auto;">1</code></li>
</ul>
</div>