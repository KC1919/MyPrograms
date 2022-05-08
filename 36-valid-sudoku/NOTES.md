Intuition behind this approach is that,
​
*As we have to check for the validity of a particular element.
means the element should not be present multiple times in the same row or column.*
​
**So to check that in least complexity, thats possible only with the help of HashSet or HashMap.**
​
*So here we took 2 hashmap, one for row validity
and another one for column validity.*
​
**So we took hashmap of index(Interger) vs elements in that row index (HashSet).
Same for the column**.
​
**We start traversing the board, if we get any duplicate element in a row or a column, we return false immediately.**
​
Then if false is not returned means the row cols are in good state,
​
***Now we check all the sub grids of 3x3.***
​
If the checkSub funtion return true we return tru means the board is in valid state.
​
but if the checkSub function returns false means the board is invalid and we return false.