package org.example.lesson3;

//Напишите тесты, покрывающие на 100% метод evenOddNumber,
//который проверяет, является ли переданное число четным или нечетным. (код приложен в презентации)

public class SomeDo {

    public boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }


//    Разработайте и протестируйте метод numberInInterval,
//    который проверяет, попадает ли переданное число в интервал (25;100). (код приложен в презентации)

    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }

}
