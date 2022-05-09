the intuition behind this approach is mainly backtracking.
​
We took an String array which contains all the string that a particular key contains.
​
Suppose the string of characters at index 2 will have all the characters, that are present on key 2 in the keypad.
​
So now we start from the 1st key and move in order in which the keys are pressed.
​
We take all the keys one by one in order of their press.
​
We take a key, and get the string of characters it has on it.
​
Now we loop through all the characters because, any character can come from that key, so we have to explore all the cases.
​
So we take all the characters one by one and make a call to the next pressed key.
​
So now the next key will explore all its possibilities and append it with the previous key possibilities.
​
So thats how all the possible combinations are explored and when all the keys are explored and our base case is hit, we store the combination in the list and return.
​
​