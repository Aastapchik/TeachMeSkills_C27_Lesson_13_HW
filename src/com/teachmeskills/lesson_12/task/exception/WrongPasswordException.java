package com.teachmeskills.lesson_12.task.exception;

/*
The method of this class throws an error if the password is invalid
 */
public class WrongPasswordException extends Exception {

    private int codeOfMistake;

    public WrongPasswordException(String message, int codeOfMistake) {
        super(message);
        this.codeOfMistake = codeOfMistake;
    }
}
