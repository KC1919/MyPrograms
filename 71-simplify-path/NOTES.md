Firstly we split the path on slashes.
​
Then as all the slashes are removed, so we add a slash in the stack before begining our working, since a path always starts with a slash "/" .
​
Now we iterate over our path array and pick the element at ith index.
​
We check if it is a blank space "" or a single dot "." we continue. as it would not affect our path so we dont consider them.
​
If the element is a double dot ".." , which means we have to go one level up in the directory.
​
So we check if the size of the stack is not zero, we start popping elements till we see a slash at the peek, which means we have moved one level up, by popping up the current directory.
​
Finally if the size of the stack is not 0, we pop the slash, which marks the seperation of two levels.
​
If the stack gets empty after popping the slash, we push a slash into the stack, as it marks the start of the path.
​
If anything comes other than ".." , "." , "" we simply push it into the stack as it is considered a filename, so we also push a slash after it to mark its level.
​
So, when all the path is processed, we check if our stack is empty we push a slash into it.
​
If the stack size is greater than 1 and there is a slash on its peek, we pop the slash.
​
And finally we empty the stack and append all the elements in a StringBuilder and return it as a string.