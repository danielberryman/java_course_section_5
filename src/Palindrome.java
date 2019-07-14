public class Palindrome {

    public static boolean isPalindrome(int num) {

//        *** THE BETTER WAY ***
//        negative numbers are simply processed as such; you don't need to change them
//        the while condition of !=0 accounts for negatives

        int reverse = 0;
        int remaining = num;
        int lastDigit;

        do {
            lastDigit = remaining % 10;
            reverse *= 10;
            reverse += lastDigit;
            remaining = remaining / 10;
        }
        while (remaining != 0);

        return (num == reverse);

//        *** MY ORIGINAL SOLUTION ***
//        String reverseStr = "";
//
//        if(num < 0){
//            num = num - (num * 2);
//        }
//        int numCopy = num;
//
//        while(numCopy > 0) {
//            reverseStr += numCopy % 10;
//            numCopy /= 10;
//        }
//
//        int reverseNum = Integer.parseInt(reverseStr);
//
//        if(num == reverseNum) {
//            return true;
//        }
//        return false;
    }
}
