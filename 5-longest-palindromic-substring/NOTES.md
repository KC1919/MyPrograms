the main intuition behind this approach is that,
​
we take a character and start expanding from its left and right, comparing character at the left and right index for equality and keep updating the length of the palindromic substring .
​
We check in two ways, one by (starting the left and right pointer) from left the center character (this case handles the odd length palindromic substring).
​
And in second case, we start the left and right pointer from the character consecutive to each other, means adjacent.(this handles the case of even length palindromic substring)
​
Because in even length there are two center characters, so, left pointer is kept at the left center and the right pointer is kept at the right center.
​
Whichever case among the two gives the longest length palindromic substring that is our answer.