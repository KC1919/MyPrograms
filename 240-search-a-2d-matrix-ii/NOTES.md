we start from the top right corener of the matrix.
​
**we see if the current element is gretater than the target, so we**
move to the ***left of the current element*,** as the matrix is sorted row and column wise.
so the element ***could not be below in the current column.** *
So we move to the **left in the current row.**
​
**if the current element is smaller than the target, we straight away *go the next row,***
​
as we will not find the target in the current row, since the row is sorted and if the current element is smaller then all hte element to the left of the current element in the current row will also be smaller, so the terget will not be there.
So we move to the next row.