package lab;

import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a= new Scanner(System.in);
        System.out.println("Write a sentence");
        String c = a.next();
        
        Scanner b= new Scanner(System.in);
        System.out.println("Write a sentence");
        String d = a.next();
        int q =c.length();
        int w =c.length();
        if (q==w)
        	System.out.println("it is equal in number of letters");
        else if (q>w)
        	System.out.println("the first sentence is bigger than the second");
        else if (q<w)
        	System.out.println("it is equal in number of letters");
        else if (q!=w)
        	System.out.println("the first sentence is bigger than the second");
	}

}
