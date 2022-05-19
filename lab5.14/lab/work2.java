package lab;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Scanner a= new Scanner(System.in);
	        System.out.println("Write a sentence");
	        String b = a.next();
	        Scanner c = new Scanner(System.in);
	        System.out.println("Write a sentence");
	        String d = a.next();
	        String z = b.substring(0,1).toUpperCase()+ b.substring(1).toLowerCase();
	        String x = d.substring(0,1).toUpperCase()+ d.substring(1).toLowerCase();
	        if (z.equals(x))
	        	System.out.println("names are the equal");
	        else
	        	System.out.println("names are the equal");
	        	

}
}