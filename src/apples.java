package src;

public class apples{
    public static void main(String[] args){
        // We'll discuss two ways to create arrays

        // Way 1: Using indexes
        int[] bucky = new int[10];
        bucky[0] = 87;
        bucky[1] = 543;
        bucky[9] = 65;
        System.out.println(bucky[1]);

        // Way2: Using array initializer
        int[] tuna = {2, 4, 5, 7, 9};
        System.out.println(tuna[2]);

    }
}