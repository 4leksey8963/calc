public class HexOperations implements Calculate{
    @Override
    public String plus(String a, String b) {
        try {
            return  "" + (Integer.parseInt(a, 16) + Integer.parseInt(b, 16));
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
            return  "" + (Integer.parseInt(a, 16) - Integer.parseInt(b, 16));
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
            return  "" + (Integer.parseInt(a, 16) * Integer.parseInt(b, 16));
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
            return  "" + (Integer.parseInt(a, 16) / Integer.parseInt(b, 16));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return "";
    }

    public Boolean checkIs(String a)
    {
        try{
            if (a.charAt(0) == '0'){
                System.out.println("Число не может начинаться с нуля в шестнадцатиричной системе счисления!");
                return false;
            }
            Integer.parseInt(a, 16);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
