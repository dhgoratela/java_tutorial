package src;
import java.util.Scanner;

public class apples{
    public static void main(String[] args){

         Scanner input = new Scanner(System.in);
         System.out.println("Enter your age: ");
         int age = input.nextInt();

         if (age>=60)
             System.out.println("You ae a Senior citizen");
         else if (age>=50)
             System.out.println("You are in your 50's");
         else if (age>=40)
             System.out.println("You are in your 40's");
         else
             System.out.println("You are a young buck");
    }
}