//Badjessa B. Bahoumda
//CSE2
//November 4, 2016
//My program will be able to print the name of student and their midterm grades in a class\
//importing scanner class
import java.util.Scanner;

//importing the math random class
import java.util.Random;

public class Arrays{
    //add main method
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        Random randomGenerator= new Random();//declaring randomgenerator to generate numbers
        int studentlen = randomGenerator.nextInt((10 - 5) + 1) + 5;//generate random number between 5 and 10
        String[] students = new String[studentlen];//declaring an arrays student
        //asking user for input
        System.out.println("Enter "+studentlen+ " student names: ");
        int x = 0;
        while(x==0){
        //check for input error
        if(!myScan.hasNext()){
                System.out.print("Error, Invalid input enter");
        }
        else{
            //assigning name to array
            for (int i = 0; i<studentlen; i++){
            students[i] = myScan.nextLine();
                }
           x = 1;//exiting the loop 
           }
        }
        System.out.println("Here are the midterm grades of the "+studentlen+" students above: ");
        int[] midterm = new int[studentlen];//declaring and allocating an array midterm
        //assigning midterm grades for students 
        for (int j=0; j<midterm.length; j++){
        midterm[j] =  randomGenerator.nextInt(101);//declaring randomInt as int generated
        //printing out final grades
        System.out.println(students[j]+" : "+midterm[j]);
        }
    }
}
