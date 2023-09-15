public class InstanceIniBlock {
    private String name = "Fluffy";
    {System.out.println("Iam Instance Ini2");}
    // will print Iam Instance Ini
    public InstanceIniBlock(){
        name = "Tiny";
        {System.out.println("Iam constructor2");}
        System.out.println("Iam constructor");

    }
    public static void main(String[] args) {
        InstanceIniBlock ini = new InstanceIniBlock();
        {System.out.println("Iam inside the main"); }
        System.out.println("Iam main");
        {System.out.println("Iam inside the main2"); }
        System.out.println("Chick name is : "+ini.name);
        System.out.println("byte max value is: "+Short.MAX_VALUE);
        System.out.println("byte min value is: "+Byte.MIN_VALUE);

    }
    {System.out.println("Iam Instance Ini");}

}
