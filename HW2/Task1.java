package HW2;
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        setNumber();

    }

    public static void setNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String numb = scanner.nextLine();
        try {
            float number = Float.parseFloat(numb);
            System.out.println("Вы ввели: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не дробное число!");
            setNumber();
        }
        scanner.close();

    }
}