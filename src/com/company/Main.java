package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2008;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
}



////Task 3
class task3 {
    public static void main(String[] args) {
        int year = 2016;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println( year + " год является високосным ");
        } else
            System.out.println(year + " год не является високосным.");
    }
}



/////// Task 4
class task4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <=100) {
                System.out.println("Потребуется дней: 3");
            }
        }
    }





////// Task 5
class task5 {
    public static void main(String [] args) {
        int mouthNumber = 13;
        if (mouthNumber == 12 || mouthNumber == 1 || mouthNumber == 2) {
            System.out.println("Зима");
        } else if (mouthNumber == 3 || mouthNumber == 4 || mouthNumber == 5) {
            System.out.println("Весна");
        } else if (mouthNumber == 6 || mouthNumber == 7 || mouthNumber == 8) {
            System.out.println("Лето");
        } else if (mouthNumber == 9 || mouthNumber == 10 || mouthNumber == 11) {
            System.out.println("Зима");
        } else {
            System.out.println("Такого месяца нет");


        }
    }
}









