public class Livre extends Document{
    int nbrePages;
    String type;
    int tome;

    public Livre(){
        nbrePages = 0;
        type = "indef";
        tome = 0;
    }
    public String toString() {
        return "ISBN: " + this.ISBN +
                " ,titre : " + this.titre +
                ", nombre d'exemplaires " + this.nbreExemplaires +  "nombre pages " + this.nbrePages +
                " ,type " + this.type +
                ", tome " + this.tome ;
    }
}
