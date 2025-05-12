package GuruQAJava;

public class HW1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        double y = 1.5;
        int maxInt = Integer.MAX_VALUE;

        System.out.println("Операции с int:");
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Диление: " + (a / b));

        System.out.println("Операции с int и double:");
        System.out.println("Сумма: " + (a + y));
        System.out.println("Разность: " + (a - y));
        System.out.println("Умножение: " + (a * y));
        System.out.println("Диление: " + (a / y));

        System.out.println("Логические операции:");
        System.out.println(a + ">" + b + ": " + (a>b));
        System.out.println(a + "<" + b + ": " + (a<b));
        System.out.println(a + ">=" + b + ": " + (a>=b));
        System.out.println(a + "<=" + b + ": " + (a<=b));

        System.out.println("Переполнение:");
        System.out.println("Максимальный int: " + maxInt);
        System.out.println("Переполнение: " + (maxInt + 1));
    }
}
