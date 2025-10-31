import java.util.Scanner;

public class BasicBot {
    public static void main(String[] args) {
        String botName = "Java Bot";
        int birthYear = 2025;
        String userName;
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! I am " + botName);
        System.out.println("I was created in " + birthYear);
        System.out.print("What's your good name?: ");
        userName = input.nextLine();
        System.out.println("Cool name " + userName + ", glad to have you on chat with me!");

        // ---- Guess Age Section ----
        String userChoice = "";
        while (true) {
            System.out.print("Would you like me to guess your age? (yes/no): ");
            userChoice = input.nextLine().trim().toLowerCase();

            if (userChoice.startsWith("y")) {
                System.out.println("Enter remainders of dividing your age by 3, 5, and 7:");
                System.out.print("> ");
                int ageRem3 = input.nextInt();
                System.out.print("> ");
                int ageRem5 = input.nextInt();
                System.out.print("> ");
                int ageRem7 = input.nextInt();

                int age = (ageRem3 * 70 + ageRem5 * 21 + ageRem7 * 15) % 105;
                System.out.println("Your age is " + age + " years old!");
                input.nextLine(); // clear buffer
                break;

            } else if (userChoice.startsWith("n")) {
                System.out.println("hm hm no problem!");
                break;

            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }

        // ---- Counting Section ----
        while (true) {
            System.out.print("I can also count numbers up to what you want. Should I? (yes/no): ");
            userChoice = input.nextLine().trim().toLowerCase();

            if (userChoice.startsWith("y")) {
                System.out.print("Enter a number: ");
                int number = input.nextInt();
                for (int i = 0; i <= number; i++) {
                    System.out.println(i);
                }
                System.out.println("Completed, have a nice day!");
                break;

            } else if (userChoice.startsWith("n")) {
                System.out.println("hm hm no problem!");
                break;

            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }

        input.close();
    }
}
