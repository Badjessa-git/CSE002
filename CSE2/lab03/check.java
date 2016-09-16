//Badjessa B. Bahoumda
//CSE2
//September 16, 2016
//lab03, check.java
//My program will be able to determine how much a person in a group need to spend
//to pay a check based on the original cost, the percentage tip and the way the 
//the check will  be split.

//importing the scanner class
import java.util.Scanner;

//defining class
public class check{
    //adding main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the original cost of the check in the form xx.xx: ");//ask for the amount of the check after the meal
        double checkCost = myScanner.nextDouble();// get the cost inputed by customer
        
        System.out.print("Enter the percentage tip that you wish to pay as the whole number (in the form xx) : "); //ask for the percentage tip
        double tipPercent = myScanner.nextDouble() ; //get the number from inputed number
        tipPercent /= 100; //converting percentage in decimal value
        
        System.out.print("Enter the number of people who went out to dinner: "); //ask number of people at dinner
        int numPeople = myScanner.nextInt(); //get the number from inputed integer
        
        double totalCost; //defining the total cost of the meal
        double costPerPerson; // defining the cost per person
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits to the right of the decimal point for the cost
            
            totalCost = checkCost * (1 + tipPercent); // finding total cost by multiplying meal cost by 1 + tip(decimal)
            costPerPerson = totalCost / numPeople; //finding each person amount owed by diving total by number of people
            //get the whole amount, dropping decimal fraction
            dollars = (int)costPerPerson;
            // get dimes amount, e.g.,
            // (int)(6.73 * 10) % 10 -> 67 %10 -> 7
            // where the % (mod) operator returns the remainder
            // after the division: 583%100 -> 83, 27%5 -> 2
            dimes = (int) (costPerPerson  * 10) % 10;
            pennies = (int) (costPerPerson * 100) % 10;
            System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
            // Printing the final amount owed by everybody
    }//end of main method
}//end of class



