package src;
import java.util.Random;

public class apples{
    public static void main(String[] args){
        int[] freq = new int[7]; // initialize result array (Which will bear frequencies of all face values)
        Random rand = new Random();

        // Roll the dice 1000 times
        // Generate random number between 0 to 5. And push the generated number by 1 to bring it in range of 1 to 6
        // This modified random number will be our index which will denote the face value of dice
        // Increment the value contained in that index by 1. This increment will record the frequency of that face value
        for(int roll=0; roll<1000; roll++){
            ++freq[1+rand.nextInt(6)];
        }

        // Display frequencies for each face value
        System.out.println("Face\tFrequency");
        for(int face=1; face<freq.length; face++){
            System.out.println(face+"\t"+freq[face]);
        }

    }
}