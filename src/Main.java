import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input;
    public static void main(String[] args) {

        System.out.println("\n_______________Калькулятор_______________");
        try
        {
            Calculate calc;
            String out="";
            Integer[] sys = {2, 8, 10, 16};
            ArrayList<Integer> sysList = new ArrayList<Integer>(Arrays.asList(sys));
            while(true)
            {
                // ВЫБОР СИСТЕМЫ ИСЧИСЛЕНИЯ
                System.out.println("\nЧтобы выбрать систему счисления, введите соответсвующее число: ");
                System.out.println("2 - bin,    8 - oct,    10 - dec,    16 - hex\n");
                input = new Scanner(System.in);
                int abc;
                while(true)
                {
                    if(!input.hasNextInt())
                    {
                        System.out.println("\nВведено некорректное значение!");
                        input.next();
                        System.out.print("2 - bin,    8 - oct,    10 - dec,    16 - hex\n");
                    }
                    else
                    {
                        abc = input.nextInt();
                        if(!sysList.contains(abc))
                        {
                            System.out.println("\nТребуется ввести 2, 8, 10 или 16!");
                            System.out.print("2 - bin,    8 - oct,    10 - dec,    16 - hex\n");
                        }
                        else
                            break;
                    }
                }
                if(abc==2)
                    calc = new BinOperations();
                else if(abc == 8)
                    calc = new OctOperations();
                else if(abc == 10)
                    calc = new DecOperations();
                else
                    calc = new HexOperations();

                // ВВОД ПЕРВОГО ЧИСЛА
                System.out.print("\nВведите первое число: ");
                input = new Scanner(System.in);
                while(!input.hasNextInt())
                {
                    System.out.println("Требуется ввести целое число!");
                    input.next();
                    System.out.print("\nВведите первое число: ");
                }
                System.out.println("______________________");
                int a = input.nextInt();

                // ВВОД СИМВОЛА ОПЕРАЦИИ
                System.out.print("\nВведите символ операции (+, -, *, /): ");
                input = new Scanner(System.in);
                String operation = input.next();
                while(!("+-*/".contains(operation) && operation.length() == 1))
                {
                    System.out.println("Требуется ввести один из прердложенных символов (+, -, *, /)!");
                    System.out.print("\nВведите символ операции (+, -, *, /): ");
                    operation = input.next();
                }
                System.out.println("______________________");

                // ВВОД ВТОРОГО ЧИСЛА
                System.out.print("\nВведите второе число: ");
                input = new Scanner(System.in);
                while(!input.hasNextInt())
                {
                    System.out.println("Требуется ввести целое число!");
                    input.next();
                    System.out.print("\nВведите второе число: ");
                }
                int b = input.nextInt();


                System.out.println("______________________");

                if(operation.equals("/") && b == 0)
                    System.out.println("\nДеление на ноль невозможно!");
                else {
                    out = switch (operation) {
                        case "+" -> calc.plus("" + a, "" + b);
                        case "-" -> calc.minus("" + a, "" + b);
                        case "*" -> calc.multiply("" + a, "" + b);
                        case "/" -> calc.division("" + a, "" + b);
                        default -> out;
                    };
                    System.out.println("Ответ: "+out);
                }

                System.out.println("\nДля продолжения введите 'w' и нажмите ENTER. Чтобы закончить - любая другая клавиша...");
                if (!(input.next()).equalsIgnoreCase("w"))
                    break;

                System.out.println("///______________________///");
            }
        }
        catch (Exception e)
        {
            System.out.print("Ошибка: " + e);
        }
    }

}