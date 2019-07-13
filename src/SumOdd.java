public class SumOdd {

    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }

        if(number % 2 != 0){
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        if(start < 1 || end < 1 || end < start){
            return -1;
        }

        int sum = 0;
        for(int i=start; i<=end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
