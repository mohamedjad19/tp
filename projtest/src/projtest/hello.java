package projtest;
import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		 int a=15,b=0; 
			System.out.println("entrez votre nombre entre 0 et 100");

		while (a!=b) {
			
				b = new Scanner(System.in).nextInt();
				if (a<b) {
				System.out.println("dommage,le nombre est superieur, veuillez reessayer une autre fois ...");
				}
				if (a>b) {
					System.out.println("dommage,le nombre est inferieur, veuillez reessayer une autre fois ...");
					}
		 }
		 System.out.println("bravoooo!!!exactement la valeur est "+a);
		 
		 
    }
}
