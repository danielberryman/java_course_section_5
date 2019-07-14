public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int last = number % 10;

        while(number >= 10){
            number /= 10;
        }

        int first = number;
        return first + last;
    }
}
