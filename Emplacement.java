public class Emplacement {
    char appartient;//Contient le caractère R ,W, B ou null pour indiquer par qui il est couvert
    /*boolean estCouvert(){
        return appartient == 'R' || appartient == 'W' || appartient == 'B';
    }*/

    //Constructeur initialement tous les emplacements sont vide
    Emplacement() {
        this.appartient = ' ';//' ' signifie que l'emplacement n'est occupé par aucune pièce
    }
    //Setter d'emplacement
    public  void setEmplacement(char c){
        appartient = c;
    }


}