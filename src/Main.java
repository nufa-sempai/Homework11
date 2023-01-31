import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2020;
        printInfoAboutYear(year);
        printInfoAboutVersion(0, 2023);
        int deliveryDistance = 18;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставка не возможна на расстоянии " + deliveryDistance + " км");
        } else {
            System.out.println("Время доставки " + days + " дн.");
        }
    }

    private static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 2;
        } else {
            return -1;
        }
    }

    private static String getInfoAboutVersion(int os, int productionYear) {
        int currentYear = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder("Установите ");
        if (productionYear < currentYear) {
            result.append("облегченная версия для ");
        } else {
            result.append("версия для ");
        }
        if (os == 0) {
            result.append("iOS");
        } else {
            result.append("Android");
        }
        return result.toString();
    }

    private static void printInfoAboutYear(int year) {
        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
    }

    private static void printInfoAboutVersion(int os, int productionYear) {
        System.out.println(getInfoAboutVersion(os, productionYear));
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 !=0 || year % 400 == 0;
    }

    }