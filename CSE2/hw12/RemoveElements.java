//Badjessa B. Bahoumda
//Hw12
//CSE2
import java.util.Scanner;
import java.util.Random;

public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(newArray1,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  public static int[] randomInput(){//random input
      int[] list = new int[10];//creating and allocating list 
      Random randomGenerator = new Random();//creating number generator
      for(int i=0; i<list.length; i++){//filling the array with random numbers
          list[i] = randomGenerator.nextInt(11);
      }
      return list;//return the array
  }
  public static int[] delete(int[] list, int pos){//delete method
      if(pos> list.length-1 || pos<0){//if int is less than array length or less than 0, it is invalid
        System.out.println("The index is not valid.");
        return list;//return original list
      }
      else{
        int[] list2 = new int[list.length-1];//creating new list with one less value in array
        for(int i=0; i<list2.length; i++){
          if(i != pos){//if i is not equal to position copy value of original array into second array
            list2[i] = list[i];
          }
        }
        System.out.println("The index "+pos+" is removed.");//index is removed
        return list2;//return new array
      }
}
  public static int[] remove(int[] list, int target){//remove method
      boolean a = false;//using boolean for linear search
      for(int i=0; i<list.length; i++){
        if(target==list[i]){//if target is found, set boolean true and exit search
          a = true;
          break;
        }
      }
      if(a == true){//if boolean is true  
      System.out.println("Element "+target+" has been found.");
      int[] list2 = new int [list.length-1];//new array
      for(int i=0; i<list2.length; i++){
          if(list[i] != target){//if the value at position i is different from target copy array value
              list2[i] = list[i];
          }
      }
      return list2;//return second value
      }
       else{
        System.out.println("Element "+target+" was not found");//if boolean false then target was not found
        return list;
      }
  }
}