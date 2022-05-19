# Longest Increasing Path in a Matrix
## Hard 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a matrix with <strong style="user-select: auto;">n</strong> rows and <strong style="user-select: auto;">m </strong>columns. Your task is to find the length of the longest increasing path in matrix, here increasing path means that the value in the specified path increases. For example if a path of length k has values a<sub style="user-select: auto;">1</sub>, a<sub style="user-select: auto;">2</sub>, a<sub style="user-select: auto;">3</sub>, .... a<sub style="user-select: auto;">k </sub>&nbsp;, then for every i from [2,k] this condition must hold a<sub style="user-select: auto;">i&nbsp;</sub>&gt; a<sub style="user-select: auto;">i-1</sub>.&nbsp; No cell should be revisited in the path.<br style="user-select: auto;">
From each cell, you can either move in four directions: left, right, up, or down. You are not allowed to move&nbsp;diagonally&nbsp;or move&nbsp;outside the boundary.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1</strong><strong style="user-select: auto;">:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 3, m = 3
matrix[][] = {{1 2 3},
&nbsp;             {4 5 6},
&nbsp;             {7 8 9}}
<strong style="user-select: auto;">Output: 
</strong>5<strong style="user-select: auto;">
Explanation: 
</strong>The longest increasing path is 
{1, 2, 3, 6, 9}. </span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2</strong><strong style="user-select: auto;">:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 3, m = 3
matrix[][] = {{3 4 5},
&nbsp;             {6 2 6},
&nbsp;             {2 2 1}}
<strong style="user-select: auto;">Output: 
</strong>4<strong style="user-select: auto;">
Explanation:
</strong>The longest increasing path is
{3, 4, 5, 6}.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You only need to implement the given function&nbsp;<strong style="user-select: auto;">longestIncreasingPath() </strong>which takes the two integers <strong style="user-select: auto;">n&nbsp;</strong>and <strong style="user-select: auto;">m&nbsp;</strong>and the matrix <strong style="user-select: auto;">matrix </strong>as input parameters, and&nbsp;returns the length of the longest increasing path in matrix.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(n*m)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(n*m)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤&nbsp;</span><span style="font-size: 18px; user-select: auto;">n,m ≤ 1</span><span style="font-size: 18px; user-select: auto;">000<br style="user-select: auto;">
0 ≤&nbsp;</span><span style="font-size: 18px; user-select: auto;">matrix[i] ≤&nbsp;</span><span style="font-size: 18px; user-select: auto;">2<sup style="user-select: auto;">30</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>