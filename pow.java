//Q) Implement pow(x, n), which calculates x raised to the power n (i.e. xn). 

import java.util.*;
class pow 
{
  public double myPow(double x, int n)  //recursive solution
  {
      if (n == 0) 
      return 1; 
        
      if (n == 1) 
      return x;
        
      if (n == -1) 
      return 1 / x; 
    
      return myPow(x * x, n / 2) * myPow(x, n % 2);
    }
  
  public double myPower(double x, int n) //striver
  {
        long n1=n;
        double ans=1.0;
        
        if(n<0)  //if the power is negative
        {
            n1=-1*n;  //we make it positive
        }
        
        while(n1>0)
        {
            if(n1%2==1)  //if the power is odd , 
            {
                ans=ans*x;  //we multiply the ans with the number
                n1=n1-1;    //and reduce the power by 1
            }
            
            else      //if the power is even
            {
                x=x*x;     //then we multiply the number by itself 
                n1=n1/2;   //and divide the power (becoz on multiplying the no. by itself,is equivalent to raising it to the power of 2
            }              //so the power gets divided by 2, to maintain the value,(eg: 2^4 = (2*2)^2 or 3^6 = (3*3)^3, you can see power gets half)
        }
        
        if(n<0)        //if the power was negative
            ans=(double)(1.0)/(double)(ans);   //so the ans would be (1/(calculated ans for (+)ve power)).
        
      
        return (ans);
        
    }
}