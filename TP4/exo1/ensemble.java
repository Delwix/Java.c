public class ensemble {
    int[] elements;
    private int pos;
    private int capacite;
    public ensemble(int max){
        elements = new int[max];
        pos = -1;
        capacite = max;
    }

    public int Taille(){
        return this.pos + 1;
    }
    public boolean estVide(){
        if (this.pos == -1)
            return true;
        return false;
    }
    public boolean estPleine(){
        if (this.pos == capacite - 1 )
            return true;
        return false;
    }
    public boolean ajouter(int x){
        if (this.estPleine())
            return false;
        for(int i : this.elements){
            if (i == x)
                return false;
        }
        this.elements[pos+1] = x;
        this.pos ++;
        return true;
    }
    public boolean existe(int x){
        int j = -1;
        if(this.estVide())
            return false;
        for(int i : this.elements){
            j++ ;
            if (i == x) {
                break;
            }
        }
        if(j == -1)
            return false;
        return true;
    }
    public boolean supprimer(int x){
        int j = -1;
        if(this.estVide())
            return false;
        for(int i : this.elements){
            j++ ;
            if (i == x) {
                break;
            }
        }
        if(j == -1)
            return false;
        for(int i = 0;i<capacite;i++){
            this.elements[j + i] = this.elements[j + i + 1];
        }
        pos -= 1;
        return true;
    }
    public ensemble ajouterTous(ensemble e){
        if (this.pos + e.pos >= this.capacite)
            return this;
        for(int i : e.elements){
            if (!this.existe(i)){
                this.ajouter(i);
            }
        }
        return this;
    }
     public ensemble supprimerTous(ensemble e){
        for(int i :e.elements){
            if(this.existe(i)){
                this.supprimer(i);
            }
        }
        return this;
     }
     public boolean contientTous(ensemble e){
        if(e.pos > this.pos){
            return false;
        }
        for(int i: e.elements){
            if (!this.existe(i)){
                return false;
            }
        }
        return true;
     }
    public ensemble intersection(ensemble e){
        ensemble intersect = new ensemble(Math.max(this.capacite,e.capacite));
        for(int i: this.elements){
            if(e.existe(i)){
                intersect.ajouter(i);
            }
        }
        return intersect;
    }


}
