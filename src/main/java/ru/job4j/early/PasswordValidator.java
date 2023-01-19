package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {

        int digit = 0;
        int special = 0;
        int upCount = 0;
        int loCount = 0;

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() <= 8 || password.length() >= 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        String[] strings = new String[] {"qwerty", "12345", "password", "admin", "user"};
        for (String string : strings) {
            if (password.toLowerCase().contains(string)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345,"
                        + " password, admin, user");
            }
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digit++;
            }
            if (Character.isUpperCase(ch)) {
                upCount++;
            }
            if (Character.isLowerCase(ch)) {
                loCount++;
            }
            if (!Character.isLetterOrDigit(ch)) {
                special++;
            }
        }

            if (digit == 0) {
                throw new IllegalArgumentException("Password should contain at least one figure");
            }
            if (upCount == 0) {
                throw new IllegalArgumentException("Password should contain at least one uppercase letter");
            }
            if (loCount == 0) {
                throw new IllegalArgumentException("Password should contain at least one lowercase letter");
            }
            if (special == 0) {
                throw new IllegalArgumentException("Password should contain at least one special symbol");
            }
        return password;
    }
}