# Longest Bitonic subsequence
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array of positive integers. Find&nbsp;the maximum length of Bitonic subsequence.&nbsp;<br style="user-select: auto;">
A subsequence of array&nbsp;is called Bitonic if it is first increasing, then decreasing.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>nums = [1, 2, 5, 3, 2]
<strong style="user-select: auto;">Output: </strong>5
<strong style="user-select: auto;">Explanation: </strong>The sequence {1, 2, 5} is
increasing and the sequence {3, 2} is 
decreasing so merging both we will get 
length 5.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>nums = [1, 11, 2, 10, 4, 5, 2, 1]
<strong style="user-select: auto;">Output: </strong>6
<strong style="user-select: auto;">Explanation: </strong>The bitonic sequence 
{1, 2, 10, 4, 2, 1} has length 6.
</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">LongestBitonicSequence()&nbsp;</strong>which takes the array nums[] as input parameter and returns the maximum length of bitonic subsequence.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(n<sup style="user-select: auto;">2</sup>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Complexity:&nbsp;</strong>O(n)</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤&nbsp;length of array ≤&nbsp;200<br style="user-select: auto;">
1 ≤&nbsp;arr[i] ≤&nbsp;1000000</span></p>
 <p style="user-select: auto;"></p>
            </div>