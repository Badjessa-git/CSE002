//Badjessa B. Bahoumda
//CSE2
//Lab11

public class Method2{
    //adding method copy
    public static int[] copy(int[] list){
        //declaring and allocating new list
        int [] list2 = new int[list.length];
        //copying array
        for (int i = 0; i<list.length; i++){
            list2[i] = list[i];
        }
        return list2;
    }
    //adding method inverter
    public static void inverter(int[] list){
        //swapping values
        for(int i=0; i<list.length/2; i++){
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }
    }
    //adding inverter2
    public static int[] inverter2(int[] list){
        int[] list3 = copy(list);//make a copy by calling copy method
        for(int i=0; i<list3.length/2; i++){
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }
        return list3;
    }
    //adding method print
    public static void print(int[] list){
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
    }
    //adding main method
    public static void main(String[] args){
        int[] array0 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array1 = copy(array0);
        int[] array2 = copy(array0);
        inverter(array0);
        print(array0);
        System.out.println("");
        print(inverter2(array1));
        System.out.println("");
        array3 = inverter2(array2);
        print(array3);
        System.out.println("");
    }
    
}