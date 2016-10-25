//Badjessa B. Bahoumda
//CSE 02
//Oct 21, 2016
//lab 09: This program will generate a sentence and randomly create a paragraph

//importing the random utility
import java.util.Random;
//importing the scanner utility
import java.util.Scanner;

public class Method{
    //adding main method
    public static void main(String[] args){
        //declaring myScan for user input
        Scanner myScan = new Scanner(System.in);
        int x = 0;//declaring x for use in while loop
        //asking for user input
        System.out.print("Generate a sentence, y/n: ");
        while (x == 0){//while loope which generate the sentence
            while(!myScan.hasNext()){//while loop forces the user to in put a string
                System.out.print("Invalid input, respond with y/n: ");
                myScan.next();
            }
            String y = myScan.nextLine();//string y contains user input
            y = y.toLowerCase();//make input lowercase
            switch(y){//switch for case based on possible user input
                case "y"://if the user input y create a setenece
            String k = Adjectives();//calling adjectives method
            String l = Subject();//calling subject method
            String g = Verb();//calling verb method
            String o = Obj();//calling object method
            System.out.println("The "+k+ " "+l+" "+g+" the "+o+". ");//generating sentence
            System.out.print("Would you like to generate another? y/n: ");//asking user for input regarding another sentence
            while(!myScan.hasNext()){//loop forcing user to input a string
                System.out.println("Invalid input, respond with y/n: ");
                myScan.next();
            }
            break;
                case "n"://if user input no, x becomes 2 and java exits the loop
                    x = 2; 
                    break;
            }
        
        }
    System.out.println(Final());//calling the final method and printing it
}
//adding the method adjectives
    public static String Adjectives(){
        Random randomGenerator= new Random();//declaring randomgenerator to generate numbers
        int randomInt = randomGenerator.nextInt(10);//declaring randomInt as int generated
        String a = "";//empty string for later user
        switch(randomInt){//switch based on generated number to pick one of the words below
            case 0:
                a = "beautiful";
                break;
            case 1:
                a = "Amazing";
                break;
            case 2: 
                a = "stunning";
                break;
            case 3:
                a = "accomplished";
                break;
            case 4:
                a = "antique";
                break;
            case 5:
                a = "aggravating";
                break;
            case 6:
                a = " beloved";
                break;
            case 7:
                a = "cheerful";
                break;
            case 8:
                a = "bruised";
                break;
            case 9:
                a = "clueless";
                break;
        }
        return a;//return the word selected
    }//end of method
    //adding method Subject
    public static String Subject(){
        Random randomGenerator= new Random();//randomGenerator 
        int randomInt = randomGenerator.nextInt(10);//randomInt for number generated
        String b = "";//empty string
        switch(randomInt){//switch to word based on generated number
            case 0:
                b = "man";
                break;
            case 1:
                b = "princess";
                break;
            case 2:
                b = "lady";
                break;
            case 3:
                b = "soccer player";
                break;
            case 4:
                b = "mother";
                break;
            case 5:
                b = "father";
                break;
            case 6:
                b = "family";
                break;
            case 7:
                b = "ceremony";
                break;
            case 8:
                b = "child";
                break;
            case 9:
                b = "teacher";
                break;
        }
        return b;//return word selected
    }//end of class
    //adding method verb
    public static String Verb(){
        Random randomGenerator= new Random();//random number generator
        int randomInt = randomGenerator.nextInt(10);//randomInt: number generated
        String c = "";//empty string
        switch(randomInt){//switch choose word based on random number
            case 0:
                c = "was";
                break;
            case 1:
                c = "loved";
                break;
            case 2:
                c = "crossed";
                break;
            case 3: 
                c = "played";
                break;
            case 4:
                c = "followed";
                break;
            case 5: 
                c = "stayed";
                break;
            case 6:
                c = "applauded";
                break;
            case 7:
                c = "admired";
                break;
            case 8:
                c = "fell";
                break;
            case 9:
                c = "struggled";
                break;
        }
        return c;//return word
    }//end of method
    //adding method object
    public static String Obj(){
        Random randomGenerator= new Random();//random number generator
        int randomInt = randomGenerator.nextInt(10);//randomInt: number generated
        String d = "";//empty string
        switch(randomInt){//switch choose word based on number generated
            case 0: 
                d = "match";
                break;
            case 1:
                d = "song";
                break;
            case 2:
                d = "ocean";
                break;
            case 3:
                d = "play";
                break;
            case 4:
                d = "prince";
                break;
            case 5:
                d = "homework";
                break;
            case 6:
                d = "lecture";
                break;
            case 7:
                d = "martyr";
                break;
            case 8:
                d = "bike";
                break;
            case 9:
                d = "road";
        }
        return d;//return word chosen
    }//end of method
    //adding method thesis
    public static String Thesis(){
        String k = Adjectives();//calling adjective method
        String l = Subject();//calling subject method
        String g = Verb();//calling verb method
        String o = Obj();//calling object method
        System.out.print("The "+k+ " "+l+" "+g+" the "+o+". ");//print out the thesis line
        return l;//return the subject
    }//end of method
    //adding method body
    public static String body(){
        Random randomGenerator= new Random();//random number generator
        int randomInt = randomGenerator.nextInt(10);//randomInt number generated
        String k = Adjectives();//calling adjective method
        String g = Verb();//calling verb method
        String o = Obj();//calling object method.
        String sub;//creating empty string for switch statement
        switch(randomInt%2){//switch statement for randomization of subject and it
            case 0://if even use "it"
                sub = "it";
                break;
            default://it odd use the subject
                sub = "The "+Thesis();
                break;
        }
        //generating the action sentence
        String bod = sub+" "+g+" the "+k+" "+o+". ";
        return bod;//return the action sentence
    }//end of method
    //adding method conclusion
    public static String conclusion(){
         Random randomGenerator= new Random();//random number generator
        int randomInt = randomGenerator.nextInt(10);//randomInt number generated
        String k = Adjectives();//calling adjective method
        String g = Verb();//calling verb method
        String o = Obj();//calling object method
        String subj;//empty string for switch statement
        switch(randomInt%2){//switch statemtent for randomization of it and subject
            case 0:
                subj = "it";//if even use it
                break;
            default:
                subj = "The "+Thesis();//if odd use thesis
                break;
        }
        String con = subj+" "+g+" the "+o+". ";//generating the conclusion
        return con;//return the sentence
        
    }//end of method
    //adding method final
    public static String Final(){
        String con="";//empty string to represent the conclusion
        Random randomGenerator= new Random();//random number generator
        int randomInt = randomGenerator.nextInt(20);//number generated
        //for loop which create random sentences when i is less than number generated
        for(int i=0; i<randomInt; i++){
        String body = body();//calling body method
        System.out.print(body);//printing  string body
        }
        con = conclusion();//calling method
        return con;//return conclusion
    }//end of method
    
}//end of class