package ru.job4j.array;

public class JavaNameValidator {

    /**
     * Необходимо разработать метод isNameValid(String name) для проверки валидности имен в языке Java.
     *
     * Переменная может содержать символы латинского алфавита и числа, символ подчеркивания и символ доллара.
     * Переменная должна начинаться на строчную латинскую букву.
     */
    public static boolean isNameValid(String name) {
        boolean valid = name.length() != 0;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (!JavaNameValidator.isLowerLatinLetter(name.codePointAt(0))) {
                valid = false;
                break;
            }
            if (JavaNameValidator.isSpecialSymbol(code) || JavaNameValidator.isUpperLatinLetter(code)
                    || JavaNameValidator.isLowerLatinLetter(code)) {
                valid = true;
            }
        }
        return valid;
    }

    /**
     * метод должен вернуть true, если символ является символом доллара или нижним подчеркиванием
     */
    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    /**
     * метод должен вернуть true, если символ является заглавным латинским символом
     */
    public static boolean isUpperLatinLetter(int code) {
        return code > 65 && code < 90;
    }

    /**
     * метод должен вернуть true, если символ является маленьким латинским символом
     */
    public static boolean isLowerLatinLetter(int code) {
        return code > 97 && code < 122;
    }

    public static void main(String[] args) {
        System.out.println(isUpperLatinLetter(70));
    }
}