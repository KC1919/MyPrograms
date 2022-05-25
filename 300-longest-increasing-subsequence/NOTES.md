//checking if the jth cell is greater or not
if(a[j]>a[i]){
//if yes then takes its answer from the dp array
//the answer tells the longest subsequence than the jth cell
//can form
//and accordingly the ith cell updates its max value
max=Math.max(max,dp[j]);
}
}
//in the end when all the cells are checked which were greater than ith cell
//it will be having the maximum subsequence length in the max variable
//so it adds itself(add 1 denotes the length of ith cell) to the maximum
//length of the subsequence and stores that as its answer in the dp array
dp[i]=max+1;
//and if the ith cell answer is greater than the maximum length subsequence
//so far, then we update the maximum subsequence length got so far
omax=Math.max(omax,dp[i]);
}
//finally return the maximum length;
return omax;
}
​
​
**Binary Search Approach:**
​
The intuition behind this approach is that, if we find a smaller element then we look for its position in the dp array, because the smaller element has greater chance of forming a longer sequence with the elements ahead of it.
​
For example: 2, 5, 3, 4, 7, 8
​
So a subsequence of 2,5,7,8 can be formed.
​
But if we consider taking 3 instead of 5, we can form
2,3,4,7,8, a longer subsequencce than before.
​
Because of picking of 5 we could not pick up 4.
​
And when we picked 3 we could pick 4 also, which increased the length of subs.
​
So this is how the smaller number increases the chance of forming greater length increasing subsequence.
​
So whenever a smaller element comes we look for it to overrite an element at insert position.