public class StaticExample {
    static int j = 10;
    static int x;
    static  int y=20;
    static {
         x =60;
         y =70;
    }
    static int num;
    public static void first(){System.out.println("method static");}
    public static void second(){System.out.println("method static");}
    public void third(){
        System.out.println("method not static");
    }
    public static void forth(int num2){
        num = num2;
    }
    public static void main(String[] args) {
        StaticExample se = new StaticExample();
        System.out.println(y+ x);
        StaticExample se2 = new StaticExample();
        System.out.println(se2.y+se2.x);
        StaticExample se3 = new StaticExample();
        System.out.println(se.j);
        se3.j++;
        System.out.println(se3.j);
        System.out.println(se.j);
        System.out.println(se2.j);
        se.third();
        se = null;
        se2 = null;
        se3 = null;
        se.j=100;
        System.out.println(se.j);
        System.out.println(se2.j);
        System.out.println(se3.j);
        first();
        second();
        forth(4);
        System.out.println(num);
        System.out.println(se.num);


    }
}
