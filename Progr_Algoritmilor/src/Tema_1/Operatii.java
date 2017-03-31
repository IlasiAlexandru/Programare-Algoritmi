package Tema_1;

public class Operatii {

	public static void main(String[] args) {
		
		int tab[] = {2,5,7,8,10};
		
		int min = tab[0];
		int max = tab[0];
		int sum = 0;
		int prod = 1;
		
		for (int i = 0; i<tab.length ; i++)
		{
			sum = sum + tab[i];
		}
		System.out.println("The sum -> " +sum);
		
		for (int i=1 ; i<tab.length ; i++)
		{
			prod = prod * tab[i];
		}
		System.out.println(" The Prod -> " + prod);
		
		for(int i = 0 ; i<tab.length ; i++)
		{
			if(tab[i] < min)
			{
				min = tab[i];
			}
		else if(tab[i] > max)
			{
				max = tab[i];
			}
			
		}
		System.out.println("Min Value ->" +min);
		System.out.println("Max Value ->"+max);
	}
}
