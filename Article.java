public class Article extends Document {
    protected String auteur;
    
    public Article(int numero, String titre, int nbPages, String auteur) {
        super(numero, titre, nbPages);
        this.auteur = auteur;
    }

    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public void edition() {
        System.out.println(getType() + " : " + titre + " - Auteur : " + auteur);
    }
}
