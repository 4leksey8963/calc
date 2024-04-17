import java.security.spec.ECField;

public class DecOperations implements Calculate{
    @Override
    public String plus(String a, String b) {
        try {
            return ""+Integer.parseInt(a) + Integer.parseInt(b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String minus(String a, String b) {
        try {
            return ""+ (Integer.parseInt(a) - Integer.parseInt(b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String multiply(String a, String b) {
        try {
            return ""+ (Integer.parseInt(a) * Integer.parseInt(b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String division(String a, String b) {
        try {
            return ""+Integer.parseInt(a) / Integer.parseInt(b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return "";
    }
}
