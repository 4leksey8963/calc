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
                while(!input.hasNextFloat())
                {
                    System.out.println("Требуется ввести число!");
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
                while(!input.hasNextFloat())
                {
                    input.next();
                    System.out.print("\nВведите второе число: ");
                }
                int b = input.nextInt();


                System.out.println("______________________");

                System.out.println("\n" + "HEX: " + a + " " + operation+ " " +  + b + " = " + Calculate.returnCalculate(a,b,operation).get(3));
                System.out.println("DEC: " + a + " " + operation+ " " +  + b + " = " + Calculate.returnCalculate(a,b,operation).get(2));
                System.out.println("OCT: " + a + " " + operation+ " " +  + b + " = " + Calculate.returnCalculate(a,b,operation).get(1));
                System.out.println("BIN: " + a + " " + operation+ " " +  + b + " = " + Calculate.returnCalculate(a,b,operation).get(0));

                System.out.println("Для продолжения введите 'a' и нажмите 'Enter'. Чтобы закончить - любая другая клавиша...");
                input = new Scanner(System.in);
                if(!((input.next()).toLowerCase()).equals("a")){
                    break;
                }
                System.out.println("///______________________///");
            }
        }
        catch (Exception e)
        {
            System.out.print("Ошибка: " + e);
        }

    }

}