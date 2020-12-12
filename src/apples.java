package src;

public class apples {
    public static void main(String[] args){
        System.out.println(average(43, 56, 76, 8, 65, 76, 2, 31));
    }

    // Three dots in the method argument is an "ellipse notation" to indicate variable length arguments
    public static int average(int...numbers){
        int total = 0;
        for(int x: numbers){
            total += x;
        }
        return total/numbers.length;
    }
}