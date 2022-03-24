<h2><a href="https://leetcode.com/problems/powerful-integers/">970. Powerful Integers</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given three integers <code style="user-select: auto;">x</code>, <code style="user-select: auto;">y</code>, and <code style="user-select: auto;">bound</code>, return <em style="user-select: auto;">a list of all the <strong style="user-select: auto;">powerful integers</strong> that have a value less than or equal to</em> <code style="user-select: auto;">bound</code>.</p>

<p style="user-select: auto;">An integer is <strong style="user-select: auto;">powerful</strong> if it can be represented as <code style="user-select: auto;">x<sup style="user-select: auto;">i</sup> + y<sup style="user-select: auto;">j</sup></code> for some integers <code style="user-select: auto;">i &gt;= 0</code> and <code style="user-select: auto;">j &gt;= 0</code>.</p>

<p style="user-select: auto;">You may return the answer in <strong style="user-select: auto;">any order</strong>. In your answer, each value should occur <strong style="user-select: auto;">at most once</strong>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> x = 2, y = 3, bound = 10
<strong style="user-select: auto;">Output:</strong> [2,3,4,5,7,9,10]
<strong style="user-select: auto;">Explanation:</strong>
2 = 2<sup style="user-select: auto;">0</sup> + 3<sup style="user-select: auto;">0</sup>
3 = 2<sup style="user-select: auto;">1</sup> + 3<sup style="user-select: auto;">0</sup>
4 = 2<sup style="user-select: auto;">0</sup> + 3<sup style="user-select: auto;">1</sup>
5 = 2<sup style="user-select: auto;">1</sup> + 3<sup style="user-select: auto;">1</sup>
7 = 2<sup style="user-select: auto;">2</sup> + 3<sup style="user-select: auto;">1</sup>
9 = 2<sup style="user-select: auto;">3</sup> + 3<sup style="user-select: auto;">0</sup>
10 = 2<sup style="user-select: auto;">0</sup> + 3<sup style="user-select: auto;">2</sup>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> x = 3, y = 5, bound = 15
<strong style="user-select: auto;">Output:</strong> [2,4,6,8,10,14]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= x, y &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= bound &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
</ul>
</div>