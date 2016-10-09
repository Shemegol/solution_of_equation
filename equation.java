import java.util.Scanner;
public class equation {
    public static void main(String[] args) {
        System.out.println("Решение уравнения \"a*x+b=0\"");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        float a, b;
        while (true) {
            System.out.println("Введите \"a\" и нажмите Enter:");
            if (sc.hasNextFloat()) {
                a = sc.nextFloat();
                System.out.println("Ввол \"a\" закончен");
                break;
            } else {
                System.out.println("\"a\" должно быть числом!");
                sc.next();
            }
        }
        if (a == 0) {
            System.out.println("\"x\" равен любому значению");
        } else {
            while (true) {
                System.out.println("Введите \"b\" и нажмите Enter:");
                if (sc.hasNextFloat()) {
                    b = sc.nextFloat();
                    System.out.println("Ввод \"b\" закончен");
                    break;
                } else {
                    System.out.println("\"b\" должно быть числом!");
                    sc.next();
                }
            }
            float x = (-b) / a;
            System.out.println("\"x\" равен " + x);
        }
    }
}