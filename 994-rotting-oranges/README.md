<h2><a href="https://leetcode.com/problems/rotting-oranges/">994. Rotting Oranges</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an <code style="user-select: auto;">m x n</code> <code style="user-select: auto;">grid</code> where each cell can have one of three values:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0</code> representing an empty cell,</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1</code> representing a fresh orange, or</li>
	<li style="user-select: auto;"><code style="user-select: auto;">2</code> representing a rotten orange.</li>
</ul>

<p style="user-select: auto;">Every minute, any fresh orange that is <strong style="user-select: auto;">4-directionally adjacent</strong> to a rotten orange becomes rotten.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the minimum number of minutes that must elapse until no cell has a fresh orange</em>. If <em style="user-select: auto;">this is impossible, return</em> <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/02/16/oranges.png" style="width: 650px; height: 137px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[2,1,1],[1,1,0],[0,1,1]]
<strong style="user-select: auto;">Output:</strong> 4
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[2,1,1],[0,1,1],[1,0,1]]
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,2]]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> Since there are already no fresh oranges at minute 0, the answer is just 0.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">grid[i][j]</code> is <code style="user-select: auto;">0</code>, <code style="user-select: auto;">1</code>, or <code style="user-select: auto;">2</code>.</li>
</ul>
</div>