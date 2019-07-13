public class SwitchChallenge1 {

    public static void switchChar(char switchValue){
        switch(switchValue){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D': case 'E':
                System.out.println("Value is D or E");
                break;
            default:
                System.out.println("Value is something other than A, B, C, D or E");
                break;
        }
    }
}
