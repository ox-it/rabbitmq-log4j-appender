package com.plant42.log4j;

import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.LoggingEvent;

/**
 * This is a simple delegating error handler that doesn't pass stack traces.
 * This makes it easy to have the framework be quiet.
 */
public class QuietErrorHandler implements ErrorHandler {

    private final ErrorHandler proxy;

    public QuietErrorHandler(ErrorHandler proxy) {
        this.proxy = proxy;
    }

    public void setLogger(Logger logger) {
        proxy.setLogger(logger);
    }

    public void error(String message, Exception e, int errorCode) {
        proxy.error(message);
    }

    public void setBackupAppender(Appender appender) {
        proxy.setBackupAppender(appender);
    }

    public void activateOptions() {
        proxy.activateOptions();
    }

    public void error(String message) {
        proxy.error(message);
    }

    public void error(String message, Exception e, int errorCode, LoggingEvent event) {
        proxy.error(message);
    }

    public void setAppender(Appender appender) {
        proxy.setAppender(appender);
    }
}
