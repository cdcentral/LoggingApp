/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ancocentral.loggingapp;

import static com.ancocentral.loggingapp.LogHelper.CONSOLE_LOGGER;
import static com.ancocentral.loggingapp.LogHelper.CSV_LOGGER;
import java.util.Date;

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
            for(int i = 0; i < 100; i++) {
                //      csv header rows:  index, date, instance
                CSV_LOGGER.info("ignored", i, new Date(), "Monitor");
                Thread.sleep(100);
            }
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
