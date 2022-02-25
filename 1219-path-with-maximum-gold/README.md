<h2><a href="https://leetcode.com/problems/path-with-maximum-gold/">1219. Path with Maximum Gold</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">In a gold mine <code style="user-select: auto;">grid</code> of size <code style="user-select: auto;">m x n</code>, each cell in this mine has an integer representing the amount of gold in that cell, <code style="user-select: auto;">0</code> if it is empty.</p>

<p style="user-select: auto;">Return the maximum amount of gold you can collect under the conditions:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Every time you are located in a cell you will collect all the gold in that cell.</li>
	<li style="user-select: auto;">From your position, you can walk one step to the left, right, up, or down.</li>
	<li style="user-select: auto;">You can't visit the same cell more than once.</li>
	<li style="user-select: auto;">Never visit a cell with <code style="user-select: auto;">0</code> gold.</li>
	<li style="user-select: auto;">You can start and stop collecting gold from <strong style="user-select: auto;">any </strong>position in the grid that has some gold.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,6,0],[5,8,7],[0,9,0]]
<strong style="user-select: auto;">Output:</strong> 24
<strong style="user-select: auto;">Explanation:</strong>
[[0,6,0],
 [5,8,7],
 [0,9,0]]
Path to get the maximum gold, 9 -&gt; 8 -&gt; 7.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
<strong style="user-select: auto;">Output:</strong> 28
<strong style="user-select: auto;">Explanation:</strong>
[[1,0,7],
 [2,0,6],
 [3,4,5],
 [0,3,0],
 [9,0,20]]
Path to get the maximum gold, 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 7.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 15</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= grid[i][j] &lt;= 100</code></li>
	<li style="user-select: auto;">There are at most <strong style="user-select: auto;">25 </strong>cells containing gold.</li>
</ul>
</div>