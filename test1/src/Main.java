

public class Main {
    public static void main(String[] args) {
        Livre l1=new Livre("apprendre python","Ahmed Amamou",2023);
        Livre l2=new Livre("java","Ahmed Amamou",2021);
        Livre l3=new Livre("apprendre linux","Ahmed Amamou",2022);
        Livre l4=new Livre("linux","Taha Aitchakoucht",2022);


        Livre lis1[]= {};

        Bibliotheque b1=new Bibliotheque("biblio1",lis1);
        b1.ajouterLivre(l1);
        b1.ajouterLivre(l2);
        b1.ajouterLivre(l3);
        b1.ajouterLivre(l4);
        b1.afficherLivres();
        b1.rechercherLivreParAuteur("Taha Aitchakoucht");



    }
}
