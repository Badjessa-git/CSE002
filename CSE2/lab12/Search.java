//Badjessa B. Bahoumda
//CSE2
//lab 12
//my program will be able to perform linear and binary search
//on large arrays of random  numbers.

import java.util.Random;
import java.util.Scanner;

public class Search{
    //adding main method
    public static void main(String[] args){
    Random randomGenerator= new Random();
    Scanner myScan = new Scanner(System.in);
    int[] array1 = new int[5000];
    int[] array2 = new int[10];
    for(int i = 0; i<array1.length; i++){
        array1[i] = randomGenerator.nextInt(100001);
        }
    array2[0] = randomGenerator.nextInt(100001);
    while(true){
        int z = randomGenerator.nextInt(100001);
        if(z < array2[0]){
            array2[1] = z;
            break;
        }
    }
    for(int j = 2; j<array2.length; j++){
        while(true){ 
        int x = randomGenerator.nextInt(100001);
        if(x < array2[j-1]){
            array2[j] = x;
            break;
            }
        }
    }
    
    System.out.println("The maximum of array1 is: "+maximum(array1));    
    System.out.println("The minimum of array1 is: "+minimum(array1));
    System.out.println("The maximum of array2 is: "+maximum(array2));
    System.out.println("The minimum of array2 is: "+minimum(array2));
    System.out.print("Enter an int: ");
    while(!myScan.hasNextInt()){
        System.out.print("Enter an int: ");
        myScan.next();
    }
    int y = myScan.nextInt();
    if(y < 0){
        System.out.print("Error, Enter a positive int: ");
        y = myScan.nextInt();
    }
    
    }
    public static int minimum(int[] array){
        for(int i=0; i<array.length-1; i++){
            int x =0;
            while(true){
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
            else{
                break;
            }
        }
        
    }
    return array[0];
}
    public static int maximum(int[] array){
         for(int i=0; i<array.length-1; i++){
            int x =0;
            while(true){
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
            else{
                break;
                }
            }
        }
    return array[array.length-1];
    }
    public static int bsearch(int[] list, int y){
        int x = list[list.length/2];
        if(x==y){
            System.out.print(y+" was found in the list");
        }
        else{
            if (y < x){
                int z = list[x/2];
                if(y == z){
                    System.out.print(y+"was found in the list");
                }
                else{
                    for(int i =0; i<(x/2); i++);
                    if (y==list[i]){
                        System.out.print(y+" was found in the list");
                    }
                    for(i = x/2; i<x; i++){
                        if(y==list[i]){
                            System.out.print(y+" was found in teh list");
                        }
                    }
                }
            }
            else{
                z = list[(list.length-x)/2];
                if(y==z){
                    System.out.print(y+" was found in the list");
                }
                else{
                    for(i =0; i<(list.length-x)/2; i++){
                    if (y==list[z])
                    }
                }
            }
        }
    }
}