package equation;

import java.util.Scanner;

public class equation {
    private static Scanner sc = new Scanner(System.in).useDelimiter("[\r\n]+");

    public static void main(String[] args) {
        System.out.println("Решение уравнения \"a*x+b=0\"");
        float a = inputNum("a");
        float b = inputNum("b");
        if (a == 0 && b == 0) {
            System.out.println("\n\"x\" равен любому значению");
        } else if (a == 0) {
            System.out.println("\nРешений нет");
        } else if (b == 0) {
            System.out.println("\n\"x\" равен 0");
        } else {
            float x = -b / a;
            System.out.println("\n\"x\" равен " + x);
        }
        sc.close();
    }

    private static float inputNum(String n) { //Ввод числа с консоли. Как параметр указываеся имя константы.
        float k;
        while (true) {
            System.out.println("Введите \"" + n + "\" и нажмите Enter:");
            if (sc.hasNextFloat()) {
                k = sc.nextFloat();
                System.out.println("Ввод \"" + n + "\" закончен");
                break;
            } else {
                System.out.println("\"" + n + "\" должно быть числом!");
                sc.next();
            }
        }
        return k;
    }
}