Start iterating the string of characters.
​
put the character in the hashmap with their frequency.
​
after adding every character to the hashmap check for the character with maximum frequency in the hashmap.
​
then check the condition that "current length of the substring minus(-) max frequency of the character in that substring, iss less than or equal to the value of K(no. of replacement that can be done) then calculate the length and update the max accordingly.
​
if the condition is false, then we move the left pointer and reduce its frequency by 1 in the hashmap.
​
We do this for the whole string and at the end we have the max length substring.
​