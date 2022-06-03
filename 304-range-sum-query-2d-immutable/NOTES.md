class NumMatrix {
​
private int prefix[][];
private int a[][];
private int n;
private  int m;
public NumMatrix(int[][] matrix) {
this.a=matrix;
this.n=a.length;
this.m=a[0].length;
//make this matrix to store the prefix sum of each row
this.prefix=new int[n][m];
for(int i=0;i<n;i++){
int sum=0;
//calculating for every row till jth col, and store the sum at that cell
for(int j=0;j<m;j++){
sum+=a[i][j];
prefix[i][j]=sum;
}
}
}
public int sumRegion(int r1, int c1, int r2, int c2) {
int sum=0;
//then we know that every rectangle can be made by
//combining cells  of starting row from start col to end col
// till ending row from start col to end col
for(int i=r1;i<=r2;i++)
{
//if the start column is 0th column, so we dont need to subtract the
//previous sum till start col, as 0th col itself is the starting col
//so it does not have any prefix sum, so we add directly the sum
//at r1 sum till jth col
if(c1==0)
sum+=prefix[i][c2];
//if the start col is not the 0th col, then there will be sum
//icluded of the columns before the start column also, so we need
//to remove that sum, because we only have to take sum from the start
//column till the end col for every row
//so we take the difference between the prefix sum till end col
//and prefix sum till (start-1)th col
// so this will give the sum of cells from the start col to the end col
//we do this for every row, and finally we have the sum enclosed by the
// rectangle
else
sum+=prefix[i][c2]-prefix[i][c1-1];
}
return sum;
}
}