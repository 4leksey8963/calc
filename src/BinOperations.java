public class BinOperations implements Calculate {

    @Override
    public String plus(String a, String b) {
        try {
            return  "" + (Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return "";
    }


    @Override
    public String minus(String a, String b) {
        try {
            return "" + (Integer.parseInt(a, 2) - Integer.parseInt(b, 2));
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
            return "" + (Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
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
            return "" + (Integer.parseInt(a, 2) / Integer.parseInt(b, 2));
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
            Integer.parseInt(a, 2);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
