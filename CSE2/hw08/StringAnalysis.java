//Badjessa B. Bahoumda
//CSE2
//hw08
//My program will process a string by examining all the characters or a specified number of characters
//determing whther they are letters or not.
//importing the scanner class
import java.util.Scanner;

public class StringAnalysis{
    //adding the main method
    public static void main(String[] args){
        //declaring variable myScan for input from user
        Scanner myScan = new Scanner(System.in);
        //asking user for string
        System.out.print("Input a string: ");
        //while loop to ensure user input a string
        while(!myScan.hasNext()){
            System.out.print("Invalid input, Enter a string: ");
            myScan.next();
        }
        //dclaring and defining var y as string inputed
        String y = myScan.nextLine();
        //declaring z as 0 for later use
        int z = 0;
        //Asking user if they want to analyze the user
        System.out.print("Analyze the whole string y/n?: ");
        //looping so that user has to input string
        while(!myScan.hasNext()){
            System.out.print("Invalid input. Answer with y/n: ");
            myScan.next();
        }
        //decalaring var x as inputed answer
        String x = myScan.nextLine();
        x = x.toLowerCase();//making the string lowercase
        //if statement for actions based on inpued answer
        if (x.equals("y")){//if user says y, nothing happens
                z = 0;//this skips everything and z is not used in the analysis
        }
        else if (x.equals("n")){//if user says no
        //asking how many of the character to analyze
            System.out.print("How many of the characters do you want to analyze?: ");
            while(!myScan.hasNextInt()){//looping so that an integer is inputed
                System.out.print("Error: Enter the number of characters to analyze: ");
                myScan.next();
            }
        z = myScan.nextInt();//value of the number of characters to analyze
        }
        else{//in case another letter is inputed
            System.out.print("Error: answer with y/n");
            myScan.next();
            x = myScan.nextLine();
        }
        //decalring boolean a
        boolean a;
    
        if (z == 0){//if z = 0 call the method with just a string as an input
         a = Analysis(y);
        }
         else{//if anything else then call the method with a string and an int as input       
         a = Analysis(y, z);
}

       if (a == true){//if boolean a is true then the string only contain letter
            System.out.println("Your string contain only letters");
        }
        else {//if not true then it is false contains other characters
            System.out.println("Your string does not contain only letters.");
        }
       
    }//end of main method
    //adding method analysis
    public static boolean Analysis(String x){
        //finding the length of the string inputed
        int b = x.length();
        //declaring and initializing boolean z for later use
        boolean z = false;
        //for loop in which all the characters are taken as long as the length is greater than b
        for(int i = 0; i<b; i++){
            char a = x.charAt(i);//character at position i
        if (Character.isLetter(a)){//if the character a is letter then z is true
            z = true;
        }
        else{//if not then boolean z is false
           return z = false;
        }
    }
    return z;//return final value of z 
}//end of method 
    //adding method analysis with string and int as input
    public static boolean Analysis(String x, int y){
        //decalring and initalizing boolean z for use in if statement
        boolean z = false;
        //for loop in which i increases when it is lower than inputed integer
        for(int i=0; i<y;i++){
            //character at position i
           char a = x.charAt(i);
            if (Character.isLetter(a)){//if char a is letter then z is true
                z = true;
            }
            else{//if not then it is false
                return z = false;
            }
        }
        return z;//return final value 
    }//end of method
}//end of class