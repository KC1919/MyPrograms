public int lengthOfLIS(int[] a) {
if(a.length==1)
return 1;
int n=a.length;
int dp[]=new int[n];
//answer of last element would always be 1, because there are
// no elements right to it so it cannot make any subsequence
dp[n-1]=1;
//this stores the longest subsequence so far
int omax=0;
//start from the 2nd last cell
for(int i=n-2;i>=0;i--){
//this stores the local max for the ith cell
int max=0;
//now the ith cell takes the answer from those cell which are
//greater than it to the right side
for(int j=i+1;j<n;j++){
//checking if the jth cell is greater or not
if(a[j]>a[i]){
//if yes then takes its answer from the dp array
//the answer tells the longest subsequence than the jth cell
//can form
//and accordingly the ith cell updates its max value
max=Math.max(max,dp[j]);
}
}
//in the end when all the cells are checked which were greater than ith cell
//it will be having the maximum subsequence length in the max variable
//so it adds itself(add 1 denotes the length of ith cell) to the maximum
//length of the subsequence and stores that as its answer in the dp array
dp[i]=max+1;
//and if the ith cell answer is greater than the maximum length subsequence
//so far, then we update the maximum subsequence length got so far
omax=Math.max(omax,dp[i]);
}
//finally return the maximum length;
return omax;
}