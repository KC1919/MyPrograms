# Anagram of String
## Easy
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two strings<strong style="user-select: auto;"> S1 and S2</strong> in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the&nbsp;<strong style="user-select: auto;">minimum number of characters to be deleted</strong> to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">S1 = bcadeh
S2 = hea
<strong style="user-select: auto;">Output: </strong>3<strong style="user-select: auto;">
Explanation: </strong>We need to remove b, c
and d from S1.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">S1 = cddgk
S2 = gcd
<strong style="user-select: auto;">Output: </strong>2<strong style="user-select: auto;">
Explanation: </strong>We need to remove d and
k from S1.</span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">Complete&nbsp;the function&nbsp;<strong style="user-select: auto;">remAnagram()&nbsp;</strong>which takes two strings <strong style="user-select: auto;">S1, S2</strong>&nbsp;as input parameter, and returns minimum characters needs to be deleted.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(max(|S1|, |S2|)), where |S| = length of string S.<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(26)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= |S1|, |S2| &lt;= 10<sup style="user-select: auto;">5</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>