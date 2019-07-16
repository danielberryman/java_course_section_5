import java.util.Scanner;

public class InputCalc {

    public static void inputThenPrintSumAndAverage(){
//        no inputs
//        yes we have everything we need
//        Steps
//          Create and instance of the scanner class
//          instantiate a intSum
//          instantiate a longSum
//          instantiate a long counter
//          create a while loop
//              while true read numbers from scanner
//                  check if number is an int or long
//                  add each to their own sum
//                  if long add 1 to counter
//              when invalid input print the sum and average of all numbers

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        double avg = 0;

        while(true){
            System.out.println("Enter a number:");
            boolean isAnInt = scan.hasNextInt();

            if(isAnInt){
                int num = scan.nextInt();
                sum += num;
                counter++;
                avg = sum/counter;
            } else {
                System.out.println("Invalid number");
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));

        scan.close();
    }
}
