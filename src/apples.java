package src;

public class apples {
    public static void main(String[] args) {
        tuna tunaObject = new tuna();
        System.out.println(tunaObject.toMilitary());

        tunaObject.setTime(12,0,0);
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toRegularTime());
    }
}