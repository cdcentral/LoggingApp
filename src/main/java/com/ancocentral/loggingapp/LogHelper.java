/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ancocentral.loggingapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author chris
 */
public class LogHelper {
    /**
     * Logger to be used to route log messages to their own log files.
     * 
     * There is no specific log file for this.  The log files are dynamically created.
     */
    public static final Logger ROUTING_LOGGER = LogManager.getLogger("RoutingLogger");

    /**
     * Logger to be used to write logs to the console output.  Really is for debug purposes 
     * only.
     * 
     */
    public static final Logger CONSOLE_LOGGER = LogManager.getLogger("ConsoleLogger");
   /**
     * General catch all logger for the application.
     * 
     * Specifically the log file is App.log.  See the log4j2.xml where that is defined.
     */
    public static final Logger MAIN_LOGGER = LogManager.getLogger("MainLogger");
}
