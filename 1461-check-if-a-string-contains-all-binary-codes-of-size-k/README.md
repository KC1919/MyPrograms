<h2><a href="https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/">1461. Check If a String Contains All Binary Codes of Size K</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a binary string <code style="user-select: auto;">s</code> and an integer <code style="user-select: auto;">k</code>, return <code style="user-select: auto;">true</code> <em style="user-select: auto;">if every binary code of length</em> <code style="user-select: auto;">k</code> <em style="user-select: auto;">is a substring of</em> <code style="user-select: auto;">s</code>. Otherwise, return <code style="user-select: auto;">false</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "00110110", k = 2
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> The binary codes of length 2 are "00", "01", "10" and "11". They can be all found as substrings at indices 0, 1, 3 and 2 respectively.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "0110", k = 1
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> The binary codes of length 1 are "0" and "1", it is clear that both exist as a substring. 
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "0110", k = 2
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> The binary code "00" is of length 2 and does not exist in the array.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 5 * 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is either <code style="user-select: auto;">'0'</code> or <code style="user-select: auto;">'1'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= 20</code></li>
</ul>
</div>