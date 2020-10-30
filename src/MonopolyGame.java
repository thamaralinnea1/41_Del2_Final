import java.util.Scanner;
public class MonopolyGame {

    public static void main(String[] args) {
        int winningScore = 3000;
        Board board = new Board();
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        Scanner keyb =new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("Player 1 set your name: " );
        String Player1 = keyb.nextLine();
        player1.setName(Player1);


        System.out.println("Player2 set your name: ");
        String Player2 = keyb.nextLine();
        player2.setName(Player2);

        System.out.println("Welcome to monopoly " + player1.getName() + " and " + player2.getName());
        System.out.println(player1.getName()+" start balance is " + player1.account.getBalance() + " and " + player2.getName() + " start balance is "+ player2.account.getBalance());

        boolean turn = true;

        Scanner input = new Scanner(System.in);
        while (player1.account.getBalance() < winningScore && player2.account.getBalance() < winningScore){

            String roll = input.nextLine();
            System.out.println( " roll dice by pressing r + enter");
            if (roll.equals("r")){
                die1.roll();
                die2.roll();

                int sumDice = die1.getFacevalue() + die2.getFacevalue();

                int points = board.getpoints(sumDice);
                String text = board.getText(sumDice);


                if (turn == true) {
                    player1.account.addPoints(points);
                    System.out.println(text);
                    System.out.println(player1.getName()+ " your balance is: " + player1.account.getBalance());

                }
                else {
                    player2.account.addPoints(points);
                    System.out.println(text);
                    System.out.println(player2.getName()+ " your balance is: " + player2.account.getBalance());
                }
                if (board.getBonusturn(sumDice)) {
                    System.out.println("Congratulations, you get a bonus turn. Roll the dice again. ");
                }
                else {
                    turn =! turn;
                }
            }
        }

        if (player1.account.getBalance()> player2.account.getBalance()) {
            System.out.println(player1.getName() + " is the winner");

        }
        else {
            System.out.println(player2.getName() + " is the winner");
        }


    }
}









