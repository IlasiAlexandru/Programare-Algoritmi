package Lab_1;

import java.util.Scanner;

public class A_LA_RUSSE {

	public static void main(String[] args) {
		 
		int p = 0;
		int a,b;
		
		Scanner Scann = new Scanner(System.in);
		
		System.out.println("Introduceti valoarea lui a : " );
		 a= Scann.nextInt();
		System.out.println("Introduceti valoarea lui b : " );
		 b= Scann.nextInt();
		
		while (a>0)
		{
			if (a%2 == 1)
			{
				p=p+b;
			}
			a=a/2;
			b=b+b;
		}
		System.out.println("produsul este : " +p);
		
		
	}

}
