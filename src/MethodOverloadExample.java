public class MethodOverloadExample {
    public static int basicMatchOps(int a,int b){
        return a+b;
    }
//    if different parameter
    public static int basicMatchOps(int a,int b,int c){
        return a*b*c;
    }
//    if diff datatype
public static double basicMatchOps(double a,double b,double c){
    return a*b*c;
}
//return type but diff parameters
public static int basicMatchOps(double a,double b,double c,int d){
        return (int) (a*b*c*d);
    }
    public static String basicMatchOps(String name){
        return name;
    }
    public static void main(String[] args) {
        System.out.println(basicMatchOps(3,1));
        System.out.println(basicMatchOps(3,1,2));
        System.out.println(basicMatchOps(3.3,1.1,2.4));
        System.out.println(basicMatchOps(3.3,1.1,2.4,4));
        System.out.println("Hello "+basicMatchOps("Marco"));

    }
}
