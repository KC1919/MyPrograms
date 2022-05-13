<h2><a href="https://leetcode.com/problems/subtree-of-another-tree/">572. Subtree of Another Tree</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the roots of two binary trees <code style="user-select: auto;">root</code> and <code style="user-select: auto;">subRoot</code>, return <code style="user-select: auto;">true</code> if there is a subtree of <code style="user-select: auto;">root</code> with the same structure and node values of<code style="user-select: auto;"> subRoot</code> and <code style="user-select: auto;">false</code> otherwise.</p>

<p style="user-select: auto;">A subtree of a binary tree <code style="user-select: auto;">tree</code> is a tree that consists of a node in <code style="user-select: auto;">tree</code> and all of this node's descendants. The tree <code style="user-select: auto;">tree</code> could also be considered as a subtree of itself.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/28/subtree1-tree.jpg" style="width: 532px; height: 400px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [3,4,5,1,2], subRoot = [4,1,2]
<strong style="user-select: auto;">Output:</strong> true
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/28/subtree2-tree.jpg" style="width: 502px; height: 458px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the <code style="user-select: auto;">root</code> tree is in the range <code style="user-select: auto;">[1, 2000]</code>.</li>
	<li style="user-select: auto;">The number of nodes in the <code style="user-select: auto;">subRoot</code> tree is in the range <code style="user-select: auto;">[1, 1000]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= root.val &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= subRoot.val &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>