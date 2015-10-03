package com.tcampanella.last_minute.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import com.tcampanella.last_minute.util.Util;

/**
 * @author Tommaso Campanella
 * 
 * Main class to provide an example of
 * how the all application behaves:
 * 
 *  1) A ShoppingList is read from a file. If none are mentioned,
 *     a standard is provided, by the name "file.txt"
 *  
 *  2) A ReceiptList is generated from the just created ShoppingList.
 *     Such class will contain the desired output as from specifications.
 *
 *
 */

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {

		ShoppingList shoppingList = new ShoppingList();
		ReceiptList receiptList = new ReceiptList(shoppingList);
		
		System.out.println(receiptList);
		
	}

}
