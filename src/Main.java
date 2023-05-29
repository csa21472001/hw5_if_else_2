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
        //int age = (int) Math.floor(Math.random());
        int clientOS = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        //int clientDeviceYear = ThreadLocalRandom.current().nextInt(2007,  2023 + 1);
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2()
    {   System.out.println("Задача 2");
        int clientOS = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        int clientDeviceYear = ThreadLocalRandom.current().nextInt(2007, 2023 + 1);
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3()
    {   System.out.println("Задача 3");
        int year = ThreadLocalRandom.current().nextInt(4, 200 + 1);
        if (year%4==0){
            if ((year%100)==0) {
                System.out.println(year + " год не является високосным");
            } else if ((year%400)==0) {
                System.out.println(year + " год является високосным");
            } else { System.out.println(year + " год является високосным");}
            } else {   System.out.println(year + " год не является високосным");
        }
    }
    public static void task4()
    {   System.out.println("Задача 4");
        int deliveryDistance = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        if (deliveryDistance<=20){
            System.out.println("Доставка потребует 1 день ");
        } else if (deliveryDistance>20&&deliveryDistance<=60) {
            System.out.println("Доставка потребует 2-ое суток");
        }  else if (deliveryDistance>60&&deliveryDistance<=100) {
            System.out.println("Доставка потребует 3-ое суток");
        }   else {
            System.out.println("Свыше 100 км доставки нет.");}
    }
    public static void task5()
    {   System.out.println("Задача 5");
        int monthNumber = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        switch(monthNumber) {
            case 1:
                System.out.println("Месяц Январь. Зима.");
                break;
            case 2:
                System.out.println("Месяц Февраль. Зима.");
                break;
            case 3:
                System.out.println("Месяц Март. Весна.");
                break;
            case 4:
                System.out.println("Месяц Апрель. Весна.");
                break;
            case 5:
                System.out.println("Месяц Май. Весна.");
                break;
            case 6:
                System.out.println("Месяц Июнь. Лето.");
                break;
            case 7:
                System.out.println("Месяц Июль. Лето.");
                break;
            case 8:
                System.out.println("Месяц Август. Лето.");
                break;
            case 9:
                System.out.println("Месяц Сентябрь. Осень.");
                break;
            case 10:
                System.out.println("Месяц Октябрь. Осень.");
                break;
            case 11:
                System.out.println("Месяц Ноябрь. Осень.");
                break;
            case 12:
                System.out.println("Месяц Декабрь. Зима.");
                break;
            default:
                System.out.println("Ошибка. Нет такого месяца.");
                break;
        }
    }

}

