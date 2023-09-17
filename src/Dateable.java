import java.util.Scanner;

public class Dateable {
    

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("What is your age? ");

            int age = scanner.nextInt();

            int minimumDatingAge = (age / 2) + 7;

            System.out.println("The minimum dating age for a " + age + "-year-old is " + minimumDatingAge);

        }

    }
