<h2><a href="https://leetcode.com/problems/word-break/">139. Word Break</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a string <code style="user-select: auto;">s</code> and a dictionary of strings <code style="user-select: auto;">wordDict</code>, return <code style="user-select: auto;">true</code> if <code style="user-select: auto;">s</code> can be segmented into a space-separated sequence of one or more dictionary words.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note</strong> that the same word in the dictionary may be reused multiple times in the segmentation.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "leetcode", wordDict = ["leet","code"]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> Return true because "leetcode" can be segmented as "leet code".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "applepenapple", wordDict = ["apple","pen"]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 300</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= wordDict.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= wordDict[i].length &lt;= 20</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> and <code style="user-select: auto;">wordDict[i]</code> consist of only lowercase English letters.</li>
	<li style="user-select: auto;">All the strings of <code style="user-select: auto;">wordDict</code> are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>