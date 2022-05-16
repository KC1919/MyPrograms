<h2><a href="https://leetcode.com/problems/shortest-path-in-binary-matrix/">1091. Shortest Path in Binary Matrix</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an <code style="user-select: auto;">n x n</code> binary matrix <code style="user-select: auto;">grid</code>, return <em style="user-select: auto;">the length of the shortest <strong style="user-select: auto;">clear path</strong> in the matrix</em>. If there is no clear path, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">clear path</strong> in a binary matrix is a path from the <strong style="user-select: auto;">top-left</strong> cell (i.e., <code style="user-select: auto;">(0, 0)</code>) to the <strong style="user-select: auto;">bottom-right</strong> cell (i.e., <code style="user-select: auto;">(n - 1, n - 1)</code>) such that:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">All the visited cells of the path are <code style="user-select: auto;">0</code>.</li>
	<li style="user-select: auto;">All the adjacent cells of the path are <strong style="user-select: auto;">8-directionally</strong> connected (i.e., they are different and they share an edge or a corner).</li>
</ul>

<p style="user-select: auto;">The <strong style="user-select: auto;">length of a clear path</strong> is the number of visited cells of this path.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/example1_1.png" style="width: 500px; height: 234px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,1],[1,0]]
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/example2_1.png" style="height: 216px; width: 500px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,0,0],[1,1,0],[1,1,0]]
<strong style="user-select: auto;">Output:</strong> 4
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,0,0],[1,1,0],[1,1,0]]
<strong style="user-select: auto;">Output:</strong> -1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">grid[i][j] is 0 or 1</code></li>
</ul>
</div>