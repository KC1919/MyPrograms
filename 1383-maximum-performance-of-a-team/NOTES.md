**Intuition**
​
make a 2D array of efficiency and speed.
sort the array in descending order of efficience.
​
Take a min priority queue to keep track of the k current speeds
​
iterate the array keep calculating the max, if k members have been taken
means the PQ has k speeds in it,
then consider the kth member and then pop the peek eleemnt from the PQ that wouldbe the smallest speed and subtract that speed from the sum of speeds.
This would ensure that we try to maximize the performance, since we are iterating the efficiency in decreasing order so efficiency is decreasing so, we consider member ahead who have greater speed and remove the slower ones from the team of K members.