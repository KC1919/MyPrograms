The intuition behind this approach is that,
​
We start to traverse the string from the 1st character.
​
We extract the character at ith index.
Then we check if it is present in the hashset,
​
If it is not present means, the substring is fine and we update our max length including this character, and also we add this character to our hashset.
​
To keep track that this character has become a part of our string and if it occurs again we will be knowing it is repeating and we need to fix it.
​
So if the current character is already present in the hashset,
​
We start to remove all the characters one by one till we reach the duplicate character which is repeating.
​
As soon as we reach the duplicate character, we remove it from the hashSet and add the current character to the hashset.
​
And process the string further.
​
This process is repeated and at the end of the string we have with us the longest substring with non repeating characters.