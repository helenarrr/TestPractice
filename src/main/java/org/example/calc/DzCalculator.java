package org.example.calc;

public class DzCalculator {
//В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
//Если метод calculateDiscount получает недопустимые аргументы,
//он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

    public static String calculateDiscount(double sumPurchase, double disc) {
        double rateDisc, sumDisc;
        if ((disc > 100) || (disc < 0)) {
            throw new ArithmeticException("Недопустимый аргумент");
        }
        rateDisc = disc / 100;
        sumDisc = sumPurchase * rateDisc;
        return "Сумма покупки со скидкой: " + (sumPurchase - sumDisc);
    }

    public static void main(String[] args) {
        System.out.println(calculateDiscount(5,-1));
    }
}
