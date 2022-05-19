Use the concept of BFS.
​
Made a pair class that has row, col
​
So the logic behind this approach is that,
​
As we know the cells in connection with those to the border cells will not be captured.
​
So we work upon this condition.
We add all the border cell in the que, with their row and col
​
Then we work till the que is not empty,
we take out a border pair, we move in all 4 direction from that cell
and add those cells to the queue and mark them with some other character to remember that they are not to be captured.
​
So in the end when the que gets empty, all the cells that were in connection with the border cells get marked with some other letter and are safe.
​
Now we iterate the whole matrix and check the cells which are left , means those cells which are not in connection with any border cell, gets captured, we mark them with 'X'
​
and the cells which we marked as safe we chage them to 'O' means uncaptured