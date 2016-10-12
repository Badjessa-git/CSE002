//Badjessa B. Bahoumda
//10/10/2016
//CSE2 hw06
//This program asks the user to input their mailing address

import java.util.Scanner;

//declaring class
public class Hw06{
    //adding main method
    public static void main (String[] args){
        //declaring the scanner variable myScan
        Scanner myScan = new Scanner(System.in);
        //asking for the street number
        System.out.print("Enter your Street number:");
        //putting a loop which requires the user to input an integer as street number
        while(!myScan.hasNextInt()){
            System.out.print("This is not a street number, enter your street number: ");
            myScan.next();
            break;
        }
        //declaring variable num as street number
        int num = myScan.nextInt();
        //asking user to input street name
        System.out.print("Enter your Street name: ");
        //putting a loop requiring the user to input a string for the street name
        while(!myScan.hasNext()){
            System.out.println("You did not input a street name, please enter your street name: ");
            myScan.next();
            break;
        }
        //declaring string st as the street name
        String St = myScan.next();
        //asking the user  for their apartment number
        System.out.print("Enter your apartment number: ");
        //looping so that the user is required to input an integer for the apartment number
        while(!myScan.hasNextInt()){
            System.out.print("This is not an apartment number, enter your apartment number: ");
            myScan.next();
            break;
        }
        //decalring variable numap as the apartment number
        int numap = myScan.nextInt();
        //asking the user for the name of their city
        System.out.print("Enter your City: ");
        //looping so that the user is required to input a string for their city name
        while(!myScan.hasNext()){
            System.out.print("You did not input city, please enter your city: ");
            myScan.next();
            break;
        }
        //declaring variable ct as the name of the city
        String ct = myScan.next();
        //asking the user to input their state
        System.out.print("Enter your State: ");
        //looping so that the user is required to enter a string for their state
        while(!myScan.hasNext()){
            System.out.print("This is not a state, Enter your State: ");
            myScan.next();
            break;
        }
        //declaring variable Ste as the state
        String Ste = myScan.next();
        //asking for the user's zip code
        System.out.print("Input your zip code: ");
        //looping so that the user is required to put integers as his zip code
        while(!myScan.hasNextInt()){
            System.out.print("This is not a zip code, please enter your zip code: ");
            myScan.next();
            break;
        }
        //declaring the integer zp as the zip code
        int zp = myScan.nextInt();
        //printing out the final address based on the input of the user
        System.out.print("your address is "+num+" "+St+" Apt "+numap+", "+ct+" "+Ste+" "+zp);
    }
        
}