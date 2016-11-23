import java.util.Scanner;
import java.util.Random;

public class DrawPoker1{
    public static void main(String[] args){
        int[] cards = new int[52];
        int[] player1 = new int[5];//hand of the second player
        int[] player2 = new int[5];//hand of the first player

        Random myrand = new Random();
        for(int i=0; i<cards.length; i++){
            cards[i] = i;
        }
    printArray(cards);
    shuffle(cards);   
    printArray(cards);
    randomizeHand(cards, player1, player2);
    System.out.print("Player 1: ");
    printArray(player1);
    System.out.print("Player 2: ");
    printArray(player2);
    if(pair(player1) == true){
        System.out.println("Player 1 wins");
    }
    else if(pair(player2) == true){
        System.out.println("Player 2 wins");
    }
    else{
        System.out.println("Nobody wins");
        }
    }
    //adding printarray method
    public static void printArray(int[] list){
    for (int i = 0; i<list.length; i++){
    System.out.print(list[i]+" ");//printing all the values in the arrays
        }
        System.out.println("");
    }//end of method
     //adding shuffle method
    public static void shuffle(int[] list){
        for(int i=0; i<list.length; i++){
        //finding random number to change
            int target = (int) (list.length * Math.random());
            //changing values
            int temp = list[target];
            list[target] = list[i];
            list[i] = temp;
        }
    }
    public static void randomizeHand(int[] list, int[] player1, int[] player2){
        //this generates five numbers
            for(int i=0; i<10; i++){
                int counter1 = 0;
                int counter2 = 0;
            if(i % 2 == 0){
             player1[counter1] = list[i];
                counter1++;
            }
            else{
            player2[counter2] = list[i];
                counter2++;
                }
            }
        }
    public static boolean pair(int[] list){
        boolean a = false;
        int[] b = new int[5];
        for(int i=0; i<list.length; i++){
             b[i] = list[i]%13;
        }
    for(int j=0; j<b.length; j++){
        for(int i=0; i<b.length; i++){
            if(b[j] == b[i]){
            a = true;
            break;
            }
            else{
                a = false;
                }
            }
        }
        return a;
    }
}