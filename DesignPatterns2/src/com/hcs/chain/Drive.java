package com.hcs.chain;

public class Drive {

	public static void main(String[] args) {
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		errorLogger.logMessage(3, "error logger message");
		
		fileLogger.logMessage(3, "file logger message");
	}

}
