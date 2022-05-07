the intuition behind this approach is that,
​
for the two strings to be anagram of each other,
all the characters in string s should match with all the characters in string t.
​
​
The order of character does not matter, but the count of every character should be same in both the strings.
​
So every time we take a character from s, we increment its count in the count array,
and whenever we take a character from t we decrement the count at its corresponding position.
​
So this is how, if the strings were anagram
​
So the count at every position in the count array should be zero, because each increment from s, would have got cancelled by each decrement from character in t.
​
But if atany place in the count array the count is not 0, means there were some unequal number of characters in both strings.
​
Means they are not anagrams.