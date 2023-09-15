public class StringBuilderExample {
    public static void main(String[] args) {
        String st = "1";
        String st2 = st.concat("2");
        st2.concat("3");
        System.out.println(st2);


        StringBuilder sb = new StringBuilder("Start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        System.out.println(sb);
        System.out.println(same);
        sb.append("2023");
        System.out.println(sb);
        System.out.println(same);
        StringBuilder sb3 = new StringBuilder();
    }
}
