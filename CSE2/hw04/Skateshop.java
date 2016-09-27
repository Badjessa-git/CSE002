//Badjessa B. Bahoumda
//September 24, 2016
//hw04
//my programs figures out what board type is preferred by the user, what
//their preferred shape/length is, and what their preference is for wheels, bearings, and colors.
//Then prints out the exact product preferred by the user (by printing out all their preferences)
//then prints out the final price.

//importing the scanner class
import java.util.Scanner;

//defining the main class
public class Skateshop{
    //adding main method
    public static void main(String[] args){
        //declare scanner instances to record input from user
        Scanner myScanner = new Scanner(System.in);
        Scanner sdScanner = new Scanner(System.in);
        //showing all the different option for the user
        System.out.println("Reason for skating: tricks (i.e. NOT cruising, racing):");
       
        System.out.println("Reason for skating: cruising, racing (i.e. NOT TRICKS)");

        //asking the user to choose their preferred type of board
        int bdType;
        System.out.print("Press 0 if you want a trick board or 1 if you want a  longboard: ");
        bdType = myScanner.nextInt();
        System.out.print("Type the options as you see them appear on the screen");
        //asking the user to choose the specific board chosen
        int length = 0;
        String bdShape = "";
        switch (bdType){
            case 0:
                System.out.println("Preferred length: 22 in = $80");
                System.out.println("Preferred length: 24 in	= $80");                     
                System.out.println("Preferred length: 26 in	= $80");                      
                System.out.println("Preferred length: 28 in	= $80");                        
                System.out.println("Preferred length: 30 in	= $90");
                System.out.println("Preferred length: 32 in	= $90");                        
                System.out.println("Preferred length: 34 in	= $90");
                System.out.print("Type in your preferred length: ");
                length = myScanner.nextInt();
                break;
            case 1:
                System.out.println("Preferred Board shape: Pintail longboard = $100");
                System.out.println("Preferred Board shape: Swallowtail longboard = $140");
                System.out.println("Preferred Board shape: flat-nose longboard = $90");
                System.out.println("Preferred Board shape: drop-through deck longboard = $150");
                System.out.println("Preferred Board shape: standard longboard = $120");
                System.out.print("Type in the type of longboard preferred: ");
                bdShape = sdScanner.nextLine();
                break;
        }
        //showing all the different options for boards
        System.out.println("Options for all boards");
        System.out.println("Wheels ");
        //adding the flat-nose longboard exception and the trickboard exception
        if (bdShape == "flat-nose longboard"){
            System.out.println("Large wheels = +$29");
        }
        else if (bdType == 0 ){
            System.out.println("Small wheels = +$0");
        }
        else {
            System.out.println("Large wheels = +$29");
            System.out.println("Small wheels = +$0");
        }
         //asking the user for the choice of wheels
        System.out.print("Type your choice for wheels: ");
        String wheels = sdScanner.nextLine();
        //showing the exceptions to the user
        System.out.println("Exceptions: ");
        //showing bearing options
        System.out.println("Bearings");
        System.out.println("ABEC-9 = +$20");
        System.out.println("ABEC-7 = +$10");
        System.out.println("ABEC-5 = +$0");
        //asking user for the choice of bearings
        System.out.print("Type your choice of bearings: ");
        String Brgs = sdScanner.nextLine();
        //showing the different colors options for the user
        System.out.println("Colors");
        //adding the color exception to the code
        if (bdType == 1){
            System.out.println("Red = +$20");
            System.out.println("Yellow = +$5");
            System.out.println("Black = +$0");
        }//if a longboard is chosen the color to show are red, yellow and black
        else {
            System.out.println("Red = +$20");
            System.out.println("Blue = +$20");
            System.out.println("Green = +$20");
            System.out.println("Yellow = +$5");
            System.out.println("Black = +$0");
        }    
        //asking the user for the choice of colors
        System.out.print("Choose your color: ");
        String Color = sdScanner.nextLine();
        //telling the user that their choices is not applicable if conditions are met    
        if ((bdType == 1) & (Color == "Green") | (Color == "Blue")){
                    System.out.println("Longboards cannot be Green or Blue");
                    System.exit(1);
        }
        //finding the different prices of length based on user input
        double price = 00.0;
        switch(length){
            case 22: case 24: case 26: case 28:
                price = 80;
                break;
            case 30: case 32: case 34:
                price = 90;
                break;
        }
        //declaring sprice the price for the longboard based on user input    
             double sprice = 00.0;      
            switch(bdShape){
                case "Pintail longboard":
                    sprice = 100;
                    break;
                case "Swallowtail longboard":
                    sprice = 140;
                    break;
                case "flat-nose longboard" :
                    sprice = 90;
                    break;
                case "drop-through deck longboard":
                    sprice = 150;
                    break;
                case "standard longboard":
                    sprice = 120;
                    break;
            }
    //finding price of wheels base on user input
    double wprice = 00.0;
    switch (wheels){
        case "Large wheels":
        wprice = 29;
        break;
        case "Small wheels":
        wprice = 0;
        break;
    }
    //finding price of bearings base on user input
    double bprice = 00.0;
    switch (Brgs){
        case "ABEC-9":
            bprice = 20;
            break;
        case "ABEC-7":
            bprice = 10;
            break;
        case "ABEC-5":
            bprice = 0;
    }
    //finding price of colors based on user input
    double cprice = 00.0;
    switch (Color){
        case "Red": case "Blue":case "Green":
            cprice = 20;
            break;
        case "Yellow":
            cprice = 5;
            break;
        case "Black":
            cprice = 0;
    }
    //declare the final and product
    double fprice = price + wprice + bprice + cprice + sprice;
    //if statement for choice based on whether it is a trick board or longboard
    if (bdType == 1){
    System.out.println("You chose the "+bdShape+" with "+wheels+ ", the bearing type: "+Brgs+ " and the "+Color+ " color.");
    }
    else{
        System.out.println("You chose the "+length+ " in trickboard with "+wheels+ ", the bearings type: "+Brgs+ "and the "+Color+ " color.");
    }
    System.out.println("Your final price comes to $"+fprice);
    }//end of method
}//end of class