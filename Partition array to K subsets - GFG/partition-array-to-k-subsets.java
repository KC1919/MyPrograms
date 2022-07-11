// { Driver Code Starts
import java.util.*;

class Partition_Arr_To_K_Subsets
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			Solution g = new Solution();
			if(g.isKPartitionPossible(a,n,k)==true)
				System.out.println(1);
			else 
				System.out.println(0);
			
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete this method */

class Solution
{
    public boolean isKPartitionPossible(int a[], int n, int k){
        
        int sum=0;
        for(int ele:a){
            sum+=ele;
        }
        
        if(sum%k!=0){
            return false;
        }
        
        int target=sum/k;
        
        List<List<Integer>>list=new ArrayList<>();
        
        for(int i=0;i<k;i++){
            list.add(new ArrayList<>());
        }
        
        return check(a,0,new int[k],list,k,target);
    }
    
    private boolean check(int a[], int idx, int sum[], List<List<Integer>>list, int k, int target){
        
        if(idx==a.length){
            
            if(list.size()==k){
                
                for(int i=1;i<sum.length;i++){
                    if(sum[i]!=sum[i-1]){
                        return false;
                    }
                }
                
                return true;
            }
            
            return false;
        }
        
        for(int i=0;i<k;i++){
            
            if(list.get(i).size()!=0 && (sum[i]+a[idx])<=target){
                list.get(i).add(a[idx]);
                sum[i]+=a[idx];
                boolean res=check(a,idx+1,sum,list,k,target);
                sum[i]-=a[idx];
                list.get(i).remove(list.get(i).size()-1);
                
                if(res){
                    return true;
                }
            }
            
            else if(list.get(i).size()==0){
                list.get(i).add(a[idx]);
                sum[i]+=a[idx];
                boolean res=check(a,idx+1,sum,list,k,target);
                sum[i]-=a[idx];
                list.get(i).remove(list.get(i).size()-1);
                
                if(res){
                    return true;
                }
                
                break;
            }
        }
        
        return false;
    }
}
