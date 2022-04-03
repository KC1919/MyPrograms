<h2><a href="https://leetcode.com/problems/odd-even-linked-list/">328. Odd Even Linked List</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">head</code> of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return <em style="user-select: auto;">the reordered list</em>.</p>

<p style="user-select: auto;">The <strong style="user-select: auto;">first</strong> node is considered <strong style="user-select: auto;">odd</strong>, and the <strong style="user-select: auto;">second</strong> node is <strong style="user-select: auto;">even</strong>, and so on.</p>

<p style="user-select: auto;">Note that the relative order inside both the even and odd groups should remain as it was in the input.</p>

<p style="user-select: auto;">You must solve the problem&nbsp;in <code style="user-select: auto;">O(1)</code>&nbsp;extra space complexity and <code style="user-select: auto;">O(n)</code> time complexity.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/10/oddeven-linked-list.jpg" style="width: 300px; height: 123px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [1,2,3,4,5]
<strong style="user-select: auto;">Output:</strong> [1,3,5,2,4]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/10/oddeven2-linked-list.jpg" style="width: 500px; height: 142px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [2,1,3,5,6,4,7]
<strong style="user-select: auto;">Output:</strong> [2,3,6,7,1,5,4]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n ==&nbsp;</code>number of nodes in the linked list</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= n &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">6</sup> &lt;= Node.val &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
</ul>
</div>