package bibliotheque;
import java.util.Scanner;


public class Livre {
	private String titre;
	private String auteur;
	private int anneePublication;
	
	public Livre(String atitre,String aauteur,int aanneePublication) {
		titre=atitre;
		auteur=aauteur;
		anneePublication=aanneePublication;
	}
	
	public void afficherDetails() {
		System.out.println("titre:"+titre+"\nauteur:"+auteur+"\nannee de publication:aanneePublication\n");
	}
	

}
