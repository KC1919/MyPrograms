# Partition Equal Subset Sum
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array&nbsp;<strong style="user-select: auto;">arr[]</strong> of size&nbsp;<strong style="user-select: auto;">N</strong>, check if&nbsp;it can be partitioned into two parts such that the sum of elements in both parts&nbsp;is the same.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> N = 4
arr = {1, 5, 11, 5}
<strong style="user-select: auto;">Output:</strong> YES
<strong style="user-select: auto;">Explaination:</strong> 
The two parts are {1, 5, 5} and {11}.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> N = 3
arr = {1, 3, 5}
<strong style="user-select: auto;">Output:</strong> NO
<strong style="user-select: auto;">Explaination: </strong>This array can never be 
partitioned into two such parts.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You do not need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">equalPartition()</strong> which takes the value N and the array as input parameters and returns 1 if the partition is possible. Otherwise, returns 0.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N*sum of elements)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(N*sum of elements)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 100<br style="user-select: auto;">
1 ≤ arr[i] ≤ 1000</span></p>
 <p style="user-select: auto;"></p>
            </div>