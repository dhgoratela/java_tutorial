package src;

import java.util.Scanner;

public class apples {
    public static void main(String[] args){
        Scanner bucky = new Scanner(System.in);
        double f_num, s_num, answer;
        System.out.print("Enter the first num: ");
        f_num = bucky.nextDouble();
        System.out.print("Enter the Second num: ");
        s_num = bucky.nextDouble();
        answer = f_num + s_num;
        System.out.print(answer);
    }
}
