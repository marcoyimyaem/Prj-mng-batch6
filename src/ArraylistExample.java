import pond.duck.MotherDuck;
import pond.duck.PublicDuck;

import java.util.*;

public class ArraylistExample extends MotherDuck {
    public static void main(String[] args) {
        ArraylistExample duck = new ArraylistExample();
        PublicDuck p = new PublicDuck();
        System.out.println(p.noise);
        p.quack();
        p.makeNoise();

        System.out.println(duck.noise);
        List<Integer> scores =new ArrayList<>();
        scores.add(100);
        scores.add(25);
        scores.add(73);
        scores.add(84);
        scores.add(75);
        System.out.println(scores.toString());
    }
}
