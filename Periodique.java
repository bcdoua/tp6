public class Periodique extends Document {
    protected int frequence; 

    public Periodique(int numero, String titre, int nbPages, int frequence) {
        super(numero, titre, nbPages);
        this.frequence = frequence;
    }

    @Override
    public String getType() {
        return "Périodique";
    }

    @Override
    public void edition() {
        System.out.println(getType() + " : " + titre + " - Fréquence : " + frequence);
    }
}
