package com.james;

public class ReturnTypes {
    public static void main(String[] args) {
        System.out.println(getUsername());         // String
        System.out.println(getAccountBalance());   // int
        System.out.println(getInterestRate());     // double
        System.out.println(isActive());            // boolean
        System.out.println(getGrade());            // char
        System.out.println(getPhoneNumber());      // long
        System.out.println(getShortCode());        // short
        System.out.println(getByteValue());        // byte
        System.out.println(getFloatValue());       // float
    }

    public static String getUsername() {
        return "James Nganga Ndungu";
    }

    public static int getAccountBalance() {
        return 50_000;
    }

    public static double getInterestRate() {
        return 7.5;
    }

    public static boolean isActive() {
        return true;
    }

    public static char getGrade() {
        return 'A';
    }

    public static long getPhoneNumber() {
        return 254712345678L;
    }

    public static short getShortCode() {
        return 12345;
    }

    public static byte getByteValue() {
        return 127;
    }

    public static float getFloatValue() {
        return 5.75f;
    }
}
