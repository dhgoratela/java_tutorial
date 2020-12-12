package src;

public class apples {
    public static void main(String[] args){
        int[][] firstArray = {{8, 9, 10, 11}, {12, 13, 14, 15}};
        int[][] secondArray = {{30, 31, 32, 33}, {43}, {4, 5, 6}};
        System.out.println("This is the firts array:");
        display(firstArray);
        System.out.println("This is the second array:");
        display(secondArray);
    }

    public static void display(int[][] x){
        for(int row=0; row<x.length; row++){
            for (int col=0; col<x[row].length; col++){
                System.out.print(x[row][col] + "\t");
            }
            System.out.println();
        }
    }
}