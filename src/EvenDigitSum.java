public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if(number<0){return -1;}

        int last = 0;
        int sum = 0;

        while(number>0){
            last = number % 10;
            if(last % 2 == 0) {
                sum += last;
            }
            number /= 10;
        }

        return sum;
    }
}
