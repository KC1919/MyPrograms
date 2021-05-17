import java.util.*; 
class rotSort 
{
    static Scanner sc=new Scanner(System.in);
    
    static public int search(int[] a, int target) 
    {
        if(a.length==0 ||a==null)
            return -1;
        
        int l=0;
        int h=a.length-1;
        
        
        int pivot=-1;
        while(l<h)
        {
            int mid=(l+h)/2;
            
            if(mid>0 && a[mid-1]<a[mid] && a[mid+1]<a[mid])
            {
                pivot=mid;
                break;
            }
            else if(mid>0 && a[mid]>a[mid-1] && a[mid+1]>a[mid] && a[a.length-1]<a[mid])
            {
                l=mid+1;
            }
            else
            {
                h=mid;
            }
            
        }
        
        int ans=-1;
        if(a[0]<a[pivot] && target<a[0])
        {
            ans=binary(a,pivot+1,a.length-1,target);
        }
        else
        {
            ans=binary(a,0,pivot,target);
        }
        
        if(ans!=-1)
            return ans;
        
        return -1;
        
        
    }
    
    static public int binary(int a[],int l,int h,int target)
    {
        while(l<h)
        {
            int mid=(l+h)/2;
            
            if(a[mid]>target)
            {
                h=mid;
            }
            
            else if(a[mid]<target)
            {
                l=mid+1;
            }
            
            else
            {
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("enter target: ");
        int target=sc.nextInt();
        
        System.out.println(search(a,target));
    }
    
}