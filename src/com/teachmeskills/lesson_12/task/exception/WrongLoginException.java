package com.teachmeskills.lesson_12.task.exception;

/*
The method of this class throws an error if the login is invalid
 */
public class WrongLoginException extends Exception {

    private int codeOfMistake;

    public WrongLoginException(String message, int codeOfMistake) {
        super(message);
        this.codeOfMistake = codeOfMistake;
    }
}
