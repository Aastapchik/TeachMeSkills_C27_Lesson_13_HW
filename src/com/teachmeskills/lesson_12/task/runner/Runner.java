package com.teachmeskills.lesson_12.task.runner;

import com.teachmeskills.lesson_12.task.service.CheckInputData;


import java.util.Scanner;

/*
In the class there is an entrance to the program and an imitation of this program
 */
public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введи пароль: ");
        String password = scanner.nextLine();
        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();
        scanner.close();
        CheckInputData.checkInput(login, password, confirmPassword);


    }

}

