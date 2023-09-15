package pond.duck;
//*default (package private) access: private and other classes in the same package
public class MotherDuck {
    protected String noise = "quack";
    protected void quack(){
        System.out.println(noise);
    }
    protected void makeNoise(){
        quack();
    }
}
