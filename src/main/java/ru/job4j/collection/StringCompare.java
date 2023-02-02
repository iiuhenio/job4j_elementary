package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    return result;
                }
        }
        return Integer.compare(left.length(), right.length());
    }

    public static void main(String[] args) {
        StringCompare s = new StringCompare();
        int rsl = s.compare("1sdf", "2fder");
        int rsl2 = s.compare("2dwer", "1vvv");
        int rsl3 = s.compare("2dfsfsd", "2rrrr");
        System.out.println(rsl);
        System.out.println(rsl2);
        System.out.println(rsl3);
    }
}