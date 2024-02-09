package tptp;

package projtest;
import java.util.Scanner;

public class Etudiant {
	
		private int code;
		private String nom;
		private float[] note= {0,0,0,0,0};
		
		public void AjouterNote() {
			System.out.println("quelle note voulait vous ajouter?");
			Scanner ind = new Scanner(System.in);	
			int index=ind.nextInt();
			System.out.println("valeur de la note:");
			Scanner val = new Scanner(System.in);
			float valeur=val.nextFloat();
			switch(index) {
			case 1:
				note[0]=valeur;			
				break;
				
			case 2:
				note[1]=valeur;
				break;
				
			case 3:
				note[2]=valeur;
				break;
				
			case 4:
				note[3]=valeur;
				break;
				
			case 5:
				note[4]=valeur;
			}
			
			}
		public void SupprimerNote() {
			System.out.println("quelle note voulait vous supprimer?");
			Scanner ind = new Scanner(System.in);	
			int index=ind.nextInt();
			switch(index) {
			case 1:
				note[0]=0;			
				break;
				
			case 2:
				note[1]=0;
				break;
				
			case 3:
				note[2]=0;
				break;
				
			case 4:
				note[3]=0;
				break;
				
			case 5:
				note[4]=0;
			}
		}
		
		void display() {
			System.out.println("nom:"+nom);
			System.out.println("code:"+code);
			for (int i = 0; i < 5; i++) {
				  System.out.println(note[i]);
				}		}
		public static void main(String[] args) {
			Etudiant jad=new Etudiant();

			jad.nom="jad";
			jad.code=1;
			
			jad.AjouterNote();
			jad.AjouterNote();
			jad.AjouterNote();
			jad.AjouterNote();

			jad.display();
			
			jad.SupprimerNote();

			jad.display();
			
		}

}

