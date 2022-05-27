# Prefix match with other strings
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array of strings <strong style="user-select: auto;">arr[]</strong> of size <strong style="user-select: auto;">n</strong> and given s a string <strong style="user-select: auto;">str</strong> and an integer <strong style="user-select: auto;">k</strong>. The task is to find the count of strings in <strong style="user-select: auto;">arr[]</strong> whose prefix of length <strong style="user-select: auto;">k</strong> matches with the <strong style="user-select: auto;">k</strong> length prefix of <strong style="user-select: auto;">str</strong>.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong></span>:
<span style="font-size: 18px; user-select: auto;">n = 6</span>
<span style="font-size: 18px; user-select: auto;">arr[] = {“abba”, “abbb”, “abbc”, “abbd”, 
“abaa”, “abca”}
str = “abbg”
k = 3
<strong style="user-select: auto;">Output:</strong>&nbsp;4&nbsp;
<strong style="user-select: auto;">Explanation</strong>:
“abba”, “abbb”, “abbc” and “abbd” are 
the matching strings.
</span>
</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 3
arr[] = {“geeks”, “geeksforgeeks”, “forgeeks”}
str = “geeks”
k = 2
<strong style="user-select: auto;">Output:&nbsp;</strong>2
</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">klengthpref()</strong>&nbsp;which takes the array of strings arr[], its size <strong style="user-select: auto;">n </strong>and an integer <strong style="user-select: auto;">k, </strong>a string<strong style="user-select: auto;"> str </strong>as input parameters&nbsp;and returns the </span><span style="font-size: 18px; user-select: auto;">count of strings in <strong style="user-select: auto;">arr[]</strong> whose prefix of length <strong style="user-select: auto;">k</strong> matches with the <strong style="user-select: auto;">k</strong> length prefix of <strong style="user-select: auto;">str</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(n*l) where l is the length of the longest word in arr[].<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(n*l) where l is the length of the longest word in arr[].</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= n &lt;= 1000</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1<sup style="user-select: auto;"> </sup>&lt;= |arr[i]| , |str| &lt;= 1000</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= k &lt;= 1000<br style="user-select: auto;">
arr[i], str must contain only lowercase english alphabets</span><br style="user-select: auto;">
&nbsp;</p>
 <p style="user-select: auto;"></p>
            </div>