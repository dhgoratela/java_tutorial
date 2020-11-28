package src;

public class apples {
    public static void main(String[] args){
        int girls, boys, people;

        System.out.println("=========================");
        girls = 6;
        boys = 3;
        System.out.println("girls = "+girls+" | boys = "+boys);
        people = girls + boys;
        System.out.println("Add: "+people);
        people = girls - boys;
        System.out.println("Subtract: "+people);
        people = girls * boys;
        System.out.println("Multiply: "+people);

        // Changing the value of girls for understanding un-even division
        System.out.println("=========================");
        girls = 11;
        System.out.println("girls = "+girls+" | boys = "+boys);
        people = girls / boys;
        System.out.println("Integer division: "+people);
        // Note that you don't get decimal part in the above output.
        // This is because you have set the type for variable "people" as "int"
        people = girls % boys;
        System.out.println("Modulus: "+people);
    }
}
