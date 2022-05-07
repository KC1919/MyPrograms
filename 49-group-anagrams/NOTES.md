The intuition behind this approach is that,
​
We take each word one by one from the string array.
​
We sort the word and check if a similar value already exists in the hashmap.
If it exists means a word with similar characters had previously occurred means that word is anagram with this word.
Since both the word have same value after sorting the characters.
So we add the word at the position of the word witht the similar value.
​
But if the value is not previously occurred and not present in the hashmap,
means this could be the first word of its group.
So we add it to the hashmap, with the count of its group.
And also we make a new group for this word and add it to the list of groups.
​
Similar;y we do thi for ll the words and in the end all the words are grouped together with their anagrams