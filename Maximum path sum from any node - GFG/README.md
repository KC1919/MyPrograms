# Maximum path sum from any node
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a binary tree,&nbsp;the task is to find the maximum path sum. The path may start and end at any node in the tree.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>     10
&nbsp;   /  \
&nbsp;  2   -25
&nbsp; / \  /  \
&nbsp;20 1  3  4
<strong style="user-select: auto;">Output: </strong>32<strong style="user-select: auto;">
Explanation: </strong>Path in the given tree goes
like 10 , 2 , 20 which gives the max
sum as 32.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>     10
&nbsp;  /    \
&nbsp; 2      5
          \
          -2
<strong style="user-select: auto;">Output: </strong>17<strong style="user-select: auto;">
Explanation: </strong>Path in the given tree goes
like 2 , 10 , 5&nbsp;which gives the max sum
as 17.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your&nbsp;Task:</strong><br style="user-select: auto;">
You don't need to take input or print anything. Your task is to <strong style="user-select: auto;">complete </strong>the function&nbsp;<strong style="user-select: auto;">findMaxSum()&nbsp;</strong>that takes <strong style="user-select: auto;">root </strong>as input and returns max sum between any two nodes in the given Binary Tree.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity: </strong>O(N).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space: </strong>O(Height of the Tree).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ Number of nodes ≤ 10<sup style="user-select: auto;">3</sup><br style="user-select: auto;">
1 ≤ |Data on node| ≤ 10<sup style="user-select: auto;">4</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>