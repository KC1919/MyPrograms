<h2><a href="https://leetcode.com/problems/coin-change-2/">518. Coin Change 2</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">coins</code> representing coins of different denominations and an integer <code style="user-select: auto;">amount</code> representing a total amount of money.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the number of combinations that make up that amount</em>. If that amount of money cannot be made up by any combination of the coins, return <code style="user-select: auto;">0</code>.</p>

<p style="user-select: auto;">You may assume that you have an infinite number of each kind of coin.</p>

<p style="user-select: auto;">The answer is <strong style="user-select: auto;">guaranteed</strong> to fit into a signed <strong style="user-select: auto;">32-bit</strong> integer.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> amount = 5, coins = [1,2,5]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> amount = 3, coins = [2]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> the amount of 3 cannot be made up just with coins of 2.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> amount = 10, coins = [10]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= coins.length &lt;= 300</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= coins[i] &lt;= 5000</code></li>
	<li style="user-select: auto;">All the values of <code style="user-select: auto;">coins</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= amount &lt;= 5000</code></li>
</ul>
</div>