//Badjessa B. Bahoumda
//CSE 2
//my program asks input from user and creates triangle based on them
import java.util.Scanner;
public class Triangles{
    //add main method
    public static void main(String[] args){
        //defining variable for while loop
        int X = 0;
        int y =0; 
        Scanner myScan = new Scanner(System.in);

                while (X == 0) { //enter loop if condition is met
                        System.out.print("Enter a number between 5 and 30: "); //print statement if(input.hasNextInt()) { //if an int was typed in enter if statement
                        y = myScan.nextInt(); //assigning variable
                        X = 1; //exit the loop
                        if (y >= 5 && y <= 30) { //if y is between those numbers do nothing
                    }
                        else{ //if does not meet those condidtions 
                        System.out.println("Please Enter a number between 5 and 30."); 
                        X = 0; //print statement and reenter loop
                    }
                }
                        if (!myScan.hasNextInt()) { //if an int is not entered 
                        System.out.println("Please Enter an integer."); 
                        myScan.next(); //print statement and re enter loop
                }
        }
}
