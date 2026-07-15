//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2021;
        checkYear(year);

        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviseYear = 2020;
        checkDevice(clientOS, clientDeviseYear);

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        deliveryDays(deliveryDistance);

    }

    public static void checkYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }

    public static void checkDevice(int clientOS, int clientDeviceYear) {
        int currentYear = 2026;
        if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear != currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS ==1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear != currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int deliveryDays (int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 1;
            System.out.println("потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
        return  deliveryDays;
    }
}