package cz.trnenmic.websocketcalculator.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m
 */
public class SleepUtils {

    public static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SleepUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
