public class DigitSumChallenge {

    public static int sumDigits(int num){
        if(num < 10){
            return -1;
        }

        int sum = 0;

//        THE EXAMPLE CODE

        while (num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

//        MY FIRST SOLUTION

//        int newNum = num;
//        int count = 1;

//        while(newNum > 10){
//            if(newNum > 99){
//                newNum = newNum / 2;
//            } else {
//                newNum = newNum / 10;
//            }
//            count++;
//        }
//
//        for(int i=count; i>0; i--){
//            int place = (int) Math.pow(10,i-1);
//            int digit = num / place;
//            num = num - (digit * place);
//            sum += digit;
//        }

        return sum;
    }
}
