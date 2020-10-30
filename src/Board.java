public class Board {
    Squares[] squares = new Squares[11]; {
        squares[0] = new Squares("climb the Tower and get 250$", +250, false);
        squares[1] = new Squares("Oh no you have stepped in a Crater and broken your leg. Pay 100$ for your medical bill", -100, false);
        squares[2] = new Squares("You have entered the Palace gates and are rewarded with 100$", +100, false);
        squares[3] = new Squares("BRWWW its cold in the desert, buy a pair of gloves for 20$", -20, false);
        squares[4] = new Squares("Welcome to Walled City you are rewarded with 180$", +180, false);
        squares[5] = new Squares("Stay safe in the Monastery", 0, false);
        squares[6] = new Squares("You have been robbed for 70$ in the Black cave", -70, false);
        squares[7] = new Squares("You have reached the Huts in the mountain claim your 60$", +60, false);
        squares[8] = new Squares("You have been bit by a werewolf at The Werewall and need a vaccine for 80$.", -80, true);
        squares[9] = new Squares("You have to fill a pit buy a shovel for 50$", -50, false);
        squares[10] = new Squares("You have found gold in the mountains and sell it for 650$ you are rich! ", +650, false);

    }

    int getpoints (int sumFacevalue) {
     if (sumFacevalue == 12 ){
         return squares[0].getValue();
     }
     else {
         return squares[sumFacevalue-1].getValue();

     }
    }

     String getText (int sumFacevalue){
         if (sumFacevalue == 12) {
             return squares[0].getDescription();
         }
         else {
             return squares[sumFacevalue-1].getDescription();
         }
        }

        boolean getBonusturn (int sumFacevalue)  {
        if (sumFacevalue == 12) {
                return squares[0].getBonusturn();
            }
            else {
                return squares[sumFacevalue-1].getBonusturn();
            }
        }

    }


