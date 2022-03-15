<h2><a href="https://leetcode.com/problems/arranging-coins/">441. Arranging Coins</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You have <code style="user-select: auto;">n</code> coins and you want to build a staircase with these coins. The staircase consists of <code style="user-select: auto;">k</code> rows where the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> row has exactly <code style="user-select: auto;">i</code> coins. The last row of the staircase <strong style="user-select: auto;">may be</strong> incomplete.</p>

<p style="user-select: auto;">Given the integer <code style="user-select: auto;">n</code>, return <em style="user-select: auto;">the number of <strong style="user-select: auto;">complete rows</strong> of the staircase you will build</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/09/arrangecoins1-grid.jpg" style="width: 253px; height: 253px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 5
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> Because the 3<sup style="user-select: auto;">rd</sup> row is incomplete, we return 2.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/09/arrangecoins2-grid.jpg" style="width: 333px; height: 333px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 8
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> Because the 4<sup style="user-select: auto;">th</sup> row is incomplete, we return 3.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>
</div>