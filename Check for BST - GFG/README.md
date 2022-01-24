# Check for BST
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given the root of a&nbsp;binary tree. Check whether it is a BST or not.<br style="user-select: auto;">
<strong style="user-select: auto;">Note: </strong>We are considering that BSTs can not contain duplicate Nodes.</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">A&nbsp;<strong style="user-select: auto;">BST</strong>&nbsp;is defined as follows:</span></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">
	<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">The left subtree of a node contains only nodes with keys <strong style="user-select: auto;">less than</strong> the node's key.</span></div>
	</li>
	<li style="user-select: auto;">
	<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">The right subtree of a node contains only nodes with keys <strong style="user-select: auto;">greater than</strong> the node's key.</span></div>
	</li>
	<li style="user-select: auto;">
	<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Both the left and right subtrees must also be binary search trees.</span></div>
	</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>&nbsp; &nbsp;2
 /&nbsp; &nbsp; \
1&nbsp; &nbsp; &nbsp; 3
<strong style="user-select: auto;">Output: </strong>1 
<strong style="user-select: auto;">Explanation: </strong></span>
<span style="font-size: 18px; user-select: auto;">The left subtree of root node contains node
with key lesser than the root nodes key and 
the right subtree of root node contains node 
with key greater than the root nodes key.
Hence, the tree is a BST.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>  2
&nbsp;  \
&nbsp;   7
&nbsp;    \
&nbsp;     6
&nbsp;      \
&nbsp;       5
&nbsp;        \
&nbsp;         9
&nbsp;          \
&nbsp;           2
&nbsp;            \
&nbsp;             6
<strong style="user-select: auto;">Output: </strong>0 
<strong style="user-select: auto;">Explanation: </strong>
Since the node with value 7 has right subtree 
nodes with keys less than 7, this is not a BST.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;</span><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">isBST()</strong> which takes the root of the tree as a parameter and returns <strong style="user-select: auto;">true</strong>&nbsp;if the given binary tree is BST, else returns <strong style="user-select: auto;">false</strong>.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(Height of the BST).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
0 &lt;= Number of edges &lt;= 100000</span></p>
 <p style="user-select: auto;"></p>
            </div>