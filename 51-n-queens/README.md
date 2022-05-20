<h2><a href="https://leetcode.com/problems/n-queens/">51. N-Queens</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The <strong style="user-select: auto;">n-queens</strong> puzzle is the problem of placing <code style="user-select: auto;">n</code> queens on an <code style="user-select: auto;">n x n</code> chessboard such that no two queens attack each other.</p>

<p style="user-select: auto;">Given an integer <code style="user-select: auto;">n</code>, return <em style="user-select: auto;">all distinct solutions to the <strong style="user-select: auto;">n-queens puzzle</strong></em>. You may return the answer in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;">Each solution contains a distinct board configuration of the n-queens' placement, where <code style="user-select: auto;">'Q'</code> and <code style="user-select: auto;">'.'</code> both indicate a queen and an empty space, respectively.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/queens.jpg" style="width: 600px; height: 268px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 4
<strong style="user-select: auto;">Output:</strong> [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
<strong style="user-select: auto;">Explanation:</strong> There exist two distinct solutions to the 4-queens puzzle as shown above
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 1
<strong style="user-select: auto;">Output:</strong> [["Q"]]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 9</code></li>
</ul>
</div>