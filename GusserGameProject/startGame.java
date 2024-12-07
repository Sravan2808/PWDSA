import java.util.Scanner;

class Guesser{
    int guessNum;
    int guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from guess");
        guessNum=sc.nextInt();
        return guessNum;
    }
}
class Player{
    int guessNumFromP;

    int guessNumberFromPlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from player");
        guessNumFromP=sc.nextInt();
        return guessNumFromP;
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectTheNumFromGuesser(){
        Guesser guesser=new Guesser();
       numFromGuesser= guesser.guessNumber();
    }
    void collectTheNumFromPlayer(){
        Player player1=new Player();
        Player player2=new Player();
        Player player3=new Player();
       numFromPlayer1= player1.guessNumberFromPlayer();
       numFromPlayer2=player2.guessNumberFromPlayer();
       numFromPlayer3=player3.guessNumberFromPlayer();
    }
    void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("All Players won the game");
            } else if (numFromGuesser==numFromPlayer2) {
                System.out.println("Player 1 and Player 2 won the game");
            } else if (numFromGuesser==numFromPlayer3) {
                System.out.println("Player 1 and Player 3 won the game");
            }
            else{
                System.out.println("Player 1 won the game");
            }
        } else if (numFromGuesser==numFromPlayer2) {
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 2 and Player 3 won the game");
            }
            else {
                System.out.println("Player 2 won the game");
            }

        } else if (numFromGuesser==numFromPlayer3) {
            System.out.println("Player 3 won the game");
        }
        else{
            System.out.println("No one won the game");
        }
    }
}
public class startGame {
    public static void main(String[] args) {
        Umpire umpire=new Umpire();
        umpire.collectTheNumFromGuesser();
        umpire.collectTheNumFromPlayer();
        umpire.compare();
    }
}
