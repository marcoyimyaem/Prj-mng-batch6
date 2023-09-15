package lamda.example;

import java.util.ArrayList;
import java.util.List;

public class LambdaAnimal {
    private static void print(List<Animal> animals, CheckTrait checker){
        for (Animal animal: animals){
            if(checker.test(animal)){
                System.out.println(animal+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish",false,true,true,100));
        animals.add(new Animal("Kangaroo",true,true,false,4));
        animals.add(new Animal("Frog",true,true,true,301));
        animals.add(new Animal("Grasshoppers ",true,false,true,1001));
        animals.add(new Animal("Rabbit",true,false,false,34));
        animals.add(new Animal("Otter",false,true,false,43));
        animals.add(new Animal("Sloth",false,false,false,9));
        animals.add(new Animal("Porcupine",false,false,false,20));
//        print(animals,new CheckIfHopper());
        print(animals, a-> a.canSwim && a.canHop);
        print(animals, a-> a.startsWith("F"));
        System.out.println("animals that more than 100");
        print(animals, a-> a.getPopulation()>=100);
    }
}
