<h2><a href="https://leetcode.com/problems/valid-mountain-array/">941. Valid Mountain Array</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of integers <code style="user-select: auto;">arr</code>, return <em style="user-select: auto;"><code style="user-select: auto;">true</code> if and only if it is a valid mountain array</em>.</p>

<p style="user-select: auto;">Recall that arr is a mountain array if and only if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">arr.length &gt;= 3</code></li>
	<li style="user-select: auto;">There exists some <code style="user-select: auto;">i</code> with <code style="user-select: auto;">0 &lt; i &lt; arr.length - 1</code> such that:
	<ul style="user-select: auto;">
		<li style="user-select: auto;"><code style="user-select: auto;">arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i] </code></li>
		<li style="user-select: auto;"><code style="user-select: auto;">arr[i] &gt; arr[i + 1] &gt; ... &gt; arr[arr.length - 1]</code></li>
	</ul>
	</li>
</ul>
<img src="https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png" width="500" style="user-select: auto;">
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [2,1]
<strong style="user-select: auto;">Output:</strong> false
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [3,5,5]
<strong style="user-select: auto;">Output:</strong> false
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [0,3,2,1]
<strong style="user-select: auto;">Output:</strong> true
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= arr[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>