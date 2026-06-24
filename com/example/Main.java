package com.example.main;

public class Main {
    public static void main(String[] args) {
        String str = "J@va the be$t!123";
        System.out.println(str);
        System.out.println(reverseLetters(str));
    }

    public static String reverseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int start = 0;
        int end = str.length() - 1;
        char[] output = str.toCharArray();
        while (start < end) {
            if (!Character.isLetter(output[start])) {
                start++;
            } else if (!Character.isLetter(output[end])) {
                end--;
            } else {
                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;
                start++;
                end--;
            }
        }
        return new String(output);
    }
}
