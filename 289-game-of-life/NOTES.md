The intuition behid this approach is that.
​
One by one we move to each cell.
​
We check all its 8 neighbours if they exist.
​
One by one we go to each neighbour that exist.
We check if it is **dead(state is negative)** or alive. If it is **alive(state is positive)** we increment the count of alive neighbours by 1.
​
So after checking all the neghbours of a cell.
​
--We **check if our current cell is dead** then we check, the **count of alive neighbours** that we have got.
If the **alive neighbour count is exactly equal to 3**, Then our current **dead cell becomes alive**.
**And to mark this we make it -2(means became alive from dead).**
​
But if the alive count is something else, then the dead cell could not be revived and we **mark it as -1(means it remained dead).**
​
--*Other case is that if our current cell is alive*.
​
Then in this case, if the c**ount of alive neighbours is equal to 2 or 3, then the cell remains alive and we mark it as 3(means the cell was alive and it remained alive).**
​
But if the alive count is something else, then the cell dies.
And **we mark the cell as 2(means the cell was alive but died).**
​
So the above 2 cases are check for every cell and accordingly their state are set.
​
Then when all the cells are evaluated, in the end we again traverse the whole matrix to check the modified state of each cell.
​
If the cell state if -2 or 3(because these states we marked in case of alive) that means the cell is alive and we mark it as 1.
Otherwise we mark it as 0 means dead.
​
​
​
​
but if the alive count