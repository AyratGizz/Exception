package HW3;

import java.util.Scanner;

public class UserInterface {
    public static void dataEntry() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные пользователя в следующем формате:");
        System.out.println("Фамилия Имя Отчество ДатаРождения НомерТелефона Пол");
        System.out.println("Пол вводить символом латиницей f или m");
        System.out.println("Дата рождения - строка формата dd.mm.yyyy");
        System.out.println("Номер телефона - в формате 79999999999");
        System.out.println("Или введите команду exit для выхода");
        boolean run = true;
        while (run) {
            String[] arr = in.nextLine().split(" ");
            if (arr[0].equalsIgnoreCase("exit")) {
                break;
                
            }
            MessageHandler.arrayEnteredData(arr);
        }
    }
}