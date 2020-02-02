public class Dictionnaire extends Document {
    String langue;
    int nbreTomes;

    public Dictionnaire(){
        langue = "indef";
        nbreTomes = 0;
    }
    public String toString() {
        return "ISBN: " + this.ISBN +
                " ,titre : " + this.titre +
                ", nombre d'exemplaires " + this.nbreExemplaires + "langue :" + this.langue +
                " ,nombre de tomes : " + this.nbreTomes ;
    }

}
