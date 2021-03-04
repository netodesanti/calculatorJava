import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        processMenuOption();
    }

    private static void processMenuOption() {
        int selectedOption = menu();

        switch (selectedOption) {
            case 1:
                add();
                break;
            case 2:
                multiply();
                break;
            case 3:
                System.out.println("Program closed.");
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a valid number\n");
                processMenuOption();
                break;
        }
    }

    private static int menu() {
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Add");
        System.out.println("2 - Multiply");
        System.out.println("3 - Quit");

        int selectedOption = scan.nextInt();
        System.out.print("\n");
        return selectedOption;

    }

    private static void add() {
        System.out.println("How many numbers do you want to add?");
        int numCount = scan.nextInt(), sum = 0;

        for (int i = 0; i < numCount; i++) {
            System.out.println("Type the value for number " + (i+1));
            int num = scan.nextInt();

            sum += num;
        }

        System.out.println("The result is: " + sum);

        showMenuAgain();
    }

    private static void multiply() {
        System.out.println("How many numbers do you want to multiply?");
        int numCount = scan.nextInt(), sum = 0;

        for (int i = 0; i < numCount; i++) {
            System.out.println("Type the value for number " + (i+1));
            int num = scan.nextInt();

            if (i == 0) {
                sum = num;
            } else {
                sum *= num;
            }
        }

        System.out.println("The result is: " + sum);

        showMenuAgain();
    }

    private static void showMenuAgain() {
        // TODO Auto-generated method stub
        System.out.println("\n----------------------------------");
        System.out.println("Show menu again? Y/n");
        String decision = scan.next();
        if (decision.equals("y") || decision.equals("Y")) {
            System.out.println("\n");
            processMenuOption();
        } else {
            System.out.println("Program closed.");
            System.exit(0);
        }
    }
}
