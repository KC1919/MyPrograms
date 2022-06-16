# Minimum sum partition
## Hard 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an integer array <strong style="user-select: auto;">arr</strong> of size <strong style="user-select: auto;">N</strong>, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum and find the minimum difference</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: N = 4, arr[] = {1, 6, 11, 5}</span> <span style="font-size: 18px; user-select: auto;">
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation</strong>: </span>
<span style="font-size: 18px; user-select: auto;">Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11  </span> </pre>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></div>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>N = 2, arr[] = {1, 4}
<strong style="user-select: auto;">Output: </strong>3
<strong style="user-select: auto;">Explanation</strong>: 
Subset1 = {1}, sum of Subset1 = 1
Subset2 = {4}, sum of Subset2 = 4</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Complete the function <strong style="user-select: auto;"><code style="user-select: auto;">minDifference</code>()&nbsp;</strong>which takes <strong style="user-select: auto;">N</strong> and array <strong style="user-select: auto;">arr </strong>as input parameters and returns the integer value</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(<strong style="user-select: auto;">N*|sum of array elements|</strong>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(<strong style="user-select: auto;">N*|sum of array elements|</strong>)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤&nbsp;<strong style="user-select: auto;">N*|sum of array elements|</strong> ≤ 10<sup style="user-select: auto;">6</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>