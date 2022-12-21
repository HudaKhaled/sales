package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvoiceHeader {
	private int invoiceNum;
	private LocalDateTime invoiceDate;
	private String customerName;
	//private LinkedList<AtomicInteger> InvoiceLines;
	
	
	public void setInvoiceNum (int newInvoiceNum) {
		invoiceNum= newInvoiceNum;
}
	public void setInvoiceDate(LocalDateTime todayDate) {
		
		todayDate = LocalDateTime.now();
		invoiceDate = todayDate;
	}
	
	public void setCustomerName(String newCustomerName) {
		customerName = newCustomerName;
	}
//	public void setInvoiceLines(LinkedList<AtomicInteger> newLine) {
//        for (int i = 0; i < newLine.size(); i++) {
//        int index = i; // whatever index
//        Integer value = newLine.get(i); // get value
//        value = value + 1; // increment value
//        newLine.set(i, value); // replace value
//        this.InvoiceLines = newLine;
//        
//        System.out.println(InvoiceLines);
//        
//        newLine.getLast().incrementAndGet();
//    }
	}
//	public void setInvoiceLines() {
//		
//		ArrayList<Integer> newInvoiceLine =new ArrayList<Integer>();
//	for (int i = 0; i < newInvoiceLine.size(); i++) {
//		newInvoiceLine.add(i);
//		InvoiceLines.addAll(newInvoiceLine);
//		
//	  System.out.println(newInvoiceLine);
//	  System.out.println(InvoiceLines);
//	}
//	}
//	
//public void setInvoiceLines1() {
//		
//	for (int counter = 0; counter < InvoiceLines.size(); counter++) { 
//		//	boolean x =InvoiceLines.add(counter);
//			this.InvoiceLines.add(counter);
//			InvoiceLines = Collections.unmodifiableList(i);
//      System.out.println(InvoiceLines.get(counter)); 
//	}
//	}

//     /* For Loop for iterating ArrayList */
//     System.out.println("For Loop");
//     for (int counter = 0; counter < arrlist.size(); counter++) { 		      
//         System.out.println(arrlist.get(counter)); 		
//     }  
//}

