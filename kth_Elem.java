 
import java.util.*; 
class kth_Elem
{
    static Scanner sc=new Scanner(System.in);
    static public long kthElement( int a1[], int a2[], int n, int m, int k) 
    {
        
        int f[]=new int[m+n]; //we take a temporary array
        int i=0,j=0,c=0;
        
        
        while(i<n && j<m)  //we loop thru both the arrays
        {
            if(c==k)  //if the position of temporary array at a point reaches to the kth position
            {
                return f[k-1]; //we return the element at that position
            }
            
            
            if(a1[i]<a2[j])  //simply filling the elements both the arrays i.e a and b in sorted order into the temporary array(i.e f[])
            {
                f[c++]=a1[i]; //if element in array (a1) is smaller we put that in f, and increment the the index of (a1)
                i++;
            }
            
            else if(a1[i]>a2[j]) //if element in array (a2) is smaller we put that in f, and increment the the index of (a2)
            {
                f[c++]=a2[j];
                j++;
            }
            else   //if element in both the arrays is same, we put both the element in the temporary array, and increment the index of both the arrays
            {
                f[c++]=a1[i];
                f[c++]=a2[j];
                i++;
                j++;
            }
        }
        
        while(i<n)  //this runs, if there are some elements left in the array a1
        {
            f[c++]=a1[i];
            i++;
        }
        
        while(j<m)  //this runs, if there are some elements left in the array a2
        {
            f[c++]=a2[j];
            j++;
        }
        
        return f[k-1]; //and finally return element at kth position
        
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of 1st array: ");
        int n=sc.nextInt();
        System.out.println("enter size of 2nd array: ");
        int m=sc.nextInt();
        
        int a[]=new int[n];
        int b[]=new int[m];
        
        System.out.println("enter elements of 1st array: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        System.out.println("enter elements of 2nd array: ");
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        
        System.out.println("enter kth position: ");
        int k=sc.nextInt();
        
        System.out.println(kthElement(a,b,n,m,k));
    }
        
}