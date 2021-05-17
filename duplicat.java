class duplicat 
{
    static void dup(int a[], int n) 
    {
      int dup=0;
      
      for(int i=0;i<n;i++)
      {
          int abs=Math.abs(a[i]);
          
          if(a[abs-1]>0)
          {
              a[abs-1]=-a[abs-1];
          }
          else
          {
              dup=abs;
              break;
          }
      }
      
      System.out.println("duplicate is: "+dup);
    }
}