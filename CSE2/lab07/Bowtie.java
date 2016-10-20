//Badjessa B. Bahoumda
//CSE2
//10/14/2016
//My program will print out bowties and ask user for an inpur between 3 and 33.

import java.util.Scanner;

public class Bowtie{
    //add main method
    public static void main(String[] args){
        
        while(true) {
    int nStars = 9;
    int Line = nStars/ 2;
    int X = 0, S = 1;
    int k = 0, Spce = 0;
    
    k = 100;
    while(X < (Line + 1)){
        k = k - 1;
        Spce = 99;
        while ( S <= nStars){
            while(Spce > k){
                System.out.print(" ");
                Spce--;
            }
            System.out.print('*');
            S++;
        }
        System.out.println();
        nStars = nStars - 2;
        X++;
        S = 1;
    }
    
    nStars = nStars + 2;

    while (S > 1){
        nStars = nStars + 2;
        S = 1;
        k = k + 1;
        Spce = 99;
        while(X <= k){
            System.out.print(" ");
            Spce--;
        }
        System.out.print('*');
        S++;
    }
    System.out.println();
    X--;


Scanner myScan = new Scanner(System.in);
    int y = 0;
    nStars = 0;
    String ex = "";
    
    while (y == 0){
        System.out.print("Enter an odd number between 3 and 33: ");
        if (myScan.hasNextInt()){
            nStars = myScan.nextInt();
            y = 1;
            if (nStars >=3 && nStars <=33){
                if(nStars%2 != 0){
                }
                else{
                    System.out.println("This is not an odd number, input an odd number: ");
                    y = 0;
                }
            }
            else{
                System.out.println("Number is not between 3 and 33. Enter a number between 3 and 33: ");
                y = 0;
            }
        }
        else{
            System.out.println("This is not an integer. input an integer: ");
            myScan.next();
        }
        System.out.print("would you like to exit y/n? ");
        ex = myScan.nextLine();
        if(ex == "y" || ex == "Y"){
            break;
        }
        }
    }
    }
    
}
        