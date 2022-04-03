in this at every step we se the previous result , stored in the old variables.
​
We check if both he previous values are negative then we take the minimum of the two,
and multiply it with our current value, and store it in newPrev.
and store the current value in newCurr.
​
the intuition behind this is that, if we previously have both negative values.
then we would take the smaller of the two and multiply with our current value, as we want to maximze the product. because if in fututre some negative values occurs then it will tur our product to positive.
​
And if the one of the old value was negative and one was positive.
then we multiply the curr value with the positive and store it in newCurr and multiply the curr value with the old negative and store it in newPrev.
​
the intuition behind this is that, if one of the previouis value is negative so we take that into consideration as in future any negative values can come which would make the product positive.
And we also take the positive value, because there also can be possibility that no negative value occurs in future then the positive result would be our answer.
​
Lastly if any of the previos value is 0, then we discard it and carry the previpous non zero value and multiply with the current, and also take the curr as start of new prod.