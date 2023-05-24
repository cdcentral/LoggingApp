/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ancocentral.loggingapp;

import static com.ancocentral.loggingapp.LogHelper.CONSOLE_OUT_LOGGER;
import static com.ancocentral.loggingapp.LogHelper.CSV_LOGGER;
import static com.ancocentral.loggingapp.LogHelper.ROUTING_LOGGER;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 *
 * @author chris
 */
public class LogThread implements Runnable {

    private static final Logger LOGGER = LogManager.getLogger(LogThread.class.getSimpleName());

    private String instance = "";

    /**
     * 
     * @param instance 
     */
    public LogThread(String instance) {
        this.instance = instance;
    }

    @Override
    public void run() {
         for(int i = 0; i < 100; i++) {
             LOGGER.info("index in loop " + i); // don't see this logged anywhere.
             CONSOLE_OUT_LOGGER.info("index in loop " + i);

             ThreadContext.put("DYNAMIC_LOG", instance);
             ROUTING_LOGGER.info("index in loop " + i);
             ThreadContext.remove("DYNAMIC_LOG");

             Date dt = new Date();

//             CSV_LOGGER.info("index " + i, dt,  instance); // the index + i doesn't show up in the log
             CSV_LOGGER.info("ignored", "index " + i,  dt,  instance); // now 'index + i' shows up, why is that first parameter needed?
                                    // per Logger.java java doc there's this:
                                    //     public void info(String message, Object p0, Object p1, Object p2);
                                    // so maybe for csv loggers the first parameter is just a throw away?
                                    // perhaps a question for stack overflow.
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException ex) {
                 LOGGER.error(ex);
             }
         }
    }

}
