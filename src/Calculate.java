import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculate {
    static public ArrayList<String> returnCalculate(int a, int b, String operation)
    {
        ArrayList<String> resultArray = new ArrayList<String>();
        int result = switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> 0;
        };
        resultArray.add(Integer.toBinaryString(result));
        resultArray.add(Integer.toOctalString(result));
        resultArray.add(Integer.toString(result));
        resultArray.add(Integer.toHexString(result));
        return resultArray;
    }
}
