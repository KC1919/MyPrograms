<h2><a href="https://leetcode.com/problems/longest-increasing-path-in-a-matrix/">329. Longest Increasing Path in a Matrix</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an <code style="user-select: auto;">m x n</code> integers <code style="user-select: auto;">matrix</code>, return <em style="user-select: auto;">the length of the longest increasing path in </em><code style="user-select: auto;">matrix</code>.</p>

<p style="user-select: auto;">From each cell, you can either move in four directions: left, right, up, or down. You <strong style="user-select: auto;">may not</strong> move <strong style="user-select: auto;">diagonally</strong> or move <strong style="user-select: auto;">outside the boundary</strong> (i.e., wrap-around is not allowed).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/05/grid1.jpg" style="width: 242px; height: 242px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [[9,9,4],[6,6,8],[2,1,1]]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> The longest increasing path is <code style="user-select: auto;">[1, 2, 6, 9]</code>.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/27/tmp-grid.jpg" style="width: 253px; height: 253px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [[3,4,5],[3,2,6],[2,2,1]]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation: </strong>The longest increasing path is <code style="user-select: auto;">[3, 4, 5, 6]</code>. Moving diagonally is not allowed.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [[1]]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == matrix.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == matrix[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= matrix[i][j] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>
</div>