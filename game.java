/**
 * This is the main class of the game, it contains the main method which is the entry point of the game.
 * The Game class is responsible for managing the overall game flow, initializing the game world (creating rooms and items), 
 * handling player input, and controlling the progression of the game.
 * It uses the functions created in all the classes
 */

import java.util.ArrayList;
import java.util.Scanner;

public class game {
    public static void main(String[] agrs) throws InterruptedException {
    
        player player1 = new player(); // Creating an instance of player class for performing functions from player class

        player1.initialValues(); // Setting the intial values of object player1 as health = maxHP; level = 1; xp = 0; numPotions = 1;

    
        player.login(); // Logging in the user 
        player1.instructions();
        item.heal(player1); // Using the heal function to heal the user from the first attack
        item.stats(player1); // Calling the stats function to print the statistics of the player
    
        Thread.sleep(2000);
        
        Move xyz = new Move();
        System.out.println();
        xyz.advance();

        

    }
        
}
