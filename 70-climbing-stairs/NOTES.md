here we have 2 choices.
​
Either we can jump one step aur jump two steps.
​
So our smaller problem lies on the right side, means towards the nth stair.
​
We make jumps either of 1 or 2, and ask the stair we reach after making the jump, that
how many ways can we reach the top through that stair.
​
So we add the ways of (n+1)th and (n+2)th stair, that gives us the number of ways to reach the nth stair.
​
Its a classic problem of DP, since we would be reaching a particular stair multiple number of times, so instead of calculating its answer again and again we cache it in our Dp array.