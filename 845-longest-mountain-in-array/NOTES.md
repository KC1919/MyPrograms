At every step we check if the current element is :
​
-greater than the previous element
-or less than the previous element
-or equal to the previous element.
​
**if greater:**
then we check if right count is greater than 0, so we first make it 0 and also the left counter to 0.
else if right counter is already 0, we simply increment the left counter by 1(which depicts, we are climbing the hill.
​
**if smaller:**
then we check if the left counter is greater than 0, means we have climed the hill, now we are moving down the hill.
so we increment the right counter by 1;
​
else if the left counter is equal to 0 we make the right counter to 0.
​
**if equal:**
if the current elements gets equal to the previous element, that means there occurred an plane area(no ascent, no descent) so we make out left counter and right counter to 0.
​
at the end we check if our counters are greater than 0, we calculate the length of the mountain and store it in max.
​
​
​