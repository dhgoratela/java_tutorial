package src;

public class apples{
    public static void main(String[] args){
        int[] bucky = {32, 12, 18, 54, 2};

        System.out.println("Index\tValue");

        for(int counter=0; counter<bucky.length; counter++){
            System.out.println(counter+"\t"+bucky[counter]);
        }
    }
}