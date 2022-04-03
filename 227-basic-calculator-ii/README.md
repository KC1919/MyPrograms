<h2><a href="https://leetcode.com/problems/basic-calculator-ii/">227. Basic Calculator II</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a string <code style="user-select: auto;">s</code> which represents an expression, <em style="user-select: auto;">evaluate this expression and return its value</em>.&nbsp;</p>

<p style="user-select: auto;">The integer division should truncate toward zero.</p>

<p style="user-select: auto;">You may assume that the given expression is always valid. All intermediate results will be in the range of <code style="user-select: auto;">[-2<sup style="user-select: auto;">31</sup>, 2<sup style="user-select: auto;">31</sup> - 1]</code>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong> You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as <code style="user-select: auto;">eval()</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "3+2*2"
<strong style="user-select: auto;">Output:</strong> 7
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = " 3/2 "
<strong style="user-select: auto;">Output:</strong> 1
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = " 3+5 / 2 "
<strong style="user-select: auto;">Output:</strong> 5
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 3 * 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of integers and operators <code style="user-select: auto;">('+', '-', '*', '/')</code> separated by some number of spaces.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> represents <strong style="user-select: auto;">a valid expression</strong>.</li>
	<li style="user-select: auto;">All the integers in the expression are non-negative integers in the range <code style="user-select: auto;">[0, 2<sup style="user-select: auto;">31</sup> - 1]</code>.</li>
	<li style="user-select: auto;">The answer is <strong style="user-select: auto;">guaranteed</strong> to fit in a <strong style="user-select: auto;">32-bit integer</strong>.</li>
</ul>
</div>