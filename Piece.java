public class Piece {
    private char couleur;//Lettre qui représente la couleur de la pièce
    private int position;//Numéoro indiquant la position courante de la pièce
    //Setter de couleur :
    public void setCouleur(char c) {
        assert (couleur == 'R' || couleur == 'B' || couleur == 'W');//Les seuls couleurs accepté
        couleur = c;
    }

    //Getter de couleur :
    public char getCouleur() {
        return couleur;
    }

    //Setter de position :
    public void setPos(int pos) {
        assert (pos >1 && pos <= 9);
        position = pos;
    }

    //Getter de position :
    public int getPosition() {
        return position;
    }

    //Constructeur de pièce : Construit une pièce à la couleur souhaité
    Piece(char couleur) {
        assert (couleur == 'R' || couleur == 'B' || couleur == 'W');//Les seuls couleurs accepté
        this.setCouleur(couleur);
    }//Position ?

    //A tester

}