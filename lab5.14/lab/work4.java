package lab;

import java.util.Scanner;

public class work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String  a ,b ,c ,d,z;
	        Scanner q = new Scanner(System.in);
	        System.out.println("Write 5 words");
	        a= q.nextLine();
	        Scanner w = new Scanner(System.in);
	        b= w.nextLine();
	        Scanner e = new Scanner(System.in);
	        c= e.nextLine();
	        Scanner r = new Scanner(System.in);
	        d= r.nextLine();
	        Scanner t = new Scanner(System.in);
	        z = t.nextLine();
	        System.out.println(a.substring(0,1)+b.substring(0,1)+c.substring(0,1)+d.substring(0,1)+z.substring(0,1));
	}

}
