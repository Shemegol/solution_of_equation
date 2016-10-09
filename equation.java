import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class equation {
    public static void main(String[] args) throws IOException {
        boolean checkA = true;
        boolean checkB = true;
        System.out.println("Решение уравнения \"a*x+b=0\"");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (checkA) {
            try {
                System.out.println("Введите \"a\":");
                float a = Float.parseFloat(reader.readLine());
                if (a != 0) {
                    while (checkB) {
                        try {
                            System.out.println("Введите \"b\":");
                            float b = Float.parseFloat(reader.readLine());
                            float x = (-b) / a;
                            System.out.println("\"x\" равен " + x);
                            checkB = false;
                            checkA = false;
                        } catch (NumberFormatException e) {
                            System.out.println("\"b\" должно быть числом!");
                        }
                    }
                } else {
                    System.out.println("\"x\" равен любому значению");
                    checkA = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("\"a\" должно быть числом!");
            }
        }
    }
}
