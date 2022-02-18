# Max rectangle
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a binary matrix <strong style="user-select: auto;">M </strong>of size <strong style="user-select: auto;">n X m</strong>. Find the maximum area of a rectangle formed only of <strong style="user-select: auto;">1s</strong> in the given matrix. </span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 4, m = 4
M[][] = {{0 1 1 0},
         {1 1 1 1},
         {1 1 1 1},
         {1 1 0 0}}
<strong style="user-select: auto;">Output: </strong>8<strong style="user-select: auto;">
Explanation: </strong>For the above test case the
matrix will look like
0 1 1 0
1 1 1 1
1 1 1 1
1 1 0 0
the max size rectangle&nbsp;is&nbsp;
1 1 1 1
1 1 1 1
and area is 4 *2 = 8</span><span style="font-size: 18px; user-select: auto;">.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;</strong><br style="user-select: auto;">
Your task is to complete the function <strong style="user-select: auto;">maxArea</strong>&nbsp;which returns the maximum size rectangle area in a&nbsp;binary-sub-matrix with all 1’s. The function takes 3 arguments the first argument is&nbsp;the Matrix M[ ] [ ] and the next two are two&nbsp;integers n and m which denotes the size of the matrix M.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong> : O(n*m)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auixiliary Space</strong> : O(m)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1&lt;=n,m&lt;=1000<br style="user-select: auto;">
0&lt;=M[][]&lt;=1<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Note:</strong>The <strong style="user-select: auto;">Input/Ouput</strong> format and <strong style="user-select: auto;">Example</strong> given are used for system's internal purpose, and should be used by a user for <strong style="user-select: auto;">Expected Output</strong> only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.</span></p>
 <p style="user-select: auto;"></p>
            </div>