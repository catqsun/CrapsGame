/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;

/**
 * class that defines a round of craps and creates a pair of dice
 * @author Cathy Sun
 */
public class CrapsRound {
    
    private int win = 0; //keeps track of wins
    private int loss = 0; //keeps track of losses
    private int roundPoint; //keeps track of the point for the round
    private int dice1; //dice number 1
    private int dice2; //dice number 2
    private int sum; //sum of the two dice that are rolled
    private int rollCounter = 1; //keeps track of the number of rolls of dice
 /**
  * 
  * @return returns the sum of the the two dice that are rolled
  */   
public int getSum(){
    dice1 = (int)(Math.random()*6+1);
    dice2 = (int)(Math.random()*6+1);
    sum = dice1 + dice2;
    return sum;
}
/**
 * executes 1 round of craps and prints out the results and the number of the dice
 */
public void roundPrint(){
    
    int roll = getSum();
    
    //checks to see if first roll is either a 7 or 11, if it is it is a win
    if (roll == 7 || roll == 11){
        
        win = win + 1;
        System.out.println("Roll 1:     " + "Dice 1: " + dice1 + "   Dice 2: " + dice2 + "   Total: " + roll);
        System.out.println("Win!");
    }
    
    //checks to see if first roll is equal to 2, 3, or 5,, if it is it is a loss
    if (roll == 2 || roll == 3 || roll == 12){
        
        loss = loss + 1;
        System.out.println("Roll 1:     " + "Dice 1: " + dice1 + "   Dice 2: " + dice2 + "   Total: " + roll);
        System.out.println("Loss!");
    }
    
    // if none of the above are rolled roll becomes round point
    else if (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10){
        roundPoint = roll;
        
        System.out.println("Roll 1:     " + "Dice 1: " + dice1 + "   Dice 2: " + dice2 + "   Total: " + roll);
        System.out.println("Point is: " + roundPoint);
    
    //keeps rolling the dice until either the round point of a 7 are rolled
    do {
    
    int roll2 = getSum();
    
    //checks to see if roll is equal to the round point and counts as a win if true and breaks
    if (roll2 == roundPoint){
        win = win + 1;
        rollCounter = rollCounter + 1;
        System.out.println("Roll " + rollCounter + ": " + "    Dice 1: " + dice1 + "   Dice 2: " + dice2 + "   Total: " + roll2);
        System.out.println("Win!");
        break;
        
    }
    
    //checks to see if roll is equal to 7 and counts as a loss if true and breaks
    if (roll2 == 7){
        loss = loss + 1;
        rollCounter = rollCounter + 1;
        System.out.println("Roll " + rollCounter + ": "  + "    Dice 1: " + dice1 + "   Dice 2: " + dice2 + "   Total: " + roll2);
        System.out.println("Loss!");
        break;
    }
    
    //if none of the above are true only the number of rolls increases and code will continues looping until it rolls 7 or the round point
    if (roll2 != roundPoint || roll2 != 7){
        rollCounter = rollCounter + 1;
        System.out.println("Roll " + rollCounter + ": "  + "    Dice 1: " + dice1 + "   Dice 2: " + dice2 + "   Total: " + roll2);
        
    }
    
    }
    while (roundPoint != roll || roundPoint != 7);
    }
    
    System.out.println("Overall Results:    " + "Wins: " + win + "   Loss: " + loss );
    rollCounter = 1;
}
/**
 * same as method roundPrint() and executes 1 round of craps but without any of the print statements
 */
public void round(){
    
    int roll = getSum();
    
    if (roll == 7 || roll == 11){
        
        win = win + 1;
       
    }
    if (roll == 2 || roll == 3 || roll == 12){
        
        loss = loss + 1;
       
    }
    else if (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10){
        roundPoint = roll;
        
  
    do {
    
    int roll2 = getSum();
    
    if (roll2 == roundPoint){
        win = win + 1;
        rollCounter = rollCounter + 1;
        
        break;
        
    }
    if (roll2 == 7){
        loss = loss + 1;
        rollCounter = rollCounter + 1;
        
        break;
    }
    if (roll2 != roundPoint || roll2 != 7){
        rollCounter = rollCounter + 1;
       
        
    }
    
    }
    while (roundPoint != roll || roundPoint != 7);
    }
    

    rollCounter = 1;
}
/**
 * 
 * @return a method to get the total amount of wins 
 */
public int getWins(){
    return win;
}
/**
 * 
 * @return a method to get the total amount of losses 
 */
public int getLoss() {
    return loss;
}
}

