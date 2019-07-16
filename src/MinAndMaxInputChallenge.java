import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void printMinAndMax(){
        Scanner scan = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while(true){
            System.out.println("Enter a number:");
            boolean isAnInt = scan.hasNextInt();

            if(isAnInt){
                int number = scan.nextInt();

                if(min == 0 && max == 0){
                    min = number;
                    max = number;
                } else if(number > max){
                    max = number;
                } else if(number < min){
                    min = number;
                }
                scan.nextLine();
            } else {
                System.out.println("Invalid number");
                break;
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);

        scan.close();
    }
}
