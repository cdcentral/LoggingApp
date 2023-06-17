/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ancocentral.loggingapp;

import static com.ancocentral.loggingapp.LogHelper.CONSOLE_LOGGER;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author chris
 */
public class Monitor implements Runnable {
    //private static final Logger LOGGER = LogManager.getLogger(Monitor.class.getSimpleName());

    @Override
    public void run() {
        startMonitoring();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            CONSOLE_LOGGER.fatal(ex);
        }
        endMonitoring();
    }

    private void startMonitoring() {
        CONSOLE_LOGGER.info("Starting to monitor.");
    }
    private void endMonitoring() {
        CONSOLE_LOGGER.warn("Ending monitor.");
    }
}
