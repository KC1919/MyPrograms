class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        
        Arrays.sort(a);
        
        List<List<Integer>>res=new ArrayList<>();
        
        for(int i=0;i<a.length;i++){
            
            if(i>0 && a[i]==a[i-1]) continue;
            
            int comp=0-a[i];
            
            List<List<Integer>>result=twoSum(a,i+1,comp);
            
            if(result.size()>0){
                
                for(List<Integer>list:result){
                    list.add(0,a[i]);
                    res.add(list);
                }
            }
        }
        
        return res;
    }
    
    private List<List<Integer>> twoSum(int a[], int start, int target){
        
        List<List<Integer>>res=new ArrayList<>();
        
        int left=start, right=a.length-1;
        
        while(left<right){
            
            if(a[left]+a[right]==target){
                
                List<Integer>list=new ArrayList<>();
                
                list.add(a[left]);
                list.add(a[right]);
                res.add(list);
                
                left++;
                right--;
                
                while(left<right && a[left]==a[left-1]) left++;
                while(right>left && a[right]==a[right+1]) right--;
            }
            
            else if(a[left]+a[right]<target){
                left++;
            }
            
            else if(a[left]+a[right]>target){
                right--;
            }
        }
        
        return res;
    }
}