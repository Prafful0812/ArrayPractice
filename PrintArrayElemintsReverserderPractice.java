package BasicProgramming;

public class PrintArrayElemintsReverserderPractice {
    public static void main(String[] args) {
        int[] arr = {20, 55, 89, 66, 77, 25, 56, 89, 99};
        //99 89          20
        //initialization = arr.length - 1
        //condition  =
        //increment or decrement =

        //for(int i = 0; i < arr.length; i++)

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        //init   i = 0
        //condition i < arr.length
        //incre/dec  i++
        //for(){
        //
        // }
        //20, 55, 89, 66, 77, 25, 56, 89, 99
        //0    1   2  3   4   5    6  7   8
        for (int i = 6; i > arr.length; i--) {
            //i = 0  20
            //i = 1  55
            //i = 2  89
            //i = 3  66
            //i = 4  77
            //i = 5  25
            //i = 6  56
            //i = 7  89
            //i = 8  99
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);  //20 66 56
            }
        }
    }
}
