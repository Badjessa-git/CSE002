//Badjessa B. Bahoumda
//hw02
//September 10, 2012
//My program is going to be able to calculate the different costs made at a store including the tax sales and the total cost.

//Defining Class Arithmetic
public class Arithmetic{
    
    //Adding main method
    public static void main(String[] args){
        //Number of pairs of pants
        int numPants = 3;
        //Cost per pair of pants
        double pantsPrice = 34.98;
        
        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;
        
        //Number of belts
        int numBelts = 1;
        //cost per box of envelopes
        double beltCost = 33.99;
        
        //the tax rate
        double paSalesTax = 0.06;
        
        double totalCostOfPants;//total cost of pants
        double totalCostOfBelts;//total cost of belts
        double totalCostOfSweatshirts;//total cost of sweatshirt
        
        //Calculating the total cost of the pants
        totalCostOfPants = numPants * pantsPrice;
        //Calculating the total cost of belts
        totalCostOfBelts = numBelts * beltCost;
        //Calculating the total cost of sweatshirt
        totalCostOfSweatshirts = numShirts * shirtPrice;
        
        //Print total Cost of all the items
        System.out.println("The pants' total cost is "+totalCostOfPants+" dollars");
        System.out.println("The belts' total cost is "+totalCostOfBelts+" dollars");
        System.out.println("The Sweatshirts' total cost is "+totalCostOfSweatshirts+" dollars");
        
        double taxPants; // the tax charge on the pants
        double taxBelts; // the tax charge on the belts
        double taxSweatshirts; // the tax charge on the sweatshirts
        
        // Calculating tax charge by multiplying total cost by tax rate
        taxPants = totalCostOfPants * paSalesTax; 
        taxBelts = totalCostOfBelts * paSalesTax; 
        taxSweatshirts = totalCostOfSweatshirts * paSalesTax;
        
        //Printing values of tax charges on the items
        System.out.println("The sale tax charged on the pants is "+taxPants+" dollars");
        System.out.println("The sale tax charged on the Belt is "+taxBelts+" dollars");
        System.out.println("The sale tax charged on the sweatshirts is "+taxSweatshirts+" dollars");
        
        double totalCostwotax; // the total cost without any tax
        totalCostwotax = totalCostOfPants + totalCostOfBelts + totalCostOfSweatshirts; //add all the total purchases together
        
        double totalSalestax; // the total of the sales tax 
        totalSalestax = taxPants + taxBelts + taxSweatshirts; //add all the sales taxes
        
        double totalPaid; // the total amount paid for the entire transaction
        totalPaid = totalCostwotax + totalSalestax; //add the total tax charges and total cost
        
        //Printing the total values
        System.out.println("The total cost without sales tax is "+totalCostwotax+" dollars");
        System.out.println("The total sales tax on this purchase is "+totalSalestax+" dollars");
        System.out.println("The total amount paid for this transaction is "+totalPaid+" dollars");
    }
}