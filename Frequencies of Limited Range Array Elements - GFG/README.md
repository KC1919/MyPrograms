# Frequencies of Limited Range Array Elements
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array A[] of N&nbsp;positive integers which can contain integers from 1&nbsp;to P&nbsp;where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1&nbsp;to N.</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:</strong> The elements greater than N&nbsp;in the array can be ignored for counting.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
<strong style="user-select: auto;">Output:
</strong>0 2 2 0 1<strong style="user-select: auto;">
Explanation: </strong>
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 4
arr[] = {3,3,3,3}
P = 3
<strong style="user-select: auto;">Output:
</strong>0 0 4 0<strong style="user-select: auto;">
Explanation: 
</strong>Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 0 times.
3 occurring 4 times.
4 occurring 0 times.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Complete the function <strong style="user-select: auto;">frequencycount() </strong>that takes the array and n&nbsp;as input parameters and modify the&nbsp;array in place to denote the frequency count of each element from 1 to N. i,e&nbsp;element at index 0 should represent the frequency of 1 and so on.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:&nbsp;</strong>Can you solve this problem without using extra space (O(1) Space) !</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N&nbsp;≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ P&nbsp;≤ 4*10<sup style="user-select: auto;">4</sup><sup style="user-select: auto;">&nbsp;</sup><br style="user-select: auto;">
1 &lt;= A[i] &lt;= P</span></p>
 <p style="user-select: auto;"></p>
            </div>