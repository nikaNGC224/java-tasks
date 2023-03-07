package ru.mail.polis.homework.simple;

/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class DoubleTask {

    /**
     * Вывести два корня квадратного уравнения через запятую: a * x ^ 2 + b * x + c = 0;
     * Вывод менять не нужно, надо только посчитать x1 и x2, где x1 > x2
     * Пример: (1, 5, 4) -> "-1.0, -4.0"
     */
    public static String equation(int a, int b, int c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double[] x = rootsOfEquation(a, b, discriminant);
        double x1 = a > 0 ? x[0] : x[1];
        double x2 = a > 0 ? x[1] : x[0];
        return x1 + ", " + x2;
    }

    /**
     * Нужно посчитать расстояние, между двумя точками (x1, y1) и (x2, y2)
     * Пример: (0, 0, 3, 4) -> 5.0
     */
    public static float length(double x1, double y1, double x2, double y2) {
        double height = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);
        return (float) Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }

    public static double[] rootsOfEquation(int a, int b, double discriminant) {
        double[] x = new double[2];
        x[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
        x[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
        return x;
    }
}
