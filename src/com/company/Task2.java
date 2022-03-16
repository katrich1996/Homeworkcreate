package com.company;

public class Task2 {

    public static void main(String[] args) {
    int clientOS = 1;
    int clientDeviceYear = 2015;
    if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для IOS по ссылке");
    }
    else if (clientDeviceYear <= 2014 && clientOS == 1) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
}

}

