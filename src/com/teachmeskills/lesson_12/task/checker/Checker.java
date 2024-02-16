package com.teachmeskills.lesson_12.task.checker;

/*
Static methods of this class check the entered data under specified conditions
 */
public class Checker {

    public static boolean checkPass(String password, String confirmPassword) {

        if (password.length() > 20) return false;

        char[] chars = password.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == 32) return false;
            if (Character.isDigit(aChar)) count++;
        }
        if (count == 0) return false;
        return password.equals(confirmPassword);

    }

    public static boolean checkLog(String login) {

        if (login.length() > 20) return false;
        char[] chars = login.toCharArray();
        for (int i = 0; i < login.length(); i++) {
            if (chars[i] == 32) return false;
        }
        return true;
    }
}
