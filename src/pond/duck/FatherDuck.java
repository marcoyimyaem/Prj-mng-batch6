package pond.duck;
/**
*private: Only accessible within the same class
*default (package private) access: private and other classes in the same package
*protected: default access and child classes
*public: protected and classes in the other packages
*/

public class FatherDuck {
    private String noise = "quack";
    private void quack(){
        System.out.println(noise);
    }
    private void makeNoise(){
        quack();
    }
    public static void main(String[] args) {
        FatherDuck fd2 = new FatherDuck();
//        System.out.println(fd2.noise);

    }
}

class BadDuckling{
    public void makeNoise(){
        FatherDuck duck =new FatherDuck();
//        duck.quack();
//        System.out.println(duck.noise);
    }
}
