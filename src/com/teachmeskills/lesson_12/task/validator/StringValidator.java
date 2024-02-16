package com.teachmeskills.lesson_12.task.validator;

import com.teachmeskills.lesson_12.task.checker.Checker;
import com.teachmeskills.lesson_12.task.exception.WrongLoginException;
import com.teachmeskills.lesson_12.task.exception.WrongPasswordException;

/*
In the method of this class, exceptions are generated when data is invalid
 */
public class StringValidator {

    public static boolean validator(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!Checker.checkLog(login)) throw new WrongLoginException("Логин не может быть больше 20 символов.", 25);

        if (!Checker.checkPass(password, confirmPassword))
            throw new WrongPasswordException("Введен некорректный пароль.", 42);

        return true;
    }
}
