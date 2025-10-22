public class Bibliotheque {
    private Document[] docs;
    private int nbDocs;

    public Bibliotheque(int capacite) {
        docs = new Document[capacite];
        nbDocs = 0;
    }

    public int getCapacite() {
        return docs.length;
    }

    public int getNombreDocument() {
        return nbDocs;
    }

    public void ajoutDoc(Document d) {
        if (nbDocs < docs.length) {
            docs[nbDocs] = d;
            nbDocs++;
        } else {
            System.out.println("Bibliothèque pleine !");
        }
    }

    public void supprimDoc(int num) {
        for (int i = 0; i < nbDocs; i++) {
            if (docs[i].numero == num) {
                for (int j = i; j < nbDocs - 1; j++) {
                    docs[j] = docs[j + 1];
                }
                docs[nbDocs - 1] = null;
                nbDocs--;
                return;
            }
        }
        System.out.println("Document non trouvé ");
    }

    public void inventaire() {
        for (int i = 0; i < nbDocs; i++) {
            docs[i].edition();
        }
    }
    public Bibliotheque liste_livre() {
        Bibliotheque livres = new Bibliotheque(nbDocs);
        for (int i = 0; i < nbDocs; i++) {
            if (docs[i] instanceof Livre) {
                livres.ajoutDoc(docs[i]);
            }
        }
        return livres;
    }
    public Bibliotheque liste_article() {
        Bibliotheque articles = new Bibliotheque(nbDocs);
        for (int i = 0; i < nbDocs; i++) {
            if (docs[i] instanceof Article && !(docs[i] instanceof Livre)) {
                articles.ajoutDoc(docs[i]);
            }
        }
        return articles;
    }

    public Bibliotheque liste_docsimples() {
        Bibliotheque simples = new Bibliotheque(nbDocs);
        for (int i = 0; i < nbDocs; i++) {
            if (!(docs[i] instanceof Article) && !(docs[i] instanceof Livre) && !(docs[i] instanceof Periodique)) {
                simples.ajoutDoc(docs[i]);
            }
        }
        return simples;
    }
    public Bibliotheque liste_periodique() {
        Bibliotheque periodiques = new Bibliotheque(nbDocs);
        for (int i = 0; i < nbDocs; i++) {
            if (docs[i] instanceof Periodique) {
                periodiques.ajoutDoc(docs[i]);
            }
        }
        return periodiques;
    }
}
