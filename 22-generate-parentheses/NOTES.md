the intuition behind this approach is that
​
it mainly works on the principle of backtracking.
​
But the main logic behind this is that, we only pick the closing bracket if the number of closing bracket available is greater than or equal to the nu,ber of open brackets available.
​
This ensures that, the opening bracket have been picked up before as the call to choose opening bracket comes before.
​
So whenever a closing bracket is picked up, there must always be a opening bracket avialable in the sequence, because then only we can pick closing bracket, as the condition says, the number of available closing bracket must be greater than number of avalailable opening brackets.
​
So if the nu,ber of avalaible opening brackets is less than closing brackets,
that means there woill always be an incomplete opening bracket in the sequence
and hence we pick a closing bracket to balance the sequence.
​
hence the sequence never becomes invalid.
​
And we always get avalid sequnec eof apranthesis after susing all the opening and closing paranthesis.