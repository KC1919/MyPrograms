the main intuition behind this approach is that,
​
we can robb any house on our right side except the right adjacent house to us.
​
So we check which house has the maximum money, the alternate house to os or the
further house.
​
Because as we start from the right side, means first we solve the smaller problem, so the bigger problem getssolved automatically.
​
In the end, we will either be having the maximum collected price from all the houses fulfillingthe alert condition, in house 1 or house 2.
​
So we return the maximum of the two.