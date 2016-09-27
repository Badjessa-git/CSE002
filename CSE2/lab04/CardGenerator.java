//Badjessa B. Bahoumda
//September 23, 2016
//lab04
//my program can pick a random card from a deck of cards
//importing Math.random()
import java.lang.*;
//define class
public class CardGenerator{
    //add main method
    public static void main(String[] args){
    //defining the number of card
    int numberOfcard;
    //Pick a random card from 1 to 52
    numberOfcard = (int)((Math.random() * 52) + 1);
    //declaring the name of the card and suit of the card
    String suitOfcard="";
    //making the switch statement which chooses the suit of the card
    switch ((int)(numberOfcard/13)){
        case 0:
            suitOfcard= "diamonds";
            break;
        case 1:
            suitOfcard= "clubs";
            break;
        case 2:
            suitOfcard= "hearts";
            break;
        case 3: case 4:
            suitOfcard= "spades";//added case 4 because 52/14 is 4
    }
    //making the switch statement which would assign cards like king etc.. based on remainder 
    switch (numberOfcard%13){
        case 0:
            System.out.println("You picked the King of "+suitOfcard);
            break;
        case 1:
            System.out.println("You picked the Ace of "+suitOfcard);
            break;
        case 11:
            System.out.println("You picked the Jack of "+suitOfcard);
            break;
        case 12:
            System.out.println("You picked the Queen of "+suitOfcard);
            break;
        default:
            System.out.println("You picked the "+numberOfcard%13+ " of "+suitOfcard);
    };
    }//end of method
}//end of class