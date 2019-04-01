import java.util.ArrayList;
import java.util.Scanner;

public class MeanMedia {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int addNums;
        System.out.println("Please input 5 numbers: ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int j = 0; j < 5; ++j) {
            addNums = keyboard.nextInt();
            nums.add(addNums);
            int total = j;
            int mean = total / 5;


        }
    }
}
