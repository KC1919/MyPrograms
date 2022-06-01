<h2><a href="https://leetcode.com/problems/redundant-connection/">684. Redundant Connection</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">In this problem, a tree is an <strong style="user-select: auto;">undirected graph</strong> that is connected and has no cycles.</p>

<p style="user-select: auto;">You are given a graph that started as a tree with <code style="user-select: auto;">n</code> nodes labeled from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>, with one additional edge added. The added edge has two <strong style="user-select: auto;">different</strong> vertices chosen from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>, and was not an edge that already existed. The graph is represented as an array <code style="user-select: auto;">edges</code> of length <code style="user-select: auto;">n</code> where <code style="user-select: auto;">edges[i] = [a<sub style="user-select: auto;">i</sub>, b<sub style="user-select: auto;">i</sub>]</code> indicates that there is an edge between nodes <code style="user-select: auto;">a<sub style="user-select: auto;">i</sub></code> and <code style="user-select: auto;">b<sub style="user-select: auto;">i</sub></code> in the graph.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an edge that can be removed so that the resulting graph is a tree of </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> nodes</em>. If there are multiple answers, return the answer that occurs last in the input.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/05/02/reduntant1-1-graph.jpg" style="width: 222px; height: 222px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> edges = [[1,2],[1,3],[2,3]]
<strong style="user-select: auto;">Output:</strong> [2,3]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/05/02/reduntant1-2-graph.jpg" style="width: 382px; height: 222px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
<strong style="user-select: auto;">Output:</strong> [1,4]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == edges.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">3 &lt;= n &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">edges[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= a<sub style="user-select: auto;">i</sub> &lt; b<sub style="user-select: auto;">i</sub> &lt;= edges.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">a<sub style="user-select: auto;">i</sub> != b<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;">There are no repeated edges.</li>
	<li style="user-select: auto;">The given graph is connected.</li>
</ul>
</div>