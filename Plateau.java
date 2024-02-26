public class Plateau {
    private Emplacement[][] emplacement = new Emplacement[3][3];//Tableau d'emplacement
    //Créer 3 pièces
    private Piece[] pieces = new Piece[3];//Piece 0 = Rouge, Pièce 1 = Blanc et Pièce 2 = Bleu

    private Spot[] spots = new Spot[3];

    public void setEmplacement(int ligne, int colonne, Emplacement e) {
        assert (ligne < 3 && ligne >= 0);
        assert (colonne < 3 && colonne >= 0);
        emplacement[ligne][colonne] = e;
    }

    public char getContenueEmplacement(int ligne, int colonne) {
        assert (ligne < 3 && ligne >= 0);
        assert (colonne < 3 && colonne >= 0);
        return emplacement[ligne][colonne].appartient ;
    }


    public void setSpot(int ligne, int colonne, Spot s) {//Place un spot à un emplacement donné
        assert (ligne < 3 && ligne >= 0);
        assert (colonne < 3 && colonne >= 0);
        setEmplacement(ligne, colonne, s);
    }

    public void setPieceH(int ligne, int colonne, Piece p) {//Place une piece p à un emplacement donné de facon horizontal
        assert (ligne < 3 && ligne >= 0);
        assert (colonne < 3 && colonne >= 0);
        assert (ligne + 1 < 3);
        emplacement[ligne][colonne].appartient = p.getCouleur();
        emplacement[ligne][colonne + 1].appartient = p.getCouleur();
    }

    public void setPieceV(int ligne, int colonne, Piece p) {//Place une piece p à un emplacement donné de facon vertical
        assert (ligne < 3 && ligne >= 0);
        assert (colonne < 3 && colonne >= 0);
        assert (colonne + 1 < 3);
        emplacement[ligne][colonne].appartient = p.getCouleur();
        emplacement[ligne + 1][colonne].appartient = p.getCouleur();

    }




    //Constructeur:
    Plateau() {
        pieces[0]= new Piece('R');
        pieces[1] = new Piece('W');
        pieces[2] = new Piece('B');

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            emplacement[i][j] = new Emplacement();
        }
        }


        //Mettre les spots au bon endroit et mettre leur etat à couvert
        for (int i = 0; i < 3; i++) {
            spots[i] = new Spot();
            setSpot(i, 2, spots[i]);

        }

        //Mettre les pieces de couleurs au bon endroit
        for (int i = 0; i < 3; i++) {
            setPieceH(i, 1, pieces[i]);

        }
        //Par défaut les autres emplacements sont déja "nul"



    }

//    public int nbColonnes(){
//        return emplacement.length;
//    }
    //Fonction d'affichage de
    public String toString() {
        StringBuilder grille =new StringBuilder();

// Boucle pour parcourir les lignes de la grille
        for (int i = 0; i < 3; i++) {
            grille.append("* * * * * * * * * * * * *\n");
            grille.append("*       *       *       *\n");
            // Boucle pour parcourir les colonnes de chaque ligne
            for (int j = 0; j < emplacement[i].length; j++) {
                grille.append("*   " + getContenueEmplacement(i,j) + "   ");
            }
            grille.append("*\n");
            grille.append("*       *       *       *\n");
        }
        grille.append("* * * * * * * * * * * * *\n");

        return grille.toString();
    }

}