<h2><a href="https://leetcode.com/problems/array-of-doubled-pairs/">954. Array of Doubled Pairs</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array of even length <code style="user-select: auto;">arr</code>, return <code style="user-select: auto;">true</code><em style="user-select: auto;"> if it is possible to reorder </em><code style="user-select: auto;">arr</code><em style="user-select: auto;"> such that </em><code style="user-select: auto;">arr[2 * i + 1] = 2 * arr[2 * i]</code><em style="user-select: auto;"> for every </em><code style="user-select: auto;">0 &lt;= i &lt; len(arr) / 2</code><em style="user-select: auto;">, or </em><code style="user-select: auto;">false</code><em style="user-select: auto;"> otherwise</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [3,1,3,6]
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [2,1,2,6]
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [4,-2,2,-4]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= arr.length &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">arr.length</code> is even.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= arr[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>