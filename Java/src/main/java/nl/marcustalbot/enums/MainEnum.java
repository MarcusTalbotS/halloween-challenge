package nl.marcustalbot.enums;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * While it is already pretty interesting that a main-method can legally occur in an enum, the real kicker is that the
 * constructor of an enum is executed before the main-method. This allows the user to run an entire program, before the
 * main-method is executed.
 */
public enum MainEnum {

    MAIN;

    MainEnum() {

        class HelloWorldException extends RuntimeException {
            public HelloWorldException(final String message) {
                super(message);
            }
        }

        try {
            throw new HelloWorldException("Hello, World!");
        } catch (HelloWorldException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, e.getMessage());
        } finally {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Logger.getGlobal().log(Level.INFO, "What is my purpose?");
    }

}
