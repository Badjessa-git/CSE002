//Badjessa B. Bahoumda
//CSE2 
//Homework 3
//September 16, 2016
//This program will be able to convert meter into inches

//import the scanner class
import java.util.Scanner;

//defining class
public class convert{
    //adding main method
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in); //defining my scanner to get input from user
        System.out.print("Enter the distance in meters in the form xx.xx : ");//asking user to enter distance in meters
        double disMeter = myScanner.nextDouble();//recording the number typed by user
        
        double disInches; //defining the distance in inches
        disInches = (int)((disMeter * 39.37007874)*10000)/10000.0;//converting factor from meter to inches
        
        //printing result in inches
        System.out.println(disMeter+ " meters is " +disInches+ " inches");
    }//end of main method
}//end of class