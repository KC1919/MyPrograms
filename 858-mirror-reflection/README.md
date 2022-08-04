<h2><a href="https://leetcode.com/problems/mirror-reflection/">858. Mirror Reflection</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is a special square room with mirrors on each of the four walls. Except for the southwest corner, there are receptors on each of the remaining corners, numbered <code style="user-select: auto;">0</code>, <code style="user-select: auto;">1</code>, and <code style="user-select: auto;">2</code>.</p>

<p style="user-select: auto;">The square room has walls of length <code style="user-select: auto;">p</code>&nbsp;and a laser ray from the southwest corner first meets the east wall at a distance <code style="user-select: auto;">q</code> from the <code style="user-select: auto;">0<sup style="user-select: auto;">th</sup></code> receptor.</p>

<p style="user-select: auto;">Given the two integers <code style="user-select: auto;">p</code> and <code style="user-select: auto;">q</code>, return <em style="user-select: auto;">the number of the receptor that the ray meets first</em>.</p>

<p style="user-select: auto;">The test cases are guaranteed so that the ray will meet a receptor eventually.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/18/reflection.png" style="width: 218px; height: 217px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> p = 2, q = 1
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The ray meets receptor 2 the first time it gets reflected back to the left wall.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> p = 3, q = 1
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= q &lt;= p &lt;= 1000</code></li>
</ul>
</div>