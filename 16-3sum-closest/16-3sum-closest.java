class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int sum=0;
        int n=nums.length;
        int diff=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            int comp=target-nums[i];
            
            if(i+2<n){
                int res=twoSum(nums,i+1,comp);
                int d=Math.abs(target-(res+nums[i]));

                if(d<diff){
                    sum=nums[i]+res;
                    diff=d;
                }
            }
        }
        
        return sum;
    }
    
    private int twoSum(int a[], int li, int target){
        
        int l=li, r=a.length-1;
        int diff=Integer.MAX_VALUE;
        int sum=0;
        
        while(l<r){
            
            int d=Math.abs(target-(a[l]+a[r]));
            
            if(a[l]+a[r]==target){
                return target;
            }
            
            else if(a[l]+a[r]>target){
                if(d<diff){
                    sum=a[l]+a[r];
                    diff=d;
                }
                
                r--;
            }
            
            else if(a[l]+a[r]<target){
                if(d<diff){
                    sum=a[l]+a[r];
                    diff=d;
                }
                
                l++;
            }
        }
        return sum;
    }
}