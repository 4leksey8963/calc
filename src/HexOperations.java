public class HexOperations implements Calculate{
    DecOperations dec;
    @Override
    public String plus(String a, String b) {
        try {
            return Integer.toHexString(Integer.parseInt(dec.plus(a, b)));
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
            return Integer.toHexString(Integer.parseInt(dec.minus(a, b)));
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
            return Integer.toHexString(Integer.parseInt(dec.multiply(a, b)));
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
            return Integer.toHexString(Integer.parseInt(dec.division(a, b)));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return "";
    }
}
