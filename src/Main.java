import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int status;
        System.out.println("Hello user !!");
        System.out.println("Could you tell us your grads ?");
        System.out.println("1- Yes");
        System.out.println("2- No");
        System.out.print(":");
        status = input.nextInt();
        while (status != 1 && status != 2) {
            System.out.println("Please enter valid input !!");
            System.out.println("Could you tell us your grads ?");
            System.out.println("1- Yes");
            System.out.println("2- No");
            System.out.print(":");
            status = input.nextInt();
        }
        while (status == 1) {
            int subject_1, subject_2, totalScore, avgScore;
            System.out.print("Subject 1 :");
            subject_1 = input.nextInt();
            while (subject_1 < 0 || subject_1 > 100) {
                System.out.print("Please enter valid degree (0~100)\n:");
                subject_1 = input.nextInt();
            }
            System.out.print("Subject 2 :");
            subject_2 = input.nextInt();
            while (subject_2 < 0 || subject_2 > 100) {
                System.out.print("Please enter valid degree (0~100)\n:");
                subject_2 = input.nextInt();
            }
            totalScore = subject_1 + subject_2;
            avgScore = totalScore / 2;
            System.out.println("Student Total Score = " + totalScore +" out of 200\nStudent Average Score = " + avgScore);
            System.out.println("Do you want to enter another set of grades?");
            System.out.println("1- Yes");
            System.out.println("2- No");
            System.out.print(": ");
            status = input.nextInt();
            if (status != 1 && status != 2) {
                System.out.println("YOU ARE ACTUALLY DUMB !");
            }
        }
        System.out.println("Goodbye! :D");
    }
}
