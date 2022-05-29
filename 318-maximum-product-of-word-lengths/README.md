<h2><a href="https://leetcode.com/problems/maximum-product-of-word-lengths/">318. Maximum Product of Word Lengths</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a string array <code style="user-select: auto;">words</code>, return <em style="user-select: auto;">the maximum value of</em> <code style="user-select: auto;">length(word[i]) * length(word[j])</code> <em style="user-select: auto;">where the two words do not share common letters</em>. If no such two words exist, return <code style="user-select: auto;">0</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["abcw","baz","foo","bar","xtfn","abcdef"]
<strong style="user-select: auto;">Output:</strong> 16
<strong style="user-select: auto;">Explanation:</strong> The two words can be "abcw", "xtfn".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["a","ab","abc","d","cd","bcd","abcd"]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> The two words can be "ab", "cd".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["a","aa","aaa","aaaa"]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> No such pair of words.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= words.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words[i].length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists only of lowercase English letters.</li>
</ul>
</div>