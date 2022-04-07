# Maximize Number of 1's
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a binary array <strong style="user-select: auto;">arr</strong> of size <strong style="user-select: auto;">N</strong> and an integer <strong style="user-select: auto;">M</strong>. Find the maximum number of <strong style="user-select: auto;">consecutive 1's</strong> produced by flipping at most <strong style="user-select: auto;">M 0's</strong>.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 3
arr[] = {1, 0, 1}
M = 1
<strong style="user-select: auto;">Output:</strong>
3
<strong style="user-select: auto;">Explanation:</strong>
Maximum subarray is of size 3
which can be made subarray of all 1 after
flipping two zeros to 1.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 11
arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
M = 2
<strong style="user-select: auto;">Output:</strong>
8
<strong style="user-select: auto;">Explanation:</strong>
Maximum subarray is of size 8
which can be made subarray of all 1 after
flipping two zeros to 1.
</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Complete the function <strong style="user-select: auto;">findZeroes()</strong>&nbsp;which takes&nbsp;array&nbsp;<strong style="user-select: auto;">arr&nbsp;</strong>and two integers&nbsp;<strong style="user-select: auto;">n, m</strong>,&nbsp;as input parameters&nbsp;and <strong style="user-select: auto;">returns</strong> an integer denoting the answer. </span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1)</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N &lt;= 10<sup style="user-select: auto;">7</sup><br style="user-select: auto;">
0 &lt;= M &lt;= N<br style="user-select: auto;">
0 &lt;= arr<sub style="user-select: auto;">i</sub> &lt;= 1</span></p>
 <p style="user-select: auto;"></p>
            </div>