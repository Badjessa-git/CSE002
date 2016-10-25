//Badjessa B. Bahoumda
//CSE2
//hw 08
//my program can calculate the value of the area of three different shapes

//importing Scanner class
import java.util.Scanner;
//adding the class
public class Area{
    //method for the area of the rectangle
    public static double Rect(double length, double width){
        //formula of area of rectange
        return length*width;
    }//end of method
    //method for the area of the triangle
    public static double Triangle(double height, double base){
        //formula of triangle area
        return (0.5)*(base*height);
    }//end of method
    //method for the area of a circle
    public static double circle(double radius){
        return (3.14)*(radius*radius);//return area of circle
    }//end of method
    //method that double checks input
    public static double Final(int z){
        //declaring variable myScan for input
        Scanner myScan = new Scanner(System.in);
        double area  = 1;//declaring area as a sentinel value
        //switch statement which for each case ask the value of variables
        switch(z){
            case 0://ask for dimmensions of triangle
                System.out.print("Enter the base in the form xx.xx: ");
                while(!myScan.hasNextDouble()){
                    System.out.print("Invalid Input, type a double: ");
                    myScan.next();
                }
                double x= myScan.nextDouble();
                System.out.print("Enter the height in the formm xx.xx: ");
                while(!myScan.hasNextDouble()){
                    System.out.print("Invalid in put, type a double: ");
                    myScan.next();
                }
                double y = myScan.nextDouble();
                //calling triangle method to compute area
                area = Triangle(x,y);
                break;
            case 1://ask for dimmensions of rectangles
                System.out.print("Enter the length in the form xx.xx: ");
                while(!myScan.hasNextDouble()){
                    System.out.print("Invalid input, type a double: ");
                    myScan.next();
                }
                x = myScan.nextDouble();
                System.out.print("Enter the width in the form xx.xx: ");
                while(!myScan.hasNextDouble()){
                    System.out.print("Invalid input, type a double: ");
                    myScan.next();
                }
                y = myScan.nextDouble();
                //calling rectangle method to compute area
                area = Rect(x, y);
                break;
            case 2://asking for the dimmensions of the circle
                System.out.print("Enter the radius in the form xx.xx: ");
                while(!myScan.hasNextDouble()){
                    System.out.print("Invalid input, type a double: ");
                    myScan.next();
                }
                x = myScan.nextDouble();
                //calling the circle method to compute area of the circle
                area = circle(x);
                }
        return area;//return the area of whatever the user chooses
    }//end of method
    //adding main method
    public static void main(String[] args){
        //declaring var myScan for input
        Scanner myScan = new Scanner(System.in);
        String shpe = "";//declaring shpe as sentinel value
            System.out.print("Which Area do you want to find? (rectangle, triangle, circle): ");
            while(!myScan.hasNext()){
                System.out.print("Error invalid input, type the shape in lowercase: ");
                myScan.next();
            }
            //assigning a value to shpe
            shpe = myScan.nextLine();
            shpe = shpe.toLowerCase();//changing inputed string to lowercase
            switch(shpe){//switch statement for inputed string
                case "triangle":
                    int x = 0;//assigning numbers to each case to be recognized in final method
                    double area = Final(x);//calling the final method to print area value
                    System.out.println("The area of the triangle given is "+area);
                    break;
                case "rectangle":
                    x = 1;
                    area = Final(x);//calling the final method to print area value
                    System.out.println("The area of the rectangle given is "+area);
                    break;
                case "circle":
                    x = 2;
                    area = Final(x);//calling the final method to print area value
                    System.out.println("The area of the circle given is "+area);
                    break;
            
        }
    }//end of method
}//end of class
