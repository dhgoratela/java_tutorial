package src;

import java.util.Scanner;

public class apples{
    public static void main(String[] args){
        Scanner bucky = new Scanner(System.in);
        int age;

        System.out.print("Enter age: ");
        age = bucky.nextInt();

        switch(age){
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You are in toruble");
                break;
            default:
                System.out.println("I don't know how old you are");
            break;
        }
    }
}