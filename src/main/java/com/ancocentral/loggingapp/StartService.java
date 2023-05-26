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
public class StartService implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(StartService.class.getSimpleName());

    @Override
    public void run() {
        connect();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            LOGGER.fatal(ex);
        }
        disconnect();
    }
    private void connect() {
        LOGGER.info("Connecting.");
    }
    private void disconnect() {
        LOGGER.warn("Disconnecting.");
    }
}
