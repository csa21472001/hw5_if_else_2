import java.util.concurrent.ThreadLocalRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = ThreadLocalRandom.current().nextInt(0, 3 + 1);
        int clientYear = ThreadLocalRandom.current().nextInt(0, 2023 + 1);
        int iOS = 0;
        int android = 1;
        int checkYear = 2015;
        if (iOS == clientOS && checkYear <= clientYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (android == clientOS && checkYear <= clientYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (iOS == clientOS && checkYear > clientYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (android == clientOS && checkYear > clientYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Сейчас мы предложим версию под андроид");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = ThreadLocalRandom.current().nextInt(4, 2023 + 1);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год  является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = ThreadLocalRandom.current().nextInt(1, 120 + 1);
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка потребует " + deliveryDays + " день/дня ");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка потребует " + (deliveryDays + 1) + " день/дня ");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка потребует " + (deliveryDays + 2) + " день/дня ");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println(" Зима." + monthNumber);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна." + monthNumber);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето." + monthNumber);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень." + monthNumber);
                break;
            case 12:
                System.out.println(" Зима." + monthNumber);
                break;
            default:
                System.out.println("Ошибка. Нет такого месяца.");
                break;
        }
    }

}

