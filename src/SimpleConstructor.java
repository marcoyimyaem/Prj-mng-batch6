import java.util.Random;

public class SimpleConstructor {

    public SimpleConstructor(){
        System.out.println("SimpleConstructor constructed");
    }
    public void SimpleConstructor(){
        System.out.println("void SimpleConstructor constructed");
    }

    public static void main(String[] args) {
        SimpleConstructor sc1 = new SimpleConstructor();
        sc1.SimpleConstructor();
        SimpleConstructor sc2 = new SimpleConstructor();
        Dice dice1 = new Dice();
        Dice dice2 = new Dice(6);
        System.out.println("first dice number is : "+dice1.Dicenumber);
        System.out.println("second dice number is : "+dice2.Dicenumber);
        System.out.println("Hello world");
        dice1.throwDice();
        dice2.throwDice();
        System.out.println("first dice number after throw is : "+dice1.Dicenumber);
        System.out.println("second dice number after throw is : "+dice2.Dicenumber);
    }
}
 class Dice{
    int Dicenumber;
    public Dice(){
        Dicenumber = 1;
    }
    public Dice(int a){
        Dicenumber = a;
    }
    public void throwDice(){
        Random r = new Random();
        Dicenumber = r.nextInt(5)+1;
    }

 }