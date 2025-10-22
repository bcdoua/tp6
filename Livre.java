public class Livre extends Article {
    protected String editeur;
    
    public Livre(int numero, String titre, int nbPages, String auteur, String editeur) {
        super(numero, titre, nbPages, auteur);
        this.editeur = editeur;
    }

    @Override
    public String getType() {
        return "Livre";
    }

    @Override
    public void edition() {
        System.out.println(getType() + " : " + titre + " - Auteur : " + auteur + " - Éditeur : " + editeur);
    }
}
