package bibliotheque;
import java.util.Arrays;

public class Bibliotheque {
	private String nom;
	private Livre[] liste;
	
	public Bibliotheque(String anom,Livre[] aliste) {
		nom=anom;
		liste=aliste;
	}
	
	public void ajouterLivre(Livre inst) {
		liste = Arrays.copyOf(liste, liste.length + 1);
		liste[liste.length-1]=inst;
	}
	
	public void afficherLivres() {
		for(int i=0;i<(liste.length);i++) {
			liste[i].afficherDetails();
		}
		
	}
	
	
	
}
