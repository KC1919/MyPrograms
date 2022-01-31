# Find a pair with given target in BST
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a Binary Search Tree and a target sum. Check whether there's a pair of Nodes in the BST with value summing up to the target sum.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
&nbsp;       </strong>2<strong style="user-select: auto;">
</strong>      /   \
&nbsp;    1     3
sum = 5
<strong style="user-select: auto;">Output: </strong>1 
<strong style="user-select: auto;">Explanation: </strong>
Nodes with value 2 and 3 sum up to 5.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>           6
&nbsp;         /    
&nbsp;        5     
&nbsp;       /
&nbsp;      3 
&nbsp;    /  \
&nbsp;   1    4<strong style="user-select: auto;">
</strong>sum = 2
<strong style="user-select: auto;">Output: </strong>0 
<strong style="user-select: auto;">Explanation: </strong>
There's no pair that sums up to 2.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function</span><span style="font-size: 18px; user-select: auto;">&nbsp;<strong style="user-select: auto;">isPairPresent()&nbsp;</strong>that takes <strong style="user-select: auto;">a root node </strong>and a target value as a parameter and returns 1 if there's a pair of Nodes in the BST with values summing up to the target sum, else returns 0.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(Height of the BST).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ Number of Nodes ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ Sum ≤ 10<sup style="user-select: auto;">6</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>