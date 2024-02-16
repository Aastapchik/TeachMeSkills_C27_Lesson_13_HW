package com.teachmeskills.lesson_12.task.service;

import com.teachmeskills.lesson_12.task.exception.WrongLoginException;
import com.teachmeskills.lesson_12.task.exception.WrongPasswordException;
import com.teachmeskills.lesson_12.task.validator.StringValidator;

/*
The method of this class catches possible errors that occur during program execution
 */
public class CheckInputData {

    public static void checkInput(String login, String password, String confirmPassword) {

        try {
            StringValidator.validator(login, password, confirmPassword);
        } catch (WrongLoginException e1) {
            System.out.println("Введен некорректный логин.");
        } catch (WrongPasswordException e2) {
            System.out.println("Введен некорректный пароль");

        } catch (Exception e3) {
            System.out.println("Системная ошибка. Попробуйте позже.");
        }
    }
}
