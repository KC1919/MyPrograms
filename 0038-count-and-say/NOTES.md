class Solution {
public String countAndSay(int n) {
return sayLoud(n);
}
private String sayLoud(int n){
//base case
if(n==1){
return "1";
}
StringBuilder myRes=new StringBuilder();
//get result for the previous number
String res=sayLoud(n-1);
//initialize thecount to 1, since there would always be 1 character
int count=1;
//take the 1st character
char chr=res.charAt(0);
//if the returned result length is 1, simply append the result with count
//and return
if(res.length()==1){
myRes.append(count);
myRes.append(chr);
return myRes.toString();
}
//else iterate from the 2nd character and keep comparing with the previous
//character and update the count
for(int i=1;i<res.length();i++){