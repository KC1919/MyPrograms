# Search insert position of K in a sorted array
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a sorted array&nbsp;<strong style="user-select: auto;">Arr[]</strong>(0-index based)&nbsp;consisting of&nbsp;<strong style="user-select: auto;">N&nbsp;</strong>distinct integers and an integer <strong style="user-select: auto;">k</strong>, the task is to find the index of k, if it’s present in the array <strong style="user-select: auto;">Arr[]</strong>. Otherwise, find the index where <strong style="user-select: auto;">k</strong>&nbsp;must be inserted to keep the array sorted.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 4
Arr = {1 , 3, 5, 6}
k = 5
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explaination:</strong> Since 5 is found at index 2 
as arr[2] = 5, the output is 2.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 4
Arr = {1, 3, 5, 6}
k = 2
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explaination:</strong> Since 2 is not present in 
the array but can be inserted at index 1 
to make the array sorted.</span>
</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">searchInsertK()</strong>&nbsp;which takes the array <strong style="user-select: auto;">Arr[]</strong> and its size <strong style="user-select: auto;">N </strong>and <strong style="user-select: auto;">k&nbsp;</strong>as input parameters&nbsp;and returns the index.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(logN)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">4</sup><br style="user-select: auto;">
-10<sup style="user-select: auto;">3</sup> ≤ Arr[i]&nbsp;≤ 10<sup style="user-select: auto;">3</sup><br style="user-select: auto;">
-10<sup style="user-select: auto;">3</sup>&nbsp;≤ k&nbsp;≤ 10<sup style="user-select: auto;">3</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>