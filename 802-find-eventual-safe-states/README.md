<h2><a href="https://leetcode.com/problems/find-eventual-safe-states/">802. Find Eventual Safe States</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is a directed graph of <code style="user-select: auto;">n</code> nodes with each node labeled from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code>. The graph is represented by a <strong style="user-select: auto;">0-indexed</strong> 2D integer array <code style="user-select: auto;">graph</code> where <code style="user-select: auto;">graph[i]</code> is an integer array of nodes adjacent to node <code style="user-select: auto;">i</code>, meaning there is an edge from node <code style="user-select: auto;">i</code> to each node in <code style="user-select: auto;">graph[i]</code>.</p>

<p style="user-select: auto;">A node is a <strong style="user-select: auto;">terminal node</strong> if there are no outgoing edges. A node is a <strong style="user-select: auto;">safe node</strong> if every possible path starting from that node leads to a <strong style="user-select: auto;">terminal node</strong>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an array containing all the <strong style="user-select: auto;">safe nodes</strong> of the graph</em>. The answer should be sorted in <strong style="user-select: auto;">ascending</strong> order.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="Illustration of graph" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/03/17/picture1.png" style="height: 171px; width: 600px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> graph = [[1,2],[2,3],[5],[0],[5],[],[]]
<strong style="user-select: auto;">Output:</strong> [2,4,5,6]
<strong style="user-select: auto;">Explanation:</strong> The given graph is shown above.
Nodes 5 and 6 are terminal nodes as there are no outgoing edges from either of them.
Every path starting at nodes 2, 4, 5, and 6 all lead to either node 5 or 6.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
<strong style="user-select: auto;">Output:</strong> [4]
<strong style="user-select: auto;">Explanation:</strong>
Only node 4 is a terminal node, and every path starting at node 4 leads to node 4.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == graph.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= graph[i].length &lt;= n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= graph[i][j] &lt;= n - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">graph[i]</code> is sorted in a strictly increasing order.</li>
	<li style="user-select: auto;">The graph may contain self-loops.</li>
	<li style="user-select: auto;">The number of edges in the graph will be in the range <code style="user-select: auto;">[1, 4 * 10<sup style="user-select: auto;">4</sup>]</code>.</li>
</ul>
</div>