package org.fujitsu.training.codes;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Mathematics {
	
	//step 1 create logger
	private static Logger logger = Logger.getLogger(Mathematics.class.getName());
	
	//Step 1b: set the default levels - set in constructors
	public Mathematics() {
		logger.setLevel(Level.INFO); //normal course of logging
		
		try {
			//step 2 : add desired medium
			FileHandler file = new FileHandler("./src/logs/math.log", true);
			//setters
			file.setEncoding("UTF-8");
			file.setLevel(Level.WARNING);
			
			//step 3: set ur own message format on the medium
			SimpleFormatter simple = new SimpleFormatter();
			file.setFormatter(simple);
			
			logger.addHandler(file);
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		logger.info("welcome mathematics is created");
	}
	
	public Mathematics(int x) {
		logger.info("welcome mathematics is created" + x);
	}

	public int add (int x, int y) {
		logger.info("add () called...");
		logger.info("Result = " + (x+y));
		logger.info("add () exits...");
		return x + y;
	}
	
	@SuppressWarnings("unused")
	public int div (int x, int y) throws ArithmeticException, Exception {
		logger.info("div () called...");
		logger.fine("walang error");
		
		logger.warning("depricated Date object used....");
		Date now = new Date(121,0,29);
		
		if( y == 0) {
			logger.severe("division by zero, error...");
			throw new ArithmeticException();
		}
		logger.info("div () exits...");
		return x / y;
	}
	
	public static void display() {
		
	}
}
