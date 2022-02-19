# Smallest window in a string containing all the characters of another string
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two strings <strong style="user-select: auto;">S</strong> and <strong style="user-select: auto;">P</strong>. Find the smallest window in the string&nbsp;<strong style="user-select: auto;">S</strong> consisting of all the characters(<strong style="user-select: auto;">including duplicates</strong>) of the string&nbsp;<strong style="user-select: auto;">P</strong>.&nbsp;</span>&nbsp;<span style="font-size: 18px; user-select: auto;">Return "<strong style="user-select: auto;">-1</strong>" in case there is no such window present.&nbsp;In case there are multiple such windows of same length, return the one with the least starting index.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>S = "timetopractice"
P = "toc"
<strong style="user-select: auto;">Output: 
</strong>toprac<strong style="user-select: auto;">
Explanation: "</strong>toprac" is the smallest
substring in which "toc" can be found.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>S = "zoomlazapzo"
P = "oza"
<strong style="user-select: auto;">Output: 
</strong>apzo<strong style="user-select: auto;">
Explanation: </strong><strong style="user-select: auto;">"</strong>apzo" is the smallest 
substring in which "oza" can be found.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">smallestWindow()</strong> which takes two string <strong style="user-select: auto;">S</strong> and <strong style="user-select: auto;">P</strong> as input paramters&nbsp;and returns the smallest window in string <strong style="user-select: auto;">S</strong> having all the characters of the string <strong style="user-select: auto;">P</strong>. In case there are multiple such windows of same length, return the one with the least starting index.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity: </strong>O(|S|)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space: </strong>O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:&nbsp;</strong><br style="user-select: auto;">
1 ≤ |S|, |P| ≤ 10<sup style="user-select: auto;">5</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>