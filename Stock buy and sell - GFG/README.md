# Stock buy and sell
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">The cost of stock on each day is given in an array <strong style="user-select: auto;">A</strong>[] of size <strong style="user-select: auto;">N</strong>. Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.<br style="user-select: auto;">
<strong style="user-select: auto;">Note: </strong>There may be multiple possible solutions. Return any one of them. Any correct solution will result in an output of <strong style="user-select: auto;">1</strong>, whereas wrong solutions will result in an output of <strong style="user-select: auto;">0</strong>.<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 7
A[] = {100,180,260,310,40,535,695}
<strong style="user-select: auto;">Output:</strong>
1
<strong style="user-select: auto;">Explanation:
</strong>One possible solution is (0 3) (4 6)
We can buy stock on day 0,
and sell it on 3rd day, which will 
give us maximum profit. Now, we buy 
stock on day 4 and sell it on day 6.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 5
A[] = {4,2,2,2,4}
<strong style="user-select: auto;">Output:</strong>
1
<strong style="user-select: auto;">Explanation:
</strong>There are multiple possible solutions.
one of them is (3 4)<strong style="user-select: auto;">
</strong>We can buy stock on day 3,
and sell it on 4th day, which will 
give us maximum profit.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
The task is to complete the function <strong style="user-select: auto;">stockBuySell()</strong> which takes an array A[] and N as input parameters and finds the days of buying and selling stock. The function must return a 2D list of integers containing all the buy-sell pairs. If there is No Profit, return an empty list. </span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:</strong></span>&nbsp;<span style="font-size: 18px; user-select: auto;">Since there can be multiple solutions</span>, <span style="font-size: 18px; user-select: auto;">the driver code will return 1 if your answer is correct, otherwise, it will return 0. In case there's no profit the driver code will return the string "No Profit" for a correct solution.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(N)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
2 ≤&nbsp;N ≤&nbsp;10<sup style="user-select: auto;">6</sup><br style="user-select: auto;">
0 ≤&nbsp;A[i] ≤&nbsp;10<sup style="user-select: auto;">6</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>