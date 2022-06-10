<h2><a href="https://leetcode.com/problems/minimum-falling-path-sum-ii/">1289. Minimum Falling Path Sum II</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an <code style="user-select: auto;">n x n</code> integer matrix <code style="user-select: auto;">grid</code>, return <em style="user-select: auto;">the minimum sum of a <strong style="user-select: auto;">falling path with non-zero shifts</strong></em>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">falling path with non-zero shifts</strong> is a choice of exactly one element from each row of <code style="user-select: auto;">grid</code> such that no two elements chosen in adjacent rows are in the same column.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/08/10/falling-grid.jpg" style="width: 244px; height: 245px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [[1,2,3],[4,5,6],[7,8,9]]
<strong style="user-select: auto;">Output:</strong> 13
<strong style="user-select: auto;">Explanation:</strong> 
The possible falling paths are:
[1,5,9], [1,5,7], [1,6,7], [1,6,8],
[2,4,8], [2,4,9], [2,6,7], [2,6,8],
[3,4,8], [3,4,9], [3,5,7], [3,5,9]
The falling path with the smallest sum is&nbsp;[1,5,7], so the answer is&nbsp;13.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[7]]
<strong style="user-select: auto;">Output:</strong> 7
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid.length == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-99 &lt;= grid[i][j] &lt;= 99</code></li>
</ul>
</div>