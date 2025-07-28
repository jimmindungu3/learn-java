package com.james;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class JavaDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println("Local Date and Time: " + localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date: " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time: " + localTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy HH:mm:ss");
        String formattedDate = localDateTime.format(dateTimeFormatter);
        System.out.println("Formatted Date and Time: " + formattedDate);
    }
}