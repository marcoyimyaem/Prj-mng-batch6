import java.util.Random;

public class ConstructorsExample {
    private String color,model;

    public ConstructorsExample(){
        color = "White";
        System.out.println("ConstructorsExample constructed");
    }
//    ConstructorsExample("Black")
    public ConstructorsExample(String color){
        this.color = color;
    }
    public ConstructorsExample(String color,String model){
        this.color = color;
        this.model = model;
    }

    public static void main(String[] args) {
        ConstructorsExample ce = new ConstructorsExample();
        ConstructorsExample ce2 = new ConstructorsExample("Pink");
        System.out.println("Hello");
        ConstructorsExample ce3 = new ConstructorsExample("Black");
        System.out.println(ce.color);
        System.out.println(ce2.color);
        System.out.println(ce3.color);
        ConstructorsExample ce4 = new ConstructorsExample("Black","BMW");
        Student std1 = new Student();
        std1.fName = "Marc";
        std1.mName = "S";
        std1.lName = "Yim";
        std1.course = "BSMC";
        std1.address = "1434 Sampaloc St., St. Nino, Tarlac";
        std1.age = 16;
        std1.courseYear = 1;
        std1.section = 5;
        Student std2 = new Student("Bob","J","De la Cruz","BSIT","Quezon city",17,2,3);
        Student std3 = std1;
        System.out.println(std1.toString());
        System.out.println(std2.toString());
        System.out.println(std3.toString());
        Tree apple = new Tree();
        Tree atis = new Tree(50,7);
        atis.branch=1000;
        System.out.println(apple.toString());
        System.out.println(atis.toString());
        apple.cutBranch(3);
        atis.cutBranch(12);
        System.out.println(apple.toString());
        System.out.println(atis.toString());

    }

}

class Student{
    String fName,mName,lName,course,address;
    int age,courseYear,section;

    public Student(){

    }

    @Override
    public String toString() {
        return "I am " +fName + ' ' +mName + ". "
                + lName + '\n' + age+" years old, lives at "+
                address+". I'm taking " + course + " Year:"
                + courseYear+" section: "+section;
    }

    public Student(String fName, String mName, String lName, String course, String address, int age, int courseYear, int section) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.course = course;
        this.address = address;
        this.age = age;
        this.courseYear = courseYear;
        this.section = section;

    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "fName='" + fName + '\'' +
//                ", mName='" + mName + '\'' +
//                ", lName='" + lName + '\'' +
//                ", course='" + course + '\'' +
//                ", address='" + address + '\'' +
//                ", age=" + age +
//                ", courseYear=" + courseYear +
//                ", section=" + section +
//                '}';
//    }
}
class Tree{
    int branch;
    final int age;
    public Tree(){
        branch=5;
        age=4;
    }
    public Tree(int branch,int age){
        Random r = new Random();
        this.branch = r.nextInt(branch);
        this.age = age;
    }


    @Override
    public String toString() {
        return "this tree has "+branch+" number of branches";
    }
    public void cutBranch(int branch){
        if(this.branch>branch)
            this.branch-=branch;
        else
            System.out.println("can't cut branches");
    }
}
