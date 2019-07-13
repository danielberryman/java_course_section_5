public class SwitchString {

    public static void switchStr(String switchValue){
        switch(switchValue.toLowerCase()) {
            case "january":
                System.out.println("Value was jan");
                break;
            case "june":
                System.out.println("Value was jun");
                break;
            case "july": case "august": case "september":
                System.out.println("Value was jul, aug or sept");
                break;
            default:
                System.out.println("was not found");
                break;
        }
    }
}
