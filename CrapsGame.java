/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;

/**
 * Class that executes multiple rounds of craps
 * @author Cathy Sun
 */
public class CrapsGame {
    
    CrapsRound game = new CrapsRound(); //object to call other class methods
    private int round; //keeps track of the number of rounds played
/**
 * constructor that initializes the round counter to 0
 */
public CrapsGame(){
    round = 0; 
}
/**
 * Method that determines how many round of craps will be executed and how many of them will be printed
 */
public void game(){
    //Prints out the first ten rounds of craps that are played
    for (round = 1; round <= 10; round++){
        System.out.println("Round " + round + ": ");
        game.roundPrint();
    }
    //Executes rest of the games without printing out the results
    for (int x = 1; x <= 999990; x++){
        game.round();       
    }
    //Prints out the total amount of wins and losses from all the games played
    System.out.println("Overall Final Results: " + "    Wins: " + game.getWins() + "   Loss: " + game.getLoss());
}
}
