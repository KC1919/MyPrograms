<h2><a href="https://leetcode.com/problems/maximal-rectangle/">85. Maximal Rectangle</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <code style="user-select: auto;">rows x cols</code>&nbsp;binary <code style="user-select: auto;">matrix</code> filled with <code style="user-select: auto;">0</code>'s and <code style="user-select: auto;">1</code>'s, find the largest rectangle containing only <code style="user-select: auto;">1</code>'s and return <em style="user-select: auto;">its area</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/14/maximal.jpg" style="width: 402px; height: 322px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong> The maximal rectangle is shown in the above picture.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [["0"]]
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [["1"]]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">rows == matrix.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">cols == matrix[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= row, cols &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">matrix[i][j]</code> is <code style="user-select: auto;">'0'</code> or <code style="user-select: auto;">'1'</code>.</li>
</ul>
</div>