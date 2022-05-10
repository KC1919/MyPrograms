<h2><a href="https://leetcode.com/problems/daily-temperatures/">739. Daily Temperatures</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of integers <code style="user-select: auto;">temperatures</code> represents the daily temperatures, return <em style="user-select: auto;">an array</em> <code style="user-select: auto;">answer</code> <em style="user-select: auto;">such that</em> <code style="user-select: auto;">answer[i]</code> <em style="user-select: auto;">is the number of days you have to wait after the</em> <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> <em style="user-select: auto;">day to get a warmer temperature</em>. If there is no future day for which this is possible, keep <code style="user-select: auto;">answer[i] == 0</code> instead.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> temperatures = [73,74,75,71,69,72,76,73]
<strong style="user-select: auto;">Output:</strong> [1,1,4,2,1,1,0,0]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> temperatures = [30,40,50,60]
<strong style="user-select: auto;">Output:</strong> [1,1,1,0]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> temperatures = [30,60,90]
<strong style="user-select: auto;">Output:</strong> [1,1,0]
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;=&nbsp;temperatures.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">30 &lt;=&nbsp;temperatures[i] &lt;= 100</code></li>
</ul>
</div>