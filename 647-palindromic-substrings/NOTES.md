here we used the **Gap strategy** of Sumeet's Sir.
​
In this strategy, we take a 2d matrix.
​
And we have a given string.
​
The rows represent the substring starting character and the column represent the substring ending character.
​
Like--
​
eg: s=naman
​
So the 2-d matrix will be of  size of the string.
---ending characters----
n        a        m          a             n**
**n**  (n)     (na)    (nam)  (nama)  (naman)
**a**   x       (a)      (am)    (ama)    (aman)
**m**  x        x       (m)      (ma)      (man)
**a**   x        x         x        (a)          (an)
**n**   x        x         x         x           (n)
​
**So the rows represent the substring starting character and the columns represent the substring ending character.**
​
So now the **diagonals** give **all the possible substrings** that can be formed from the string.
​
So we  traverse on the diagonals, basically the **diagonals represent** the **GAP** **between the starting character of the substring and the ending character of the susbtring**
​
So the diagonal start with **GAP=0**, means the single character starting and ending at itself.
​
So they are always palindrome, so we put true in the boolean dp matrix.
​
Now we travel on the diagonal with **GAP=1**, means substrings of length=2,
so to chek them if they are palindrome or not, we check if the 1st character matches with the 2nd character, if yes we put true at (i,j)
​
Now other diagonals are travelled, now in substrings of length greater than 2.
​
To check them for palindrome, we check if their 2st and last character is same and the string between the 1st and last character is palindrom or not.
If the 1st and last character is same and the string between them is also palindrome that
means this substring is also palindrome.
​
How to check the string between 1st and last character to be palindrome or not.?
​
To check that, we move 1 row below and 1 column backward, because,
as the string starting woud be from 2nd character, and we are at 1st character
so we need to move 1 row below, and as the string is ending at 2nd last character
as we checking the between string, so and we are currently ending at last character,
so to come to 2nd last character we move 1 column backward.
​
So we check that answer in the dp matrix after moving the steps and
if we get true we put true, if we get false we put false.
​
​