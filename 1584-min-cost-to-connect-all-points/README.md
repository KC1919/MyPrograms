<h2><a href="https://leetcode.com/problems/min-cost-to-connect-all-points/">1584. Min Cost to Connect All Points</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array <code style="user-select: auto;">points</code> representing integer coordinates of some points on a 2D-plane, where <code style="user-select: auto;">points[i] = [x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub>]</code>.</p>

<p style="user-select: auto;">The cost of connecting two points <code style="user-select: auto;">[x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub>]</code> and <code style="user-select: auto;">[x<sub style="user-select: auto;">j</sub>, y<sub style="user-select: auto;">j</sub>]</code> is the <strong style="user-select: auto;">manhattan distance</strong> between them: <code style="user-select: auto;">|x<sub style="user-select: auto;">i</sub> - x<sub style="user-select: auto;">j</sub>| + |y<sub style="user-select: auto;">i</sub> - y<sub style="user-select: auto;">j</sub>|</code>, where <code style="user-select: auto;">|val|</code> denotes the absolute value of <code style="user-select: auto;">val</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the minimum cost to make all points connected.</em> All points are connected if there is <strong style="user-select: auto;">exactly one</strong> simple path between any two points.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/08/26/d.png" style="width: 214px; height: 268px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
<strong style="user-select: auto;">Output:</strong> 20
<strong style="user-select: auto;">Explanation:</strong> 
<img alt="" src="https://assets.leetcode.com/uploads/2020/08/26/c.png" style="width: 214px; height: 268px; user-select: auto;">
We can connect the points as shown above to get the minimum cost of 20.
Notice that there is a unique path between every pair of points.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[3,12],[-2,5],[-4,1]]
<strong style="user-select: auto;">Output:</strong> 18
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= points.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">6</sup> &lt;= x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
	<li style="user-select: auto;">All pairs <code style="user-select: auto;">(x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub>)</code> are distinct.</li>
</ul>
</div>