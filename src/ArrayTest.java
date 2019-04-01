
import java.util.Scanner;

public class ArrayTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userChoice;
        int userExit = 0;
        int highScore = 0;
        int lowScore = 100;
        int total = 0;
        int count = 0;



        do {
            System.out.print("Enter a score for your tests ");
            userChoice = input.nextInt();

            if(userChoice >= highScore)
            {
                highScore = userChoice;
            }
            else if(userChoice <= lowScore)
            {
                lowScore = userChoice;
            }
            total = total + userChoice;
            count = count + 1;
            System.out.println("Enter the number 999 to exit, or enter another number to continue >> ");
            userExit = input.nextInt();
        }while(userExit != 999);


        int average = highScore / lowScore;
        display(highScore, lowScore, average, total, count);
    }

    private static void display(int highScore, int lowScore, int average, int total, int count) {

        average = highScore / lowScore;
        System.out.println("The total of test scores are " + total);
        System.out.println("The high score is " + highScore + " , the lowest score is " + lowScore + " , and the average is " + average);

    }


}

