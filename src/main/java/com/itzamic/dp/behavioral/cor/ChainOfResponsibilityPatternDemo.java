package com.itzamic.dp.behavioral.cor;

public class ChainOfResponsibilityPatternDemo {
  public static void main(String[] args) {
    AbstractLogger loggerChain = getChainOfLoggers();

    loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

    loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

    loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
  }

  private static AbstractLogger getChainOfLoggers() {
    var errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    var fileLogger = new FileLogger(AbstractLogger.DEBUG);
    var consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);
    return errorLogger;
  }
}
