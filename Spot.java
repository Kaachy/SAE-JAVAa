public class Spot extends Emplacement {
    int nbPts;
    char representation;
    boolean etat;//indique si le spot est couvert
    //Constructeur Spot
    Spot() {
            nbPts = 1 ;
            representation = 'O';

    }

    public void couvrir(){
        etat = true;
    }




}
