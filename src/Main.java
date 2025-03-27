import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello User !");
        System.out.println("We need some information could you help us ?! :D");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = input.nextLine();
        System.out.println("Please enter your age :");
        int age = input.nextInt();
        System.out.println("Please enter your height :");
        int height = input.nextInt();
        System.out.println("------------------------------------------------------");
        System.out.println("Name   : "+ name);
        System.out.println("Age    : " + age);
        System.out.println("Height : " + height + "cm");
        System.out.println("------------------------------------------------------");

    }
}
