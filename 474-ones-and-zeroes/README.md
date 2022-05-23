<h2><a href="https://leetcode.com/problems/ones-and-zeroes/">474. Ones and Zeroes</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array of binary strings <code style="user-select: auto;">strs</code> and two integers <code style="user-select: auto;">m</code> and <code style="user-select: auto;">n</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the size of the largest subset of <code style="user-select: auto;">strs</code> such that there are <strong style="user-select: auto;">at most</strong> </em><code style="user-select: auto;">m</code><em style="user-select: auto;"> </em><code style="user-select: auto;">0</code><em style="user-select: auto;">'s and </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> </em><code style="user-select: auto;">1</code><em style="user-select: auto;">'s in the subset</em>.</p>

<p style="user-select: auto;">A set <code style="user-select: auto;">x</code> is a <strong style="user-select: auto;">subset</strong> of a set <code style="user-select: auto;">y</code> if all elements of <code style="user-select: auto;">x</code> are also elements of <code style="user-select: auto;">y</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> strs = ["10","0001","111001","1","0"], m = 5, n = 3
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4.
Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
{"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> strs = ["10","0","1"], m = 1, n = 1
<strong style="user-select: auto;">Output:</strong> 2
<b style="user-select: auto;">Explanation:</b> The largest subset is {"0", "1"}, so the answer is 2.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= strs.length &lt;= 600</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= strs[i].length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">strs[i]</code> consists only of digits <code style="user-select: auto;">'0'</code> and <code style="user-select: auto;">'1'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 100</code></li>
</ul>
</div>