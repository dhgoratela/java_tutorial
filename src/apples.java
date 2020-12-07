package src;
import java.util.Random;

public class apples{
    public static void main(String[] args){
        Random dice = new Random();
        int number;

        for (int counter=0; counter<=10; counter++){
            number = 1 + dice.nextInt(6);
            // The argument (6) signifies the boundary.
            // Here, it means consider (first six) random numbers starting from (zero).
            // We add (one) because random numbers are generated from 0 to 5. So we push the generated number by 1.
            System.out.println(number);
        }
    }
}