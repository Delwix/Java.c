import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Scanner;

public class Document {
    final int ISBN;
    final String titre;
    final String[] auteurs = new String[5];
    final String editeur;
    final int anneeEdition;
    int nbreExemplaires;
    int numEnregistrement;

    public Document() {
        System.out.println("entrez les informations de votre document");
        ISBN = 0;
        titre = "Indefini";
        String [] auteurs = {"Indefini","Indefini","Indefini","Indefini","Indefini"};
        editeur = "Indefini";
        anneeEdition = 0;
        nbreExemplaires = 0;
        numEnregistrement ++;
    }
    // Toutes les informations du document sauf le nbre dexemplaire ne doivent pas etres changees
    // Donc on ajoute "final"

    void getNumero(){
         System.out.println(this.numEnregistrement);
    }

    public String toString() {
        return "ISBN: " + this.ISBN +
                " ,Titre : " + this.titre +
                ", nombre d'exemplaires " + this.nbreExemplaires;
    }

    void IncNbreEx(int x){
        this.nbreExemplaires  += x;
    }
    void DecNbreEx(Document d, int x){
        this.nbreExemplaires  -= x;
    }




    public static void main(String[] args){
        Scanner choix = new Scanner(System.in);
        System.out.println("1 creer Doc,2 getNumero enregistrement,3 incrementer ,4 Decrementer");
        int c = choix.nextInt();
        switch(c) {
            case 1 :
                Document obj = new Document();
            case 2:
                obj.getNumero();
            case 3:
                Scanner x = new Scanner(System.in);
                System.out.println("de combien incrementer?");
                int x1 = choix.nextInt();
                obj.IncNbreEx(x1);
            case 4:
                Scanner y = new Scanner(System.in);
                System.out.println("de combien decrementer?");
                int y1 = choix.nextInt();
                obj.DecNbreEx(y1);
        }
    }
}
