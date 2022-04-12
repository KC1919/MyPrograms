# Left most and right most index
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element <strong style="user-select: auto;">X</strong> in the given array.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Note: </span></strong><span style="font-size: 18px; user-select: auto;">If the element is not present in the array <strong style="user-select: auto;">return {-1,-1} as pair</strong>.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong>
2 5</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:
</strong>Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 9
v[] = {1, 3, 5, 5, 5, 5, 7, 123, 125}
X = 7
<strong style="user-select: auto;">Output:</strong>
6 6</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">indexes()</strong>&nbsp;which takes the array <strong style="user-select: auto;">v[]</strong><strong style="user-select: auto;">&nbsp;</strong>and an integer <strong style="user-select: auto;">X&nbsp;</strong>as inputs and returns &nbsp;the first and last occurrence of the element <strong style="user-select: auto;">X</strong>. If the element is not present in the array <strong style="user-select: auto;">return {-1,-1} as pair</strong>.<br style="user-select: auto;">
<br style="user-select: auto;">
Can you solve the problem in expected time complexity?</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(Log(N))<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ v[i], X ≤ 10<sup style="user-select: auto;">18</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>