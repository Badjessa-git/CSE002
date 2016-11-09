import java.util.Timer;
import java.util.Scanner;
import java.lang.*;

public class Mood_Guru{
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int alength = 2;
        String[] Smovies = new String[alength];
        int i = 0;
        while(i < alength){
            for(int j = 0; j < alength; j++){
                System.out.print("Enter one of your favorite show: ");
                Smovies[j] = myScan.nextLine();
                j++;
            }
            i++;
        }
         int z = 0;
        int b = 0;
        String x = "";
        String y = "";
        
        x = "there is a cat accross the street";
        System.out.println("Type the following: "+x);
        y = myScan.nextLine();
           z = y.length();
           b = x.length();
           if(y.equals(x)){
               System.out.print("Your mood is excellents...");
               System.exit(0);
            }
            if(!y.equals(x)){
                if(z>b){
                    System.out.println("Are you feeling down? "+Smovies[0]+ " are movies that are sure to brighten your day :)");
                }
                else if(z==b){
                    System.out.println("You made a few mistakes, are you feeling stressed. Relaxing songs on Spotify are sure to improve that ");
                    System.exit(0);
                }
                else{
                    System.out.println("Feeling frustrated?"+Smovies[1]+"and"+Smovies[2]+"are guarranteed to lift you up ");
                }
            } 
           
        }
            
    }
    
