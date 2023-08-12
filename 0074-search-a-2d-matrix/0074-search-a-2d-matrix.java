class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(target>matrix[i][j]){
                    continue;
                }
                else{
                    return bsearch(matrix,i,j,target);
                }
            }
        }
        return false;
    }

    public boolean bsearch(int a[][], int i, int j, int target)
{

    int l=0, h=a[0].length;

    while(l<=h){
        int mid=(l+h)/2;

        if(a[i][mid]==target){
            return true;
        }

        else if(a[i][mid]>target){
            h=mid-1;
        }

        else if(a[i][mid]<target){
            l=mid+1;
        }
    }
    return false;
}
}