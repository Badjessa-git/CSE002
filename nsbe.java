import java.util.Timer;
import java.util.Scanner;
import java.lang.*;

public class nsbe{
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int alength = 3;
        String[] Smovies = new String[alength];
        int i = 0;
        while(i < alength){
            for(i = 0; i < alength; i++){
            System.out.print("Enter of your favorite comedy show: ");
            Smovies[i] = myScan.next();
            i++;
            }
        }
        
        int z = 0;
        int b = 0;
        String x = "";
        String y = "";
        
        x = "there is  a cat accross the street";
        System.out.println("Type the following: "+x);
        y = myScan.next();
           z = y.length();
           b = x.length();
           if(y.equals(x)){
               System.exit(0);
            }
            while(!y.equals(x)){
                if(z>b){
                    System.out.print("Are you feeling down, "+Smovies+ " are movies that are sure to brighten your day.");
                }
                else if(z==b){
                    System.exit(0);
                }
            } 
            System.out.print("Are you tired, it has been proven that breaks improve your memory and make work more efficient");
        }
            
    }
}