package com.example.dsasolutions;

import java.util.Arrays;
import java.util.HashMap;

public class LoggerRateLimiter {
    public static boolean shouldPrintMessage(int timestamp, String message) {
        HashMap<String, Integer> expiry = new HashMap<>();

        if (!expiry.containsKey(message)) {
            expiry.put(message, timestamp);
            return true;
        }
        int oldTime = expiry.get(message);

        if (timestamp - oldTime >= 10) {
            expiry.put(message, timestamp);
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

        // need to add multiple data
        /*
        * ["Logger","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage"]
        *
            [[],[1,"foo"],[2,"bar"],[3,"foo"],[8,"bar"],[10,"foo"],[11,"foo"]]
            *
            * */

        System.out.println("print status ------ > " + shouldPrintMessage(1, "foo"));
    }
}
