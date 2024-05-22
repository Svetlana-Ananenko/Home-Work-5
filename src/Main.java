public class Main {
    public static void main(String[] args) {
        System.out.println("___Задача №1___");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("___Задача №2___");
        int clientOS2 = 1;
        int clientDeviceYear = 2015;

        switch (clientOS2) {
            case 0:
                if (clientDeviceYear <= 2015 ) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break; }
                else  {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break; }
            case 1:
                if (clientDeviceYear <= 2015 ) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break; }
                else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break; }
        }

        System.out.println("___Задача №3___");
        int year = 1584;
        int leapYear = year % 4;

        int year2 = year;
        int leapYear2 = year2 % 400;

        int year3 = year;
        int leapYearNot = year % 100;


        boolean leapYearOn = (leapYear == 0) && (leapYearNot != 0);
        if (leapYearOn || leapYear2 == 0)  {
            System.out.printf("%s год является високосным %n", year );
        } else if (leapYearNot == 0) {
            System.out.printf("%s год НЕ является високосным %n", year );
        }
        else {
            System.out.printf("%s год НЕ является високосным %n", year );
        }

        System.out.println("___Задача №4___");
        int deliveryDistance = 100;
        int term = 1;


        boolean EstimatedDeliveryTime = (deliveryDistance >= 0) && (deliveryDistance < 20);
        if (EstimatedDeliveryTime) {
            System.out.printf("Для доставки потребуется: %s день %n", term );
        } else if  (deliveryDistance >= 20 && (deliveryDistance < 60)) {
            System.out.printf("Для доставки потребуется: %s дня %n", term += 1 );
        } else if  (deliveryDistance >= 60 && (deliveryDistance < 100)) {
            System.out.printf("Для доставки потребуется: %s дня %n", term += 2 );
        } else  {
            System.out.println("Доставка не осущетсвляется");
        }

        System.out.println("___Задача №5___");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В году 12 месяцев, прошу перезадать значение месяца");
                break;
        }








    }

}