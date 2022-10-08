class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int sum=0;
        int n=nums.length;
        int diff=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            int comp=target-nums[i];
            
            if(i+2<n){
                int res=twoSum(nums,i+1,comp);
                int mySum=res+nums[i];
                
                int d=Math.abs(target-(mySum));
                
                if(d<diff){
                    sum=mySum;
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
            int csum=a[l]+a[r];
            
            if(csum==target){
                return target;
            }
            
            else if(csum>target){
                if(d<diff){
                    sum=csum;
                    diff=d;
                }
                
                r--;
            }
            
            else if(csum<target){
                if(d<diff){
                    sum=csum;
                    diff=d;
                }
                
                l++;
            }
        }
        return sum;
    }
}