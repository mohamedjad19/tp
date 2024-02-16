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

    public void rechercherLivreParAuteur(String aut){
        System.out.println("les livres écrits par "+aut+" sont:\n");
        int c=0;
        for (Livre livre : liste) {
            if (livre.auteur == aut) {
                c++;
                livre.afficherDetails();
            }
        }
        if (c==0){
            System.out.println("nous avons aucun livre écrit par "+aut);
        }
    }


}
