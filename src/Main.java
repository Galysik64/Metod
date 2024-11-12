public class Main {
    public static void main(String[] args) {
        checkIsLeapYear(2020);
        checkIsLeapYear(2019);
        checkIsLeapYear(2024);
        installApplication(0, 2020);
        deliveryDistance(98, 1);
    }
    public static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    public static void installApplication(int iosVersion, int madeIN) {
        if (iosVersion == 0 && madeIN <= 2023) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (iosVersion == 0 && madeIN > 2024) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.");
        } else if (iosVersion != 0 && madeIN > 2024) {
            System.out.println("Установите обычную версию приложения для Android по ссылке.");
        } else if (iosVersion != 0 && madeIN <= 2023) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите приложение.");
        }
    }
    public static void deliveryDistance(int distance, int delivery) {
        if (distance < 20) {
            delivery = 1;
        } else if (distance > 20 && distance <= 60) {
            delivery = 2;
        } else if (distance > 60 && distance <= 100) {
            delivery = 3;
        } else {
            delivery = 0;
        }
        if (delivery != 0) {
            System.out.println("Количество дней доставки: " + delivery);
        } else {
            System.out.println("Доставки нет");
        }
    }
}

















