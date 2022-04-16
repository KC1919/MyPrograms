# The Celebrity Problem
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.<br style="user-select: auto;">
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j &nbsp;is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.<br style="user-select: auto;">
<strong style="user-select: auto;">Note:</strong> Follow 0 based indexing.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation: </strong>0th and 2nd person both
know 1. Therefore, 1 is the celebrity. </span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 2
M[][] = {{0 1},
         {1 0}}
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation: </strong>The two people at the party both
know each other. None of them is a celebrity.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Complete the function <strong style="user-select: auto;">celebrity()</strong> which takes the matrix M and its size N as input parameters and returns the index of the celebrity. If no such celebrity is present, return -1.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
2 &lt;= N &lt;= 3000<br style="user-select: auto;">
0 &lt;= M[][] &lt;= 1</span></p>
 <p style="user-select: auto;"></p>
            </div>