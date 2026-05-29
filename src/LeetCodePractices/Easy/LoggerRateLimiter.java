/**
 * You are building a logging system for a server.The server generates log messages whenever an event occurs.
 * To avoid excessive duplicate logs, the same message should not be printed more than once within
 * a 10-second window.

 * Implement a class Logger with the following method:
 * public boolean shouldPrintMessage(int timestamp, String message)

 * Rules
 * If the message has never been printed before, print it and return true.
 * If the message was printed less than 10 seconds ago, do not print it and return false.
 * If at least 10 seconds have passed since the message was last printed, print it and return true.

 * Assume:
 * Timestamps are given in seconds.
 * Timestamps arrive in increasing order

 Example Input:
 * Logger logger = new Logger();
 * logger.shouldPrintMessage(1, "Database Error");
 * logger.shouldPrintMessage(2, "Memory High");
 * logger.shouldPrintMessage(5, "Database Error");
 * logger.shouldPrintMessage(11, "Database Error");
 * logger.shouldPrintMessage(12, "Memory High");

 * Output
 * true
 * true
 * false
 * true
 * true
 */

package LeetCodePractices.Easy;

import java.util.HashMap;

class Logger {

    HashMap<String, Integer> map;

    public Logger() {
        map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {

        // First time seeing this message
        if (!map.containsKey(message)) {
            map.put(message, timestamp);
            return true;
        }

        int oldTimestamp = map.get(message);

        if (timestamp - oldTimestamp >= 10) {
            map.put(message, timestamp);
            return true;
        }

        return false;
    }
}

public class LoggerRateLimiter {
    public static void main(String[] args) {
        Logger logger = new Logger();

        System.out.println(logger.shouldPrintMessage(1, "Database Error"));
        System.out.println(logger.shouldPrintMessage(2, "Memory High"));
        System.out.println(logger.shouldPrintMessage(5, "Database Error"));
        System.out.println(logger.shouldPrintMessage(11, "Database Error"));
        System.out.println(logger.shouldPrintMessage(12, "Memory High"));


    }
}
