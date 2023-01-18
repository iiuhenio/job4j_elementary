package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() <= 8 || password.length() >= 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        String str = "qwerty";
        String str1 = "12345";
        String str2 = "password";
        String str3 = "admin";
        String str4 = "user";
        if (password.toLowerCase().contains(str) || password.toLowerCase().contains(str1)
        || password.toLowerCase().contains(str2) || password.toLowerCase().contains(str3)
        || password.toLowerCase().contains(str4)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345,"
                    + " password, admin, user");
        }

        for (int i = 0; i < password.length(); i++) {
            int code = password.codePointAt(i);
            if (!isLowerLatinLetter(code)) {
                return password;
            }
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        return password;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isNumber(int code) {
        return code >= 48 && code <= 57;
    }

    public static boolean isSpecialSymbol(int code) {
        return !isUpperLatinLetter(code) && !isLowerLatinLetter(code) && !isNumber(code);
    }
}