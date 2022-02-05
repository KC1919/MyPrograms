<h2><a href="https://leetcode.com/problems/keep-multiplying-found-values-by-two/">2154. Keep Multiplying Found Values by Two</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array of integers <code style="user-select: auto;">nums</code>. You are also given an integer <code style="user-select: auto;">original</code> which is the first number that needs to be searched for in <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">You then do the following steps:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">If <code style="user-select: auto;">original</code> is found in <code style="user-select: auto;">nums</code>, <strong style="user-select: auto;">multiply</strong> it by two (i.e., set <code style="user-select: auto;">original = 2 * original</code>).</li>
	<li style="user-select: auto;">Otherwise, <strong style="user-select: auto;">stop</strong> the process.</li>
	<li style="user-select: auto;"><strong style="user-select: auto;">Repeat</strong> this process with the new number as long as you keep finding the number.</li>
</ol>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">final</strong> value of </em><code style="user-select: auto;">original</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [5,3,6,1,12], original = 3
<strong style="user-select: auto;">Output:</strong> 24
<strong style="user-select: auto;">Explanation:</strong> 
- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
- 24 is not found in nums. Thus, 24 is returned.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,7,9], original = 4
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong>
- 4 is not found in nums. Thus, 4 is returned.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i], original &lt;= 1000</code></li>
</ul>
</div>