if(j==a[i]){
dp[i][j]=true;
}
//else if the target sum is greater than the current element
//then we check can the sum of (target-currEle) can be made
//by the previous elements, because if that can be made, the
//the current element will be able to make the remaining
else if(j>a[i]){
//if yes then we put true
if(i>0 && dp[i-1][j-a[i]]==true){
dp[i][j]=true;
}
else if(i>0 && dp[i-1][j]==true)
dp[i][j]=true;
}
}
//we check if the final target sum can be made we return true
if(j==target && dp[i][j]==true)
return true;
}
}
return false;
}