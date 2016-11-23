public class test{
    public static void main(String[] args){
        int[] b =  new int[5];
        int[] a = new int[5];
        for(int i =0; i<b.length; i++){
            b[i] = i;
        }
        a = copy(b);
        printArray(b);
        printArray(a);
        
    }
    public static int[] copy(int[] b){
        int[] c = new int[b.length];
        for(int i=0; i<b.length; i++){
            b[i] = c[i];
        }
        return c;
    }
    public static void printArray(int[] list){
    for (int i = 0; i<list.length; i++){
    System.out.print(list[i]+" ");//printing all the values in the arrays
        }
        System.out.println("");
    }//end of method
}