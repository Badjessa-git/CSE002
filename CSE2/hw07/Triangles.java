//Badjessa B. Bahoumda
//CSE 2
//my program asks input from user and creates triangle based on them
import java.util.Scanner;
public class Triangles{
    //add main method
    public static void main(String[] args){
        //defining variable for while loop
        int x = 0;
        int y =0; 
        Scanner myScan = new Scanner(System.in);
            while (x == 0){
                System.out.print("Input an Integer between 5 and 30: ");
                while(!myScan.hasNextInt()){
                    System.out.println("Error: This is not an integer");
                    myScan.next();
                }
                x = myScan.nextInt();
                if (x < 5 || x > 30){
                    System.out.println("Error: input an integer between 5 and 30");
                    x = 0;
                }
        }
        
                for (int i = 1; i<=x; i++){
                    System.out.print(+i); 
                    for (int k = x; k>=i; k--){
                        System.out.print(+k); 
                        System.out.println();
                    }
                    System.out.println();
                }
    }         
}
