//Badjessa ]B. Bahoumda
//September 9 2016
//CSE2, lab02
//My program is able to compute the minutes counts and distance from a bycicle based on the time
//and rotation count
// define the class Cyclometer
public class Cyclometer {
    //main method of the program
    public static void main(String[] args){
        //data given
        int secsTrip1=480; //time of the first trip
        int secsTrip2=3220; //time of the second trip
        int countsTrip1=1561; //counts of the first trip
        int countsTrip2=9037; //counts of the second trip
        double wheelDiameter=27.0, //Diameter of the wheel
        PI=3.14159, //value of the number Pi
            feetPerMile= 5280, //conversion of 1 Mile to feet
            inchesPerFoot= 12, //conversion of 1 Foot into inches
            secondsPerMinute=60;//Conversion of 1 minute to seconds
            
        double distanceTrip1;
        double distanceTrip2;
        double totalDistance; //declaring variable distanceTrip1 for 
        //the first trip, distanceTrip2 for the second trip and totalDistance for the total distance
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "
        + countsTrip1+"counts."); 
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "
        + countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter in incher times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distnace in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2; //total distance
        
        //printing out the data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}