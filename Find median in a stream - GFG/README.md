# Find median in a stream
## Hard 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an input stream of <strong style="user-select: auto;">N</strong> integers. The task is to insert these numbers into a new stream and find the median of the stream formed by each insertion of <strong style="user-select: auto;">X</strong> to the new stream.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 4
X[] = 5,15,1,3
<strong style="user-select: auto;">Output:
</strong>5</span>
<span style="font-size: 18px; user-select: auto;">10</span>
<span style="font-size: 18px; user-select: auto;">5</span>
<span style="font-size: 18px; user-select: auto;">4<strong style="user-select: auto;">
Explanation:</strong>Flow in stream : 5, 15, 1, 3 </span>
<span style="font-size: 18px; user-select: auto;">5 goes to stream --&gt; median 5 (5) </span>
<span style="font-size: 18px; user-select: auto;">15 goes to stream --&gt; median 10 (5,15) </span>
<span style="font-size: 18px; user-select: auto;">1 goes to stream --&gt; median 5 (5,15,1) </span>
<span style="font-size: 18px; user-select: auto;">3 goes to stream --&gt; median 4 (5,15,1 3) </span>
</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 3
X[] = 5,10,15
<strong style="user-select: auto;">Output:
</strong>5</span>
<span style="font-size: 18px; user-select: auto;">7.5</span>
<span style="font-size: 18px; user-select: auto;">10</span><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">
Explanation:</strong>Flow in stream : 5, 10, 15</span>
<span style="font-size: 18px; user-select: auto;">5 goes to stream --&gt; median 5 (5) </span>
<span style="font-size: 18px; user-select: auto;">10 goes to stream --&gt; median 7.5 (5,10) </span>
<span style="font-size: 18px; user-select: auto;">15 goes to stream --&gt; median 10 (5,10,15) </span>
</pre>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You are required to complete the class Solution.&nbsp;<br style="user-select: auto;">
It should have 2 data members to represent 2 heaps.&nbsp;<br style="user-select: auto;">
It should have the following member functions:</span></div>

<ol style="user-select: auto;">
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">insertHeap()</strong> which takes <strong style="user-select: auto;">x&nbsp;</strong>as&nbsp;input and inserts it into the heap, the function should then call <strong style="user-select: auto;">balanceHeaps() </strong>to balance the new heap.</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">balanceHeaps()&nbsp;</strong>does not take any arguments. It is supposed to balance the two&nbsp;heaps.</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">getMedian() </strong>does not take any arguments. It should&nbsp;return&nbsp;the current median of the stream.</span></li>
</ol>

<div style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong> : O(nlogn)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxilliary Space</strong> : O(n)</span></div>

<div style="user-select: auto;">&nbsp;</div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1<strong style="user-select: auto;"> </strong>&lt;= N &lt;= 10<sup style="user-select: auto;">6</sup></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= x &lt;= 10<sup style="user-select: auto;">6</sup></span></div>

<div style="user-select: auto;">&nbsp;</div>
 <p style="user-select: auto;"></p>
            </div>