public class Document {
    protected int numero;
    protected String titre;
    protected int nbPages;

    public Document(int numero, String titre, int nbPages) {
        this.numero = numero;
        this.titre = titre;
        this.nbPages = nbPages;
    }

    public String getType() {
        return "Document";
    }

    public void edition() {
        System.out.println(getType() + " : " + titre + " (" + nbPages + " pages)");
    }
}
