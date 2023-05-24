/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ancocentral.loggingapp;

import static com.ancocentral.loggingapp.LogHelper.MAIN_LOGGER;

/**
 *
 * @author chris
 */
public class LoggingApp {

    public static void main(String[] args) {
        MAIN_LOGGER.info("Application started.");
        LogThread logOne = new LogThread("A");
        Thread thread = new Thread(logOne);
        thread.setName("1st");
        //thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        LogThread logTwo = new LogThread("B");
        thread = new Thread(logTwo);
        thread.setName("2nd");
        //thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }
}
