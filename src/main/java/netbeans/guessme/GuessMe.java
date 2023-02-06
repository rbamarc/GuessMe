
package netbeans.guessme;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class GuessMe {

    public static void main(String[] args) {
        //assign the variables used in the program
        int num = 12;
        String guess = "";
        int userGuess = 0;
        
        //initialize scanner 
        Scanner inputReader = new Scanner(System.in);
        
        //prompt user for an input 
        System.out.println("Hello! please pick a number between 1 and 20");
        guess = inputReader.nextLine();
        
        userGuess = Integer.parseInt(guess);
        
        if (userGuess < num) {
            System.out.println("nice try, that was too low. it was: " + num);
        } else if (userGuess > num) {
            System.out.println("Too bad, too high. It was: " + num);
        } else {
            System.out.println("Nice Guess! That was it! mind reader!!");
        }
    }
}
