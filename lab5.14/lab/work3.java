package lab;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner t = new Scanner(System.in);
       System.out.println("enter the numerator of the the first fraction");
       double a =t.nextDouble();
       Scanner y = new Scanner(System.in);
       System.out.println("enter the denominator of the the first fraction");
       double  b=y.nextDouble();
       Scanner u = new Scanner(System.in);
       System.out.println("enter the numerator of the the first fraction");
       double c =u.nextDouble();
       Scanner i = new Scanner(System.in);
       System.out.println("enter the denominator of the the first fraction");
       double  d=i.nextDouble();
       Scanner o = new Scanner(System.in);
       System.out.println("enter the numerator of the the first fraction");
       double e =o.nextDouble();
       Scanner p = new Scanner(System.in);
       System.out.println("enter the denominator of the the first fraction");
       double  q=p.nextDouble();
       
       double  z= a/b;
       double  x= c/d;
       double  v= e/q;
       if (z>x&z>v)
    	   System.out.println(" the first fraction is the largest");
       else if (x>z & x>v)
    	   System.out.println(" the second fraction is the largest");
       else if (v>z & v>x)
    	   System.out.println(" the third fraction is the largest");
       else if (z==x & x==c)
    	   System.out.println(" it is all the identical"); 
       
       else 
    	   System.out.println(" you write incorrect data");




    	   
	}

}
