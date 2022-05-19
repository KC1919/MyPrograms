<h2><a href="https://leetcode.com/problems/coin-change/">322. Coin Change</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">coins</code> representing coins of different denominations and an integer <code style="user-select: auto;">amount</code> representing a total amount of money.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the fewest number of coins that you need to make up that amount</em>. If that amount of money cannot be made up by any combination of the coins, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">You may assume that you have an infinite number of each kind of coin.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> coins = [1,2,5], amount = 11
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> 11 = 5 + 5 + 1
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> coins = [2], amount = 3
<strong style="user-select: auto;">Output:</strong> -1
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> coins = [1], amount = 0
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= coins.length &lt;= 12</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= coins[i] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= amount &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>