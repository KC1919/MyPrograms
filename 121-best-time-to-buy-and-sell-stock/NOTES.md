the intuition behind this approach is that,
​
We take the price at 0th day as thi minimum price.
​
And we start to check the prices from the 1st day.
​
if any day the rice is more than the min price, we try to sell the stock and if the profit is more than maximum we update our maximum.
​
But if the price at ith day is less than the minimum then we update our minimum.
​
And again look for and day with price more than the minimum.
​
And we keep calculating the profit.
​
So when all the days our explored we have with us our maximum profit.
​
Because we keep updating the minimum and any keep calulating the profit with any day greater than minimum.
​
So the maximum difference in prices gives the maximum profit.