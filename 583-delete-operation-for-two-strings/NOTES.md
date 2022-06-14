the main intuition behind this problem is to **find the longest common subsequence between the two strings.**
​
That will give the length of the maximum common subsequence in both the strings.
​
And then **subtract that LCS length from both the strings and add the difference in length.**
​
That gives the minimum number of deletions required to make the strings equal.