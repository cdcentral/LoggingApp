/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ancocentral.loggingapp;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 * @author chris
 */
public class LoggingApp {
    private static final Logger LOGGER = LogManager.getLogger(LoggingApp.class.getSimpleName());

    public static void main(String[] args) {
        LOGGER.info("Application started.");
        StartService ss = new StartService();
        Thread serviceThread = new Thread(ss);
        serviceThread.start();
        Monitor mon = new Monitor();
        Thread monThread = new Thread(mon);
        monThread.start();
    }
}
