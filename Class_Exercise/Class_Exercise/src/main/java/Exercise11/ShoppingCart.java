/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rosso
 */

public class ShoppingCart {
      public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
               LocalDate currentDate = LocalDate.now();
        
	// Initialize the orderDate to the current date and time. Print it.
            System.out.println(currentDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
           String fDate =  currentDate.format(DateTimeFormatter.ISO_DATE);

    }
}
