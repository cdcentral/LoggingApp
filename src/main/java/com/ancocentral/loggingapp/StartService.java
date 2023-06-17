/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ancocentral.loggingapp;

import static com.ancocentral.loggingapp.LogHelper.ROUTING_LOGGER;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 *
 * @author chris
 */
public class StartService implements Runnable {
    //private static final Logger LOGGER = LogManager.getLogger(StartService.class.getSimpleName());

    private String instance = "";
    public StartService (String instance) {
        this.instance = instance;
    }
    @Override
    public void run() {
        connect();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ThreadContext.put("DYNAMIC_LOG", instance);
            ROUTING_LOGGER.fatal(instance + " Exception ->", ex);
        }
        disconnect();
    }
    private void connect() {
        ThreadContext.put("DYNAMIC_LOG", instance);
        ROUTING_LOGGER.info(instance + " is connecting.");
    }
    private void disconnect() {
        ThreadContext.put("DYNAMIC_LOG", instance);
        ROUTING_LOGGER.warn(instance + " is disconnecting.");
    }
}
