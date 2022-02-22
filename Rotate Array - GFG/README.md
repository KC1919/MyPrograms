# Rotate Array
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an unsorted array <strong style="user-select: auto;">arr[]</strong> of size <strong style="user-select: auto;">N.</strong>&nbsp;Rotate the array to the left (counter-clockwise direction) by <strong style="user-select: auto;">D</strong> steps, where&nbsp;<strong style="user-select: auto;">D</strong>&nbsp;is a positive integer.&nbsp;</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 5, D = 2
arr[] = {1,2,3,4,5}
<strong style="user-select: auto;">Output: </strong>3 4 5 1 2<strong style="user-select: auto;">
</strong><strong style="user-select: auto;">Explanation: </strong>1 2 3 4 5&nbsp; when rotated
by 2 elements, it becomes 3 4 5 1 2.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 10, D = 3
arr[] = {2,4,6,8,10,12,14,16,18,20}
<strong style="user-select: auto;">Output: </strong>8 10 12 14 16 18 20 2 4 6<strong style="user-select: auto;">
Explanation: </strong>2 4 6 8 10 12 14 16 18 20&nbsp;
when rotated by 3 elements, it becomes 
8 10 12 14 16 18 20 2 4 6.</span>
</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your&nbsp;Task:</strong><br style="user-select: auto;">
Complete the function <strong style="user-select: auto;">rotateArr</strong>() which takes the array, D and N as input parameters and&nbsp;rotates the array by D elements. The array must be modified in-place without using extra space.&nbsp;</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(1)</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N &lt;= 10</span><sup style="user-select: auto;"><span style="font-size: 15px; user-select: auto;">6</span></sup><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= D &lt;= 10<sup style="user-select: auto;">6</sup></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">0 &lt;=&nbsp;arr[i] &lt;= 10</span><sup style="font-size: 18px; user-select: auto;">5</sup></p>
 <p style="user-select: auto;"></p>
            </div>