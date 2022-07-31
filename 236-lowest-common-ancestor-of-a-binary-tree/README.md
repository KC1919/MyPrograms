<h2><a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/">236. Lowest Common Ancestor of a Binary Tree</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.</p>

<p style="user-select: auto;">According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor" target="_blank" style="user-select: auto;">definition of LCA on Wikipedia</a>: “The lowest common ancestor is defined between two nodes <code style="user-select: auto;">p</code> and <code style="user-select: auto;">q</code> as the lowest node in <code style="user-select: auto;">T</code> that has both <code style="user-select: auto;">p</code> and <code style="user-select: auto;">q</code> as descendants (where we allow <b style="user-select: auto;">a node to be a descendant of itself</b>).”</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/14/binarytree.png" style="width: 200px; height: 190px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> The LCA of nodes 5 and 1 is 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/14/binarytree.png" style="width: 200px; height: 190px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2], p = 1, q = 2
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[2, 10<sup style="user-select: auto;">5</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">9</sup> &lt;= Node.val &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;">All <code style="user-select: auto;">Node.val</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">p != q</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">p</code> and <code style="user-select: auto;">q</code> will exist in the tree.</li>
</ul>
</div>