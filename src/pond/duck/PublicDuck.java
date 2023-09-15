package pond.duck;

public class PublicDuck {
    public String noise = "quack";
    public void quack(){
        System.out.println(noise);
    }
    public void makeNoise(){
        quack();
    }
}
