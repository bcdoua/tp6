public class TestBibliotheque {
    public static void main(String[] args) {
        Bibliotheque b = new Bibliotheque(5);

        b.ajoutDoc(new Document(1, "Doc1", 10));
        b.ajoutDoc(new Article(2, "Article1", 12, "Emna"));
        b.ajoutDoc(new Livre(3, "Livre1", 200, "Douaa", "ENI"));
        b.ajoutDoc(new Periodique(4, "Magazine1", 30, 7)); 

        System.out.println("Capacité max : " + b.getCapacite());
        System.out.println("Nombre de documents : " + b.getNombreDocument());

        System.out.println("\n Liste des documents:");
        b.inventaire();

        System.out.println("\nSuppression du document n°2:");
        b.supprimDoc(2);

        System.out.println("\n Liste après suppression:");
        b.inventaire();
    }
}
