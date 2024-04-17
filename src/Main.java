import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Main {
    static Scanner input;
    public static void main(String[] args) {

        System.out.println("\n_______________Калькулятор_______________");
        try
        {
            while(true)
            {
                // ВЫБОР СИСТЕМЫ ИСЧИСЛЕНИЯ

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