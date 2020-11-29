package src;

public class apples{
    public static void main(String[] args){
        int tuna;
        tuna = 5;
        System.out.println("tuna: "+tuna);

        System.out.println("===========================");
        System.out.println("pre-increment (increment the variable before it gets used)");
        System.out.println(++tuna);
        System.out.println(tuna);
        System.out.println("post-increment (increment the variable after it gets used)");
        tuna = 5; // reset tuna to 5
        System.out.println(tuna++);
        System.out.println(tuna);

        System.out.println("===========================");
        System.out.println("post-decrement (decrement the variable before it gets used)");
        tuna = 5; // reset tuna to 5
        System.out.println(--tuna);
        System.out.println(tuna);
        System.out.println("post-decrement (decrement the variable after it gets used)");
        tuna = 5; // reset tuna to 5
        System.out.println(tuna--);
        System.out.println(tuna);

        System.out.println("===========================");
        System.out.println("Addition-assignment (adding 3 to the variable tuna)");
        tuna = 5; // reset tuna to 5
        tuna += 3;

        System.out.println(tuna);
        System.out.println("Subtraction-assignment (subtracting 3 from the variable tuna)");
        tuna = 5; // reset tuna to 5
        tuna -= 3;
        System.out.println(tuna);

        System.out.println("Multiplication-assignment (multiplying 3 to the variable tuna)");
        tuna = 5; // reset tuna to 5
        tuna *= 3;
        System.out.println(tuna);

        System.out.println("Division-assignment (dividing the variable tuna by 3)");
        tuna = 5; // reset tuna to 5
        tuna /= 3;
        System.out.println(tuna);

        System.out.println("Modulus-assignment (getting modulus of the variable tuna by 3)");
        tuna = 5; // reset tuna to 5
        tuna %= 3;
        System.out.println(tuna);
    }
}
