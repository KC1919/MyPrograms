The intuition behind this approach is same as 3 sum.
​
Jaise hum 3 sum calculate krte hai 2 sum ki help se.
Waisehi humne closest 3 sum calculate kiya hai, closest 2 sum ki help se.
​
Hum **ith element choose krte, then usko target mein se subtract krte, jo bachta wo hume 2 sum se bnana hota.**
​
*Basically wo humara 2 sum ka target hota.*
​
Toh hum 2 sum ko call lgate, i**th ke aage wale index se end tk, uske beech jo bhi closest 2 sum bnta wo hume mil jata.**
​
Fir hum ith element ko wo returned closest two sum add krte.
Fir **agr humra jo triplet ka sum bnta ith ko returned 2 sum ke sath add krne se.**
​
**Agar wo sum target ke exact barabr hota toh hum whi return krdete.**
​
**Wrna hum check krte target aur current triplet sum ka absolute difference agr minimum difference se kam hota , matlb ye triplet sum target se aur zada close hai. to hum isko sum mein store krlete aur diff ko minimum difference mein.**
​
*Aisehi hum har ith element ke sath try krk dkhte, jisse hume sabse km difference wala triplet sum milta (**matlb sbse closest sum target ke**)
​
usko hum return krdete.*