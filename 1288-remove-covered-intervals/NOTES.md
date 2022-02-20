Firstly sort the intervals array in ascending order of the start time, and if two interval have same start time, then the interval with greater end time will come first.
​
Then we start from the second interval and we keep checking if the current interval's start time is greater than or equal to the start time and the current interval's end time should be less than or equal to the end time.
​
If this condition is satified means the inteval is overlapping, so we increaase the count of overlapping interval by 1 and we update the end time with Max(current end time, end time)
​
If the above condition is false, it means the current interval is not overlapping so we update the start time and end time with current interval's start and end time;
​