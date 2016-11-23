//Badjessa B. Bahoumda
//CSE2
//My program will be determining if a random generated hand of card has a straight
import java.util.Scanner;
import java.util.Random;

public class Straight{
    public static void main(String[] args){
        int[] cards = new int[52];
        int[] player1 = new int[5];
        Random myrand = new Random();
        for(int i=0; i<cards.length; i++){
            cards[i] = i;
        }
        int counter = 0;
        boolean a = false;
    for(int i=0; i<1000000; i++){
        player1 = randomizeHand(cards);
        a = straight(player1);
        if(a==true){
            counter++;
        }
    }
    System.out.println(counter);
    System.out.println(counter/1000000);
    }
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
    public static int[] randomizeHand(int[] list){
        //this generates copies
        int[] player1 = new int[5];
            for(int i=0; i<player1.length; i++){
                int target = (int) (list.length * Math.random());
                player1[i] = list[target];
            }
            return player1;
        }
    public static boolean method1(int[] list, int a){
        boolean b = false;
        for(int i=0; i<list.length;i++){
            if(list[i]%13 == a){
                b = true;
            }
        }
        return b;
    }
    public static int method2(int[] list){
        int a=0;
    for(int j=0; j<list.length; j++){
        for(int i=0; i<list.length-1;i++){
            if(list[j]<list[i+1]){
                a = list[j];
                break;
                }
            }
        }
        return a;
    }
    public static boolean straight(int[] list){
        int a = method2(list);
        int counter = 0;
        boolean b = false;
        for(int i=0; i<list.length-1;i++){
            if(a <list[i+1] && list[i+1] == list[i]+1){
                counter++;
                if(counter == 5){
                b = true;
            }
            else{
                counter = 0;    
               b = false;
                }
            }
        }
        return b;
    }
}