package nl.marcustalbot.enums;

/**
 * While it is already pretty interesting that a main-method can legally occur in an enum, the real kicker is that the
 * constructor of an enum is executed before the main-method. This allows the user to run an entire program, before the
 * main-method is executed.
 */
public enum MainEnum {

    MAIN;

    MainEnum() {
        try {
            throw new RuntimeException("Hello, World!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("What is my purpose?");
    }

}
