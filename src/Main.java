import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {11, 22, 33, 44, 55};
        int x = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = x;
        //System.out.println(Arrays.toString(myArray)); // [55, 22, 33, 44, 11]
        System.out.println(myArray[0] + myArray[2]);
    }
}
