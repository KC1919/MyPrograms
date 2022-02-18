# Maximum Rectangular Area in a Histogram
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars. For simplicity, assume that all bars have the same width and the width is<strong style="user-select: auto;"> 1 unit</strong>, there will be <strong style="user-select: auto;">N</strong> bars height of each bar will be given by the array <strong style="user-select: auto;">arr</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 7
arr[] = {6,2,5,4,5,1,6</span><span style="font-size: 18px; user-select: auto;">}
<strong style="user-select: auto;">Output: </strong>12<strong style="user-select: auto;">
Explanation: 
</strong></span><img alt="" src="http://d1hyf4ir1gqw6c.cloudfront.net/wp-content/uploads/histogram1.png" class="img-responsive" style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">
</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 8
arr[] = {7 2 8 9 1 3 6 5</span><span style="font-size: 18px; user-select: auto;">}
<strong style="user-select: auto;">Output: </strong>16<strong style="user-select: auto;">
Explanation: </strong>Maximum size of the histogram 
will be 8&nbsp; and there will be 2 consecutive 
histogram. And hence the area of the 
histogram will be 8x2 = 16.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
The task is to complete the function&nbsp;<strong style="user-select: auto;">getMaxArea</strong>() which takes the array arr[] and its size N as inputs and&nbsp;finds the largest rectangular area possible and <strong style="user-select: auto;">returns</strong> the answer.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complxity</strong> : O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxilliary Space</strong> : O(N)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">6</sup><br style="user-select: auto;">
1 ≤ arr[i] ≤ 10<sup style="user-select: auto;">12</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>