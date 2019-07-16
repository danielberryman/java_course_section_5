import java.util.Scanner;

public class ReadingUserInput {

    public static void playScanner() {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter<11){
            System.out.println("Enter number #" + counter + ":");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                System.out.println("You entered the number " + number);
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of the numbers you entered is " + sum + ".");

        scanner.close();
    }
}
