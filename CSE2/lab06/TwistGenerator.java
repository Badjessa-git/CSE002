//Badjessa B. Bahoumda
//CSE 2
//lab06
//October 7 2016
//Objective: print a "twist" based on the integer input of the user.
//importing the scanner class
import java.util.Scanner;

//declaring the class
public class TwistGenerator{
    //adding the main class
    public static void main(String[] args){
        //declaring variable myScanner
        Scanner myScanner = new Scanner(System.in);
        //asking the user to input integer;
            System.out.print("Input the length:");
        //looping so that the user has to input an integer
            while (!myScanner.hasNextInt()){
            System.out.print("The number inputed is not an interger, input a positive integer: ");
            myScanner.next();
            break;
        }
        //declaring num as the variable inputed in the program
        int num = myScanner.nextInt();
        
        //declaring variables for the three different lines of the out put.
        int up = num;
        int mid = num;
        int dn = num;
        //putting a while loop so that the backslash, the space and forwardslash are added automatically
        //as the number inputed is decreased by 1
        while (up > 0){
            System.out.print("\\");
            up--;
            if(num > 0){
                System.out.print(" ");
                up--;
            }
            if(up > 0){
                System.out.print("/");
                up--;
            }
        }
        //adding a blank line for the midline to be printed on
        System.out.println(" ");
        //looping so that the space and "X" are added automaticall as num decreases by 1
        while (mid > 0){
            System.out.print(" ");
            mid--;
            if(mid > 0){
                System.out.print("X");
                mid--;
            }
            if(mid > 0){
                System.out.print(" ");
                mid--;
            }
        }
        //printing out a blank line for the bottom row to be printed on
        System.out.println(" ");
        //looping so that the slashes and spaces are added automatically as the number decreases
        while(dn > 0){
            System.out.print("/");
            dn--;
            if(dn > 0){
                System.out.print(" ");
                dn--;
            }
            if(dn > 0){
                System.out.print("\\");
                dn--;
            }
        }
        
            System.out.println(" ");       
    }
        
}

