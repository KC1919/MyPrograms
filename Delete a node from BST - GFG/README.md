# Delete a node from BST
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a Binary Search Tree and a node value X. Delete the node with the given value X from the BST. If no node with value x exists, then do not make any change.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>      2
&nbsp;   /   \
&nbsp;  1     3
X = 12
<strong style="user-select: auto;">Output: </strong>1 2 3<strong style="user-select: auto;">
Explanation: </strong>In the given input there
is no node with value 12 , so the tree
will remain same.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 1
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;\
 &nbsp; &nbsp;    &nbsp; &nbsp; &nbsp; 2
 &nbsp; &nbsp;&nbsp; &nbsp;       &nbsp;&nbsp;\
 &nbsp; &nbsp; &nbsp;        &nbsp;  8 
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;/&nbsp; &nbsp; \
 &nbsp; &nbsp; &nbsp; &nbsp;     &nbsp;5&nbsp;  &nbsp;  11
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;/&nbsp; \&nbsp; &nbsp; /  \
 &nbsp; &nbsp; &nbsp;     4 &nbsp; &nbsp;7&nbsp; 9 &nbsp;&nbsp;12
X = 9
<strong style="user-select: auto;">Output: </strong>1 2 4 5 7 8 11 12<strong style="user-select: auto;">
Explanation: </strong>In the given input tree after
deleting 9 will be
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  1
&nbsp; &nbsp; &nbsp; &nbsp;   &nbsp; &nbsp;&nbsp;\
&nbsp; &nbsp;     &nbsp;  &nbsp; &nbsp; 2
&nbsp; &nbsp;&nbsp; &nbsp;        &nbsp; &nbsp;\
&nbsp; &nbsp; &nbsp;        &nbsp;  &nbsp; 8
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp;  &nbsp;/&nbsp;  \
&nbsp; &nbsp; &nbsp; &nbsp;        &nbsp;5&nbsp; &nbsp;  11
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; /&nbsp; \&nbsp; &nbsp; &nbsp;\
&nbsp; &nbsp; &nbsp;         4 &nbsp; &nbsp;7&nbsp; &nbsp;&nbsp;&nbsp;12</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function</span><span style="font-size: 18px; user-select: auto;"> <strong style="user-select: auto;">deleteNode()</strong>&nbsp;which takes two&nbsp;arguments. The first being the root of the tree, and an integer <strong style="user-select: auto;">'X'</strong>&nbsp;denoting the node value to be deleted from the BST. Return the root of the BST after deleting the node with value X. Do not make any update if there's no node with value X present in the BST. </span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note: </strong>The generated output will be&nbsp;the inorder traversal of the modified tree.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(Height of the BST).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(Height of the BST).</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N &lt;= 10<sup style="user-select: auto;">5</sup></span></p>

<p style="user-select: auto;">&nbsp;</p>
 <p style="user-select: auto;"></p>
            </div>