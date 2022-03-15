# Count distinct elements in every window
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
<strong style="user-select: auto;">Output: </strong>3 4 4 3<strong style="user-select: auto;">
Explanation: </strong>Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 3.&nbsp;
Window 2&nbsp;of size k = 4 is&nbsp;2 1 3 4.&nbsp;</span><span style="font-size: 18px; user-select: auto;">Number
of distinct elements in this window are 4.</span>
<span style="font-size: 18px; user-select: auto;">Window 3&nbsp;of size k = 4 is&nbsp;1 3 4 2.&nbsp;</span><span style="font-size: 18px; user-select: auto;">Number
of distinct elements in this window are 4.</span>
<span style="font-size: 18px; user-select: auto;">Window 4&nbsp;of size k = 4 is&nbsp;</span><span style="font-size: 18px; user-select: auto;">3 4 2 3.&nbsp;Number
of distinct elements in this window are 3.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">N = 3, K = 2
A[] = {4,1,1}
<strong style="user-select: auto;">Output: </strong>2 1</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Your task is to complete the function&nbsp;<strong style="user-select: auto;">countDistinct()</strong>&nbsp;which takes the array A[], the size of the array(N) and the window size(K) as inputs and returns an array containing the count of distinct elements in every contiguous window of size K in the array A[].</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= K&nbsp;&lt;= N&nbsp;&lt;= 10<sup style="user-select: auto;">5</sup></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= A[i] &lt;= 10<sup style="user-select: auto;">5&nbsp;</sup>, for each valid i</span></p>
 <p style="user-select: auto;"></p>
            </div>