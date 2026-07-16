import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2021;
        checkYear(year);

        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviсeYear = 2020;
        checkDevice(clientOS, clientDeviсeYear);

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);}

    }

    public static void checkYear(int year) {
        if ((year > 1584 && year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS ==1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int calculateDeliveryDays (int deliveryDistance) {
        if (deliveryDistance > 100 || deliveryDistance < 0) return -1;

        int deliveryDays = 1;
        if (deliveryDistance < 20) {
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
        }
        return  deliveryDays;

    }
}