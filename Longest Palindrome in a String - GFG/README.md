# Longest Palindrome in a String
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a string S, find the longest palindromic substring in S.<strong style="user-select: auto;"> Substring of string S:</strong></span><span style="font-size: 18px; user-select: auto;"> S[ i . . . . j ]&nbsp;where 0&nbsp;≤ i&nbsp;≤ j &lt; len(S)<strong style="user-select: auto;">. Palindrome string:</strong></span><span style="font-size: 18px; user-select: auto;"> A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.</span><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;"> Incase of conflict</strong>, return the substring which occurs first ( with the least starting index).</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
S = "aaaabbaa"
<strong style="user-select: auto;">Output:</strong> aabbaa
<strong style="user-select: auto;">Explanation</strong>: The longest Palindromic
substring is "aabbaa".</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: 
S = "abc"
<strong style="user-select: auto;">Output:</strong> a
<strong style="user-select: auto;">Explanation</strong>: "a", "b" and "c" are the 
longest palindromes with same length.
The result is the one with the least
starting index.</span>
</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">longestPalin()&nbsp;</strong>which takes the string S&nbsp;as input and returns the longest palindromic substring of S.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(|S|<sup style="user-select: auto;">2</sup>).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ |S| ≤ 10<sup style="user-select: auto;">3</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>