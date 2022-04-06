# Product array puzzle
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array <strong style="user-select: auto;">nums[]</strong> of size <strong style="user-select: auto;">n</strong>, construct a Product Array <strong style="user-select: auto;">P</strong> (of same size n) such that<strong style="user-select: auto;"> P[i]</strong> is equal to the product of all the elements of <strong style="user-select: auto;">nums</strong> except nums[i].</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 5
nums[] = {10, 3, 5, 6, 2}
<strong style="user-select: auto;">Output:
</strong>180 600 360 300 900<strong style="user-select: auto;">
Explanation: </strong>
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 2
nums[] = {12,0}
<strong style="user-select: auto;">Output:
</strong>0 12</span>

</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You do not have to read input. Your task is to complete the function&nbsp;<strong style="user-select: auto;">productExceptSelf() </strong>that takes array nums[] and n&nbsp;as input parameters and returns a list of n&nbsp;integers denoting the product array P.&nbsp;If the array has only one element the returned list should&nbsp;should contains one value i.e {1}</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:&nbsp;</strong>Try to solve this problem without using the division operation.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(n)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(n)</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= n &lt;= 1000<br style="user-select: auto;">
0 &lt;= nums<sub style="user-select: auto;">i</sub> &lt;= 200</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">Array&nbsp;may contain duplicates.</span></p>
 <p style="user-select: auto;"></p>
            </div>