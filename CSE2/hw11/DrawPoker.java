//Badjessa B. Bahoumda
//CSE2
//hw11
//The program implement a pocker game, it generate hands for players, draw the cards and decide which hand wins

import java.util.Random;

public class DrawPoker{
    //adding the main method
    public static void main(String[] args){
        //declaring the array for all the cards in deck
        String[] suitNames ={"D","H","C","S"};
        String[] rankNames ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] cards = new String[52];//arrays for the cards
        String[] hand1 = new String[5];//hand of the second player
        String[] hand2 = new String[5];//hand of the first player
        //assigning card to all the values in the arrays
        for (int i=0; i<52; i++){
            cards[i] = rankNames[i%13]+suitNames[i/13];
        }
    shuffle(cards);//shuffling the cards
    hand1 = randomizeHand(cards);//assigning random cards to player 1
    hand2 = randomizeHand(cards);//random cards to player 2
    boolean result1, result2;//boolean to decide winner
    result1 = pair(hand1);//boolean for player 1
    result2 = pair(hand2);//boolean for player 2
    result1 = flush(hand1);
    result2 = flush(hand2);
    System.out.print("The hand of player 1: ");
    printArray(hand1);
    System.out.print("The hand of player 2: ");
    printArray(hand2);
    if(result1 == true){
        System.out.println("Player 1 wins");
    }
    else if(result2 == true){
        System.out.println("Player 2 wins");
    }
    else{
        System.out.println("Nobody wins");
    }
    }//end of method
    //adding flush method
    public static boolean flush(String[] list){
        boolean a = false;
        for(int i=1; i<list.length-1; i++){
            char x = list[i].charAt(1);
            char b = list[i-1].charAt(1);
            //if they have the same suit
            if(x == b){
                a = true;
            }
            else{
                a = false;
            }
        }
        return a;
    }
    //adding pair method
    public static boolean pair(String[] list){
        boolean a = false;
        for(int i=1; i<list.length-1; i++){
            char x = list[i].charAt(0);
            char b = list[i-1].charAt(0);
            if(x == b){//if the suit is the same then return true
                a = true;
            }
            else{
                a = false;
            }
        }
        return a;
    }
     //adding last method
    public static String[] randomizeHand(String[] list){
        //this generates five numbers
        String[] list2 = new String[5];
            for(int i=0; i<5; i++){
            int target = (int) (list.length * Math.random());
            list2[i] = list[target];
        }
    return list2;
    }
    //adding shuffle method
    public static void shuffle(String[] list){
        for(int i=0; i<list.length; i++){
        //finding random number to change
            int target = (int) (list.length * Math.random());
            //changing values
            String temp = list[target];
            list[target] = list[i];
            list[i] = temp;
        }
    }
     //adding printarray method
    public static void printArray(String[] list){
        for (int i = 0; i<list.length; i++){
            System.out.print(list[i]+" ");//printing all the values in the arrays
        }
        System.out.println("");
    }//end of method
}