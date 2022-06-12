<h2><a href="https://leetcode.com/problems/maximum-erasure-value/">1695. Maximum Erasure Value</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array of positive integers <code style="user-select: auto;">nums</code> and want to erase a subarray containing&nbsp;<strong style="user-select: auto;">unique elements</strong>. The <strong style="user-select: auto;">score</strong> you get by erasing the subarray is equal to the <strong style="user-select: auto;">sum</strong> of its elements.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum score</strong> you can get by erasing <strong style="user-select: auto;">exactly one</strong> subarray.</em></p>

<p style="user-select: auto;">An array <code style="user-select: auto;">b</code> is called to be a <span class="tex-font-style-it" style="user-select: auto;">subarray</span> of <code style="user-select: auto;">a</code> if it forms a contiguous subsequence of <code style="user-select: auto;">a</code>, that is, if it is equal to <code style="user-select: auto;">a[l],a[l+1],...,a[r]</code> for some <code style="user-select: auto;">(l,r)</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [4,2,4,5,6]
<strong style="user-select: auto;">Output:</strong> 17
<strong style="user-select: auto;">Explanation:</strong> The optimal subarray here is [2,4,5,6].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [5,2,1,2,5,2,1,2,5]
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation:</strong> The optimal subarray here is [5,2,1] or [1,2,5].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>