import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        int minimumPages = 100 - age;

        System.out.println("The minimum number of pages to read before giving up is " + minimumPages);

    }

}

