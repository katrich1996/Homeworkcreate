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


















