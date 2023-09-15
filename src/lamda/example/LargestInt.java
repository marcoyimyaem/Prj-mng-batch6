package lamda.example;

import java.util.*;


public class LargestInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        List<Integer> numbers = Arrays.asList(num1, num2, num3);
        int maxNumber = numbers.stream().max(Integer::compare).orElse(0);
        long distinctNumbers = numbers.stream().distinct().count();
        System.out.println(distinctNumbers);
        if(distinctNumbers == 1)
            System.out.println("all numbers are equal");
        else
            System.out.println("the largest number is "+ maxNumber);
    }

}
