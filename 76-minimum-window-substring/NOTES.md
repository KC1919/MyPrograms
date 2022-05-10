the intuition behind this approach is,
​
First we map all the characters of the second string with their frequencies  which we have to find in the main string.
​
Then we start iterating the main string, and we add a character in the hashmap.
​
We check if the character is part of the second string and the current frequency of the character in the substring of the main string(current window) is same as the frequency of the character in the second string, then we increment the count by 1.
​
At any point if the count becomes equal to the size of the hashmap which has characters of the second string, that means the current substring contains the second string and therefore we take the start and end index of the current window substring.
​
Then we start removing the characters from the left(i.e jth index)
​
And we keep on checking if the character being removed is part of the second string and has frequency same as the frequency in the second string.
​
So removing that would affect our answer, so we decrement the count by 1,
​
After removing we also keep updating out start and end index as we need to find the smallest window substring that contains all the characters of the second string.
​
So we keep on removing the characters from the left till our count is equal to the size of the hashmap or in other word till our substring contains all the characters of the second string with their exact frequencies.
​
We do this for the whole string and in the end we have the start and end index of the smallest window substring that contains all the characters of the second string
​