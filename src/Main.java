import java.util.Random;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Date petsa = new Date();
        java.sql.Date pesta2;
        Random r = new Random();
        System.out.println("the random generated number is: "+r.nextInt(10));
        String name = "marco"; //variable
        greetName(name); //use greetName method
        greetName("Grace");
    }
    // method sample
    public static void greetName(String name){
        System.out.println("Hello "+name);
    }
}