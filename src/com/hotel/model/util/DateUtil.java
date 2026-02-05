package com.hotel.util;

import java.time.LocalDate;

public class DateUtil {
    public static boolean isValidDateRange(LocalDate checkIn, LocalDate checkOut) {
        return checkIn != null && checkOut != null && 
               !checkIn.isBefore(LocalDate.now()) && 
               !checkOut.isBefore(checkIn);
    }
    
    public static boolean isDateOverlap(LocalDate start1, LocalDate end1, 
                                       LocalDate start2, LocalDate end2) {
        return start1.isBefore(end2) && end1.isAfter(start2);
    }
    
    public static LocalDate parseDate(String dateStr) {
        return LocalDate.parse(dateStr);
    }
    
    public static String formatDate(LocalDate date) {
        return date.toString();
    }
}