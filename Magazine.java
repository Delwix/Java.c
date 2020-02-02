public class Magazine extends Document{
    String periodicite;
    int moisEdition;
    int jour;

    public Magazine(){
        periodicite = "indef";
        moisEdition = 0;
        jour = 0;
    }
    public String toString() {
        return "ISBN: " + this.ISBN +
                " ,titre : " + this.titre +
                ", nombre d'exemplaires " + this.nbreExemplaires + "periodicite :" + this.periodicite +
                " ,mois d'edition : " + this.moisEdition +
                ", jour :" + this.jour;
    }
}
