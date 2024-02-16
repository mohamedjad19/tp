public class Livre {
    protected String titre;
    protected String auteur;
    protected int anneePublication;

    public Livre(String atitre,String aauteur,int aanneePublication) {
        titre=atitre;
        auteur=aauteur;
        anneePublication=aanneePublication;
    }

    public void afficherDetails() {
        System.out.println("titre:"+titre+"\nauteur:"+auteur+"\nannee de publication:"+anneePublication+"\n");
    }


}
