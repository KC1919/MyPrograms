<h2><a href="https://leetcode.com/problems/unique-paths-ii/">63. Unique Paths II</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an <code style="user-select: auto;">m x n</code> integer array <code style="user-select: auto;">grid</code>. There is a robot initially located at the <b style="user-select: auto;">top-left corner</b> (i.e., <code style="user-select: auto;">grid[0][0]</code>). The robot tries to move to the <strong style="user-select: auto;">bottom-right corner</strong> (i.e., <code style="user-select: auto;">grid[m-1][n-1]</code>). The robot can only move either down or right at any point in time.</p>

<p style="user-select: auto;">An obstacle and space are marked as <code style="user-select: auto;">1</code> or <code style="user-select: auto;">0</code> respectively in <code style="user-select: auto;">grid</code>. A path that the robot takes cannot include <strong style="user-select: auto;">any</strong> square that is an obstacle.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the number of possible unique paths that the robot can take to reach the bottom-right corner</em>.</p>

<p style="user-select: auto;">The testcases are generated so that the answer will be less than or equal to <code style="user-select: auto;">2 * 10<sup style="user-select: auto;">9</sup></code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/04/robot1.jpg" style="width: 242px; height: 242px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -&gt; Right -&gt; Down -&gt; Down
2. Down -&gt; Down -&gt; Right -&gt; Right
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/04/robot2.jpg" style="width: 162px; height: 162px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> obstacleGrid = [[0,1],[0,0]]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == obstacleGrid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == obstacleGrid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">obstacleGrid[i][j]</code> is <code style="user-select: auto;">0</code> or <code style="user-select: auto;">1</code>.</li>
</ul>
</div>