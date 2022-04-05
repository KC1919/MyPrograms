the intuition behind this approach is that;
​
We took 2 pointers, one placed at 0th index and another placed at last index;
​
1) Now first we calculate the width nenclosed between these pointer.
​
2) then we calculate the area enclosed between this width. We take the minimum of the two bars(whose eight is minimum among the two). Because we have to make a enclosed container. If we take the height of the bigger bar while calculating the area, so the area will surpass the smaller bar.
​
3) Next we compare the current calculated area with the max area, and update it accordingly.
​
4) No we move one of the pointers ahead. The pointer which is pointing to the smaller bar is moved ahead, because, jitna raea hum current position se krskte the wo krliya. Ab chahe right mein jitna bda hi bar kyu na ajye, pr area utna hi rhega kyunki hum chote wale ki height leke calculate krte container.
​
5)  Isliye hum chote wale ko aage bdhate , kyunki agr bde wale ko bdha diya toh fyda ni koi. span bhi km hota jyega aur area bhi ni bdhega kyunki hum small wale pe hi khade.
​
6)  isliye small wale ko aage bdhate, ki dusre bar se calculate krk dkhle agr zada area miljye toh.