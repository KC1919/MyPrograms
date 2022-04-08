# K-th element of two sorted Arrays
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two sorted arrays <strong style="user-select: auto;">arr1</strong> and <strong style="user-select: auto;">arr2</strong> of size <strong style="user-select: auto;">N</strong>&nbsp;and <strong style="user-select: auto;">M</strong>&nbsp;respectively and an element <strong style="user-select: auto;">K</strong>. The task is to find the element that would be at the k’th position of the final sorted array.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
<strong style="user-select: auto;">Output:</strong>
6
<strong style="user-select: auto;">Explanation:</strong>
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
</span></pre>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></div>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
<strong style="user-select: auto;">Output:</strong>
256
<strong style="user-select: auto;">Explanation:</strong>
Final sorted array is - 72, 86, 100, 112,
113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">kthElement()</strong>&nbsp;which takes the arrays <strong style="user-select: auto;">arr1[]</strong>,&nbsp;<strong style="user-select: auto;">arr2[]</strong>, its size <strong style="user-select: auto;">N </strong>and <strong style="user-select: auto;">M </strong>respectively and an integer <strong style="user-select: auto;">K </strong>as inputs and returns the element at the Kth position.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(Log(N) + Log(M))<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(Log (N))</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N, M &lt;= 10<sup style="user-select: auto;">6</sup><br style="user-select: auto;">
1 &lt;= arr1<sub style="user-select: auto;">i</sub>, arr2<sub style="user-select: auto;">i</sub> &lt;&nbsp;INT_MAX<br style="user-select: auto;">
1 &lt;= K &lt;= N+M</span></p>
 <p style="user-select: auto;"></p>
            </div>