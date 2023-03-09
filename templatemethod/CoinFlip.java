package templatemethod;
import java.util.Random;

public class CoinFlip  extends Game {
    
    private final String[] side = {"kruuna", "klaava"};
    private int[] flips;
    private int computersChoice;
    private int currentPlayer;
    private Random random = new Random();

    void initializeGame() {
        flips = new int[playersCount];
        computersChoice = random.nextInt(1 - 0 + 1) + 0;
        System.out.println("Pelaajan on heitettävä " + side[computersChoice] + "n voittaakseen\n");
    }
    
    void makePlay(int player) {
        int playersFlip = random.nextInt(1 - 0 + 1) + 0;
        System.out.println("Pelaaja " + (player+1) + " heitti " + side[playersFlip] + "n");
        flips[player] = playersFlip;
        currentPlayer = player;
    }
    
    boolean endOfGame() {
        return currentPlayer == playersCount-1;
    }
    
    void printWinner() {
        System.out.println("");
        Boolean win = false;
        for(int i = 0; i < playersCount; i++){
            if(flips[i] == computersChoice){
                win = true;
                System.out.println("Pelaaja " + (i+1) + " voitti");
            }
        }
        if(!win){
            System.out.println("Ei voittajia");
        }
    }
}
