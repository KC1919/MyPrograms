# Three Sum Closest
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array <strong style="user-select: auto;">Arr</strong>&nbsp;of <strong style="user-select: auto;">N</strong> numbers and another number <strong style="user-select: auto;">target</strong>,&nbsp;find three integers in the array&nbsp;such that the sum is closest to target. Return the sum of the three integers.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 6, target = 2
A[] = {-7,9,8,3,1,1}
<strong style="user-select: auto;">Output: </strong>2<strong style="user-select: auto;">
Explanation: </strong>There is one triplet with sum
2 in the array. Triplet elements are -7,8,
1 whose sum is 2.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 4, target = 13
A[] = {5,2,7,5}
<strong style="user-select: auto;">Output: </strong>14<strong style="user-select: auto;">
Explanation: </strong>There is one triplet with sum
12&nbsp;and other with sum 14&nbsp;in the array.
Triplet elements are 5, 2, 5&nbsp;and 2, 7, 5
respectively. Since abs(13-12) ==
abs(13-14) maximum triplet sum will be
preferred i.e 14.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Complete&nbsp;<strong style="user-select: auto;">threeSumClosest()</strong>&nbsp;function and return the expected answer.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">NOTE: </strong>If their exists more than one answer then return the maximum sum.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N*N).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
3 ≤ N ≤ 10<sup style="user-select: auto;">3</sup><br style="user-select: auto;">
-10<sup style="user-select: auto;">5</sup> ≤ A[i] ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ target&nbsp;≤ 10<sup style="user-select: auto;">5</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>