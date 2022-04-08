# Maximum Index
##  Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array <strong style="user-select: auto;">A[]</strong> of <strong style="user-select: auto;">N</strong> positive integers. The task is to&nbsp;find the maximum of <strong style="user-select: auto;">j - i</strong> subjected to the constraint of <strong style="user-select: auto;">A[i] <u style="user-select: auto;">&lt;</u>&nbsp;A[j] and i <u style="user-select: auto;">&lt;</u>&nbsp;j</strong>.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 2
A[] = {1, 10}
<strong style="user-select: auto;">Output:
</strong>1<strong style="user-select: auto;">
Explanation:
</strong>A[0]<u style="user-select: auto;">&lt;</u>A[1] so (j-i) is 1-0 = 1.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 9
A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
<strong style="user-select: auto;">Output:
</strong>6<strong style="user-select: auto;">
Explanation:
</strong>In the given array A[1] &lt; A[7]
satisfying the required 
condition(A[i] <u style="user-select: auto;">&lt;</u> A[j]) thus giving 
the maximum difference of j - i 
which is 6(7-1).</span>
</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
The task is to complete the function <strong style="user-select: auto;">maxIndexDiff</strong>() which finds and returns maximum index difference. Printing the output will be handled by driver code. Return <strong style="user-select: auto;">-1</strong> in case no such index is found.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(N)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">7</sup><br style="user-select: auto;">
0 ≤ A[i] ≤ 10<sup style="user-select: auto;">9</sup></span></p>

<p style="user-select: auto;">&nbsp;</p>
 <p style="user-select: auto;"></p>
            </div>