<h2><a href="https://leetcode.com/problems/shortest-bridge/">934. Shortest Bridge</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an <code style="user-select: auto;">n x n</code> binary matrix <code style="user-select: auto;">grid</code> where <code style="user-select: auto;">1</code> represents land and <code style="user-select: auto;">0</code> represents water.</p>

<p style="user-select: auto;">An <strong style="user-select: auto;">island</strong> is a 4-directionally connected group of <code style="user-select: auto;">1</code>'s not connected to any other <code style="user-select: auto;">1</code>'s. There are <strong style="user-select: auto;">exactly two islands</strong> in <code style="user-select: auto;">grid</code>.</p>

<p style="user-select: auto;">You may change <code style="user-select: auto;">0</code>'s to <code style="user-select: auto;">1</code>'s to connect the two islands to form <strong style="user-select: auto;">one island</strong>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the smallest number of </em><code style="user-select: auto;">0</code><em style="user-select: auto;">'s you must flip to connect the two islands</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,1],[1,0]]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,1,0],[0,0,0],[0,0,1]]
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid.length == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">grid[i][j]</code> is either <code style="user-select: auto;">0</code> or <code style="user-select: auto;">1</code>.</li>
	<li style="user-select: auto;">There are exactly two islands in <code style="user-select: auto;">grid</code>.</li>
</ul>
</div>