<h2><a href="https://leetcode.com/problems/maximum-difference-between-increasing-elements/">2016. Maximum Difference Between Increasing Elements</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code> of size <code style="user-select: auto;">n</code>, find the <strong style="user-select: auto;">maximum difference</strong> between <code style="user-select: auto;">nums[i]</code> and <code style="user-select: auto;">nums[j]</code> (i.e., <code style="user-select: auto;">nums[j] - nums[i]</code>), such that <code style="user-select: auto;">0 &lt;= i &lt; j &lt; n</code> and <code style="user-select: auto;">nums[i] &lt; nums[j]</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum difference</strong>. </em>If no such <code style="user-select: auto;">i</code> and <code style="user-select: auto;">j</code> exists, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [7,<strong style="user-select: auto;"><u style="user-select: auto;">1</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">5</u></strong>,4]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong>
The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i &gt; j, so it is not valid.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [9,4,3,2]
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong>
There is no i and j such that i &lt; j and nums[i] &lt; nums[j].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [<strong style="user-select: auto;"><u style="user-select: auto;">1</u></strong>,5,2,<strong style="user-select: auto;"><u style="user-select: auto;">10</u></strong>]
<strong style="user-select: auto;">Output:</strong> 9
<strong style="user-select: auto;">Explanation:</strong>
The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>