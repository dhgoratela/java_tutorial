package src;
import java.util.Scanner;

public class apples{
    public static void main(String[] args){
        int total = 0;
        int grade;
        int average;
        int counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 10 numbers:");
        while (counter < 10){
            grade = input.nextInt();
            total += grade;
            counter++;
        }
        average = total/10;
        System.out.println("Your average is: "+average);
    }
}