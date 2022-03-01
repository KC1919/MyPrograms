we start from 1st station and keep calculating the fuel and sum of the fuel spent and gained.
If at any point fuel becomes negative then it means its not possible to move to next station from there , so we change our starting point to "i+1".
​
We keep doing this till we check for every gas station.
​
if in the end the sum of fuel and cost is greater than or equal to 0. That means the fuel required to travel all station was just suffiecient or greater than that.
​
if the sum comes out to be less than 0 then we return -1. because then there will exist some station from where it would not be possible to reach another station.
​
​