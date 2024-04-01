public class Calculate {
    static public float returnCalculate(float a, float b, String operation)
    {
        float result = 0;
        switch (operation){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
        }
        return result;
    }
}
