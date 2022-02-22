package skypro;

public class Main<clientOS, clientDeviceYear, year> {

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int clientsOS = 0;
        if (clientsOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 400 == 0) || (( year % 4 == 0 ) && ( year % 100 != 0 ))) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным.");
        }
        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней доставки: 1 день.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней доставки: 2 дня.");
        }else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней доставки: 3 дня.");
        }
        // Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }

    }






}
