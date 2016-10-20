//Badjessa B. Bahoumda
//CSE2
//hw 07
// 10/19/2016
//This program asks the user for two inputs and print a twist pattern as an output

import java.util.Scanner;

public class Twisty{
    //add main method
    public static void main(String[] args){
        //declaring var myScan
        Scanner myScan = new Scanner(System.in);
        //declaring variable x and y for length and width
        int x = 0;
        int y = 0;
        //looping to ask for an integer and assign x to inputed integer.
        while(x == 0){
        //asking the user for length input
        System.out.print("Input your desired length: ");
        //if statement loop to ensure user input integer
        if (!myScan.hasNextInt()){
            System.out.println("Error: please type in an integer");
            myScan.next();
        }
        else{
        x = myScan.nextInt();
        }
        if (x > 80){
            System.out.println("Error: please input a length smaller than 80");
            x = 0;
        }
    }
        while(y == 0){
            //asking the user for width input
            System.out.print("Input your desired width: ");
            //if statement to ask for an integer;
            if (!myScan.hasNextInt()){
                System.out.println("Error: please type in an integer");
                 myScan.next();
            }
            else{
                y = myScan.nextInt();
            }
            if (y > x){
                System.out.println("Error: type an integer that is smaller than the length: ");
                y = 0;
            }
        }
    for(int i=0; i<y; i++){
        for(int j=0; j<x; j++){
            if(i==j%y){
                System.out.print("#");
            }
            else{
                System.out.print(" ");
            }
            if((i+j%y)%y==y-1){
                System.out.print("/");
            }
            else{
                System.out.print(" ");
            }
    }  
    System.out.println();
    }
    }
}