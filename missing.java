import java.util.*;
class missing
{
    static void missin(int a[], int n) 
    {
      int miss=0;
      
      for(int i=0;i<n;i++)
      {
          int abs=Math.abs(a[i]);
          
          if(a[abs-1]>0)
          {
              a[abs-1]=-a[abs-1];
          }
      }
      
      for(int i=0;i<n;i++)
      {
          if(a[i]>0)
          {
              miss=i+1;
              break;
          }
      }
      System.out.println("missing number is: "+miss);
    }
}