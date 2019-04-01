import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int highScore = 0;
        int lowScore = 100;
        double average;
        int userChoice;
        int total = 0;
        int userExit = 0;
        int count = 0;


        do {
            System.out.print("Enter a score for your tests ");
            userChoice = input.nextInt();

            if(userChoice >= highScore)
            {
                total = userChoice;
                highScore = userChoice;
                count = count + 1;
            }
            else if(userChoice <= lowScore)
            {
                total = userChoice;
                lowScore = userChoice;
                count = count + 1;
            }


            System.out.println("Enter the number 999 to exit, or enter another number to continue >> ");
            userExit = input.nextInt();
        }while(userExit != 999);


        average = total / count;

        System.out.println("There was " + count + " tests, the lowest score was " + lowScore + " and the highest score was " + highScore +
        " with the average being " + average);
    }
}

