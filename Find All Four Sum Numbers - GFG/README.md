# Find All Four Sum Numbers
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array of integers and another number. Find all the <strong style="user-select: auto;">unique&nbsp;</strong>quadruple from the given array that sums up to the given number.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 5, K = 3
A[] = {0,0,2,1,1}
<strong style="user-select: auto;">Output: </strong>0 0 1 2 $<strong style="user-select: auto;">
Explanation: </strong>Sum of 0, 0, 1, 2 is equal
to K.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 7, K = 23
A[] = {10,2,3,4,5,7,8}
<strong style="user-select: auto;">Output: </strong>2 3 8 10 $2 4 7 10 $3 5 7 8 $<strong style="user-select: auto;">
Explanation: </strong>Sum of 2, 3, 8, 10 = 23,
sum of 2, 4, 7, 10 = 23 and sum of 3,
5, 7, 8 = 23.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">fourSum()</strong>&nbsp;which takes the array arr[] and the integer k as its input and returns an array containing all the quadruples in a lexicographical manner. Also note that all the quadruples should be internally sorted, ie for any quadruple [q1, q2, q3, q4] the following should follow: q1 &lt;= q2 &lt;= q3 &lt;= q4.&nbsp; (In the output each quadruple is separate by $. The printing is done by the driver's code)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N<sup style="user-select: auto;">3</sup>).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(N<sup style="user-select: auto;">2</sup>).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N &lt;= 100<br style="user-select: auto;">
-1000 &lt;= K &lt;= 1000<br style="user-select: auto;">
-100 &lt;= A[] &lt;= 100</span><br style="user-select: auto;">
&nbsp;</p>
 <p style="user-select: auto;"></p>
            </div>