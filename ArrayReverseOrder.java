package BasicProgramming;

public class ArrayReverseOrder {
    public static void main(String[] args) {

        int[] Abc = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Array in orignal order");

        for(int i = 0; i<Abc.length; i++){

            System.out.print(Abc[i] + " ");
        }
        System.out.println();

        System.out.println("Array in reverse order");

        for(int i = Abc.length-1; i>=0; i--){

            System.out.print(Abc[i] + " ");
        }
    }
}

