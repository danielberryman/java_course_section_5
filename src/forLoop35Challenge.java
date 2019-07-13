public class forLoop35Challenge {

    public static void threeFive(){
        int sum = 0;
        int count = 0;
        for(int i=1; i<=1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " is divisible by both 3 & 5.");
                sum += i;
                count++;
                if(count == 5){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
        System.out.println("The sum total of all numbers between 1 and 1000 that are" +
                " divisible by both 3 & 5 equals " + sum + ".");
    }
}
