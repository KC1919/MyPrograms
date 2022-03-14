# Subarrays with equal 1s and 0s
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array containing 0s and 1s. Find the number of&nbsp;subarrays having equal number of 0s and 1s. </span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">n = 7
A[] = {1,0,0,1,0,1,1}
<strong style="user-select: auto;">Output: </strong>8<strong style="user-select: auto;">
Explanation: </strong></span><span style="font-family: arial, helvetica, sans-serif; user-select: auto;"><span style="font-size: 18px; user-select: auto;">The index range for the 8 
sub-arrays are: (</span></span><span style="font-family: arial, helvetica, sans-serif; user-select: auto;"><span style="font-size: 18px; user-select: auto;">0, 1), (2, 3), (0, 3), (3, 4), 
(4, 5) ,</span></span><span style="font-family: arial, helvetica, sans-serif; user-select: auto;"><span style="font-size: 18px; user-select: auto;">(2, 5), (0, 5), (1, 6)</span></span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">n = 5
A[] = {1,1,1,1,0}
<strong style="user-select: auto;">Output: </strong>1<strong style="user-select: auto;">
Explanation: </strong></span><span style="font-family: arial, helvetica, sans-serif; user-select: auto;"><span style="font-size: 18px; user-select: auto;">The index range for the 
subarray is (3,4).</span></span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">countSubarrWithEqualZeroAndOne()</strong>&nbsp;which takes the array arr[] and the size of the array as inputs and returns the number of subarrays with equal number of 0s and 1s.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(n).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(n).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= n&nbsp;&lt;= 10<sup style="user-select: auto;">6</sup><br style="user-select: auto;">
0 &lt;= A[i] &lt;= 1</span></p>
 <p style="user-select: auto;"></p>
            </div>