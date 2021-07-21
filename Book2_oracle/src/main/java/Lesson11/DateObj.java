/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author rosso
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateObj {
    public static void main(String[] args) {
        
        LocalDate myDate = LocalDate.now(); 
        LocalDateTime myDateTime = LocalDateTime.now();
        JapaneseDate jDate = JapaneseDate.from(myDate);
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE);
        
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        
        
        System.out.println("Todays date is: " + myDate);
        System.out.println("Japanese date is:" + jDate);
        System.out.println("\n" + "Date of 5 months ago: " + myDate.minusMonths(5));
        System.out.println("Date in 1 month: " + myDate.plusMonths(1));
        System.out.println("\n" + "Date and time of now: " + myDateTime);
        System.out.println("\n" +"Date in ISO_DATE format: " + sDate);
        System.out.println("Date formatted in MEDIUM time zone: " + fDate);
        
                
    }
}
