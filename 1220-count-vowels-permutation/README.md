<h2><a href="https://leetcode.com/problems/count-vowels-permutation/">1220. Count Vowels Permutation</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer <code style="user-select: auto;">n</code>, your task is to count how many strings of length <code style="user-select: auto;">n</code> can be formed under the following rules:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Each character is a lower case vowel&nbsp;(<code style="user-select: auto;">'a'</code>, <code style="user-select: auto;">'e'</code>, <code style="user-select: auto;">'i'</code>, <code style="user-select: auto;">'o'</code>, <code style="user-select: auto;">'u'</code>)</li>
	<li style="user-select: auto;">Each vowel&nbsp;<code style="user-select: auto;">'a'</code> may only be followed by an <code style="user-select: auto;">'e'</code>.</li>
	<li style="user-select: auto;">Each vowel&nbsp;<code style="user-select: auto;">'e'</code> may only be followed by an <code style="user-select: auto;">'a'</code>&nbsp;or an <code style="user-select: auto;">'i'</code>.</li>
	<li style="user-select: auto;">Each vowel&nbsp;<code style="user-select: auto;">'i'</code> <strong style="user-select: auto;">may not</strong> be followed by another <code style="user-select: auto;">'i'</code>.</li>
	<li style="user-select: auto;">Each vowel&nbsp;<code style="user-select: auto;">'o'</code> may only be followed by an <code style="user-select: auto;">'i'</code> or a&nbsp;<code style="user-select: auto;">'u'</code>.</li>
	<li style="user-select: auto;">Each vowel&nbsp;<code style="user-select: auto;">'u'</code> may only be followed by an <code style="user-select: auto;">'a'.</code></li>
</ul>

<p style="user-select: auto;">Since the answer&nbsp;may be too large,&nbsp;return it modulo <code style="user-select: auto;">10^9 + 7.</code></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 1
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> All possible strings are: "a", "e", "i" , "o" and "u".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 2
<strong style="user-select: auto;">Output:</strong> 10
<strong style="user-select: auto;">Explanation:</strong> All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:&nbsp;</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 5
<strong style="user-select: auto;">Output:</strong> 68</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 2 * 10^4</code></li>
</ul>
</div>