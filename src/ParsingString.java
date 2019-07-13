public class ParsingString {

    public static void parseStr(String str){
        System.out.println("This is a string: " + str);
        double number = Double.parseDouble(str);
        System.out.println("This is an int: " + str);

        str += 1;
        number += 1;

        System.out.println(str);
        System.out.println(number);
    }
}
