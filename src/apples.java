package src;

public class apples{
    public static void main(String[] args){
        // Dating Website
        int girl, boy;

        System.out.println("======= Logical 1 =======");
        boy = 18;
        girl = 68;
        if(boy>10){
            System.out.println("You can enter");
        }else{
            System.out.println("You are too young");
        }

        System.out.println("======= Logical 2 =======");
        boy = 18;
        girl = 68;
        if(boy>10 && girl<60){
            System.out.println("You can enter");
        }else{
            System.out.println("You cannot enter");
        }

        System.out.println("======= Logical 3 =======");
        boy = 18;
        girl = 40;
        if(boy>10 && girl<60){
            System.out.println("You can enter");
        }else{
            System.out.println("You cannot enter");
        }

        System.out.println("======= Logical 4 =======");
        boy = 18;
        girl = 99;
        if(boy>10 || girl<60){
            System.out.println("You can enter");
        }else{
            System.out.println("You cannot enter");
        }

        System.out.println("======= Logical 5 =======");
        boy = 8;
        girl = 99;
        if(boy>10 || girl<60){
            System.out.println("You can enter");
        }else{
            System.out.println("You cannot enter");
        }
    }
}