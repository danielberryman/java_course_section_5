import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void ReadingInputChallenge() {
//        CODE ALONG
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter < 10){
            counter += 1;
            System.out.println("Enter number #" + counter + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

            } else {
                System.out.println("Invalid number");
            }

//            scanner.nextLine(); // handle end of line enter key
        }

        scanner.close();

//        MY ORIGINAL EFFORT
//        Scanner scanner = new Scanner(System.in);
//
//        int count = 1;
//        boolean valid = scanner.hasNextInt();
//
//        do {
//            System.out.println("Enter a number #" + count + ": ");
//            int number = scanner.nextInt();
//            scanner.nextLine();
//
//            if(valid) {
//                System.out.println("You entered: " + number);
//                count++;
//            } else {
//                System.out.println("Invalid Entry...");
//            }
//        } while (count < 11);
//
//        scanner.close();
    }
}
