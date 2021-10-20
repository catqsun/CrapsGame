/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;

/**
 * Used to execute an entire game of Craps
 * @author Cathy Sun
 */
public class Craps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an object "game" and call the method to play  whole game of craps
        CrapsGame game = new CrapsGame();
        game.game();
    }
    
}
