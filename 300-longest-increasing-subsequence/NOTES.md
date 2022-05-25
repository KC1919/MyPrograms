if(pos==len)
len++;
}
return len;
}
//function to find the insert position
private int findPos(int a[], int high, int target){
int l=0, h=high;
int mid=-1;
while(l<=h){
mid=(l+h)/2;
if(a[mid]<target)
l=mid+1;
else if(a[mid]>target)
h=mid-1;
else
return mid;
}
return l;
}