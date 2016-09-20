//Badjessa B. Bahoumda
//CSE2 
//Homework 3
//September 16, 2016
//This program will be able to compute the volume of a pyramid based on inputed dimensions of user

//import the scanner class
import java.util.Scanner;

//defining class
public class Pyramid{
    //add the main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//using my scanner utility to get input from keyboard
        System.out.print("The square side of the pyramid is (input length in the from xx) :");//ask user to input lenght of pyramid
        double pyLength = myScanner.nextDouble();//defining length as the inputed number from keyboard
        
        System.out.print("The height of the pyramid is (input height in the form xx) :");//ask user to input the height of the pyramid
        double pyHeight = myScanner.nextDouble();//defining height as the second inputed number from keyboard 
        
        System.out.print("The base width of the pyramid is (input width in the form xx) :");//ask user to input the width of the pyramid
        double pyWidth = myScanner.nextDouble();//defining width as the third inputed number from keyboard
        
        int pyVolume; //defining the volume of the pyramid as pyVolume
        pyVolume = (int)((pyLength * pyHeight * pyWidth) / 3) ;//adding the volume formula to pyVolume
        
        System.out.println("the volume inside the pyramide is : "+pyVolume+".");//printing out result of computation
        
    }//end of method
}//end of class