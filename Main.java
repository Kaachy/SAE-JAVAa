import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plateau p = new Plateau();

        System.out.println(p);







//        Plateau p = new Plateau();
//        for(int i = 0 ; i < 3 ; i ++){
//            for(int j = 0 ; j<3 ; j++){
//
//            }
//        }
//        System.out.println(p);
////        Scanner sc = new Scanner(System.in);
////        System.out.println("******************************");
////        System.out.println("Bienvenue dans le 3Spots Game!");
////        Joueur j1;
////
////        do {
////            System.out.println("Joueur n°1, choisissez la couleur de votre pièce('B' pour Bleu, 'R' pour Rouge): ");
////            j1 = new Joueur(sc.next().charAt(0));
////            if (j1.getCouleur() == 'R') {
////                Joueur j2 = new Joueur('B');
////                System.out.println("Très bien, le joueur n°1 a la pièce " + j1.getCouleur() + "\nEt le joueur n°2 a la pièce " + j2.getCouleur());
////            } else if (j1.getCouleur() == 'B') {
////                Joueur j2 = new Joueur('R');
////                System.out.println("Très bien, le joueur n°1 a la pièce " + j1.getCouleur() + "\nEt le joueur n°2 a la pièce " + j2.getCouleur());
////            }
////        } while (j1.getCouleur() != 'R' && j1.getCouleur() != 'B');//Controle la saisie d'un caractère valide
//
//
//        //Créer un plateau vierge
//
//

    }

        /*for (int i = 0; i < 3; i++) {
            grille.append("* * * * * * * * * * * * *\n");
            for (int j = 0; j < 3; j++) {
                grille.append("*       *       *       *\n");
                grille.append("*       *   " + emplacement[i][j].appartient + "    *       *\n");
                grille.append("*       *       *       *\n");
                grille.append("* * * * * * * * * * * * *\n");


            }
        }
        grille.append("* * * * * * * * * * * * *\n");

        return grille.toString();
    }

    Plateau(){
        for (int i = 0 ; i < 3 ; i++){
            for(int j= 0 ; j < 3 ;j++){
                emplacement[i][j]= new Emplacement();
                emplacement[i][j].appartient='G';
            }
        }
    }


    //Constructeur de jeu:
//    Plateau(){
//        //Création des spots
//        for(int i = 0 ; i < 3 ; i++){
//            this.emplacement[i][2] = new Spot();
//        }
//
//        //Le rouge sera placé en premier indépendement de à quel joueur il appartient
//        if(joueurs[0].piece.couleur=='R' && joueurs[1].piece.couleur=='B'){
//            setEmplacement(joueurs[0].piece,0);
//            setEmplacement(joueurs[0].piece,1);
//
//            setEmplacement(joueurs[1].piece,6);
//            setEmplacement(joueurs[1].piece,7);
//        } else if (joueurs[1].piece.couleur=='R'&& joueurs[0].piece.couleur=='B') {
//            setEmplacement(joueurs[1].piece,0);
//            setEmplacement(joueurs[1].piece,1);
//
//            setEmplacement(joueurs[0].piece,6);
//            setEmplacement(joueurs[0].piece,7);
//        }

//        setEmplacement(W,3);//La piece de couleur neutre prendra toujours ces position là
//        setEmplacement(W,4);
//
//    }


    public int getAbsice(int position) {
        assert (position > 0 && position <= 9);

        switch (position) {
            case 1:
                return 0;


            case 2:
                return 0;


            case 3:
                return 0;


            case 4:
                return 1;


            case 5:
                return 1;

            case 6:
                return 1;

            case 7:
                return 2;

            case 8:
                return 2;

            case 9:
                return 2;

            default:
                return 0;


        }

    }

    public int getOrdonee(int position) {
        assert (position > 0 && position <= 9);

        switch (position) {
            case 1:
                return 0;


            case 2:
                return 1;


            case 3:
                return 2;


            case 4:
                return 0;


            case 5:
                return 1;

            case 6:
                return 2;

            case 7:
                return 0;

            case 8:
                return 1;

            case 9:
                return 2;

            default:
                return 0;


        }

    }

}
    class Joueur {
        Piece piece = new Piece();//Un joueur a une piece
        int score;//Variable qui stock le nb de points d'un utilisateur

        Joueur(char c) {//c pour couleur
            score = 0;
            this.piece.couleur = c;
        }

        public char getCouleur() {
            return piece.couleur;
        }

    }



/*class Spot{


}*/



}


