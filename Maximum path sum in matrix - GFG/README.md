# Maximum path sum in matrix
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a NxN&nbsp;matrix&nbsp;of positive integers.&nbsp;There are only three possible moves from a cell <strong style="user-select: auto;">Matrix[r][c]</strong>.</span></p>

<ol style="user-select: auto;">
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Matrix [r+1] [c]</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Matrix [r+1] [c-1]</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Matrix [r+1] [c+1]</span></li>
</ol>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Starting from any column in row 0 return the largest sum of any of the paths up to row N-1.</span><br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> N = 2
Matrix = {{348, 391},
          {618, 193}}
<strong style="user-select: auto;">Output:</strong> 1009
<strong style="user-select: auto;">Explaination:</strong> The best path is 391 -&gt; 618. 
It gives the sum = 1009.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> N = 2
Matrix = {{2, 2},
          {2, 2}}
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explaination:</strong> No matter which path is 
chosen, the output is 4.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You do not need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">maximumPath() </strong>which takes the size N and the Matrix as input parameters and returns the highest maximum path sum.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N*N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(N*N)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 500<br style="user-select: auto;">
1 ≤ Matrix[i][j] ≤ 1000</span></p>
 <p style="user-select: auto;"></p>
            </div>