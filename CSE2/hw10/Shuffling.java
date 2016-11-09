//Badjessa B. Bahoumda
//CSE2
//hw10
//My program will be printing out a deck, then shuffle the deck and pick 5 cards from the shuffled deck

//importing the scanner class, randomgenerator
import java.util.Random;
import java.util.Scanner;

public class Shuffling{
    //adding main method
    public static void main(String[] args){
        //delcaring and assigning scanner variable
        Scanner scan = new Scanner(System.in);
        //suiuts club, heart, spade or diamond
        String[] suitNames ={"C","H","S","D"};
        String[] rankNames ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i] = rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
        }
        printArray(cards);
        System.out.println("Shuffled");
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        System.out.println("Randomized Hand!");
        printArray(hand);
        System.out.println("");
    }
    //adding printarray method
    public static void printArray(String[] list){
        for (int i = 0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
        System.out.println("");
    }//end of method
    
    //adding shuffle method
    public static void shuffle(String[] list){
        for(int i=0; i<list.length; i++){
            //finding random number to change
            int target = (int) (list.length * Math.random());
            //changing values
            String temp = list[target];
            list[target] = list[i];
            list[i] = temp;
            // printing out values
            System.out.print(list[i]+" ");
        }
    }//end of method
    
    //adding last method
    public static String[] randomizeHand(String[] list){
        //this generates five numbers
        String[] list2 = new String[5];
            for(int i=0; i<5; i++){
            int target = (int) (list.length * Math.random());
            list2[i] = list[target];
        }
    return list2;
    }//end of method
}//end of class
