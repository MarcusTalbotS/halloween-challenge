package nl.marcustalbot;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, """
        ====================================================================================================================================================
        | Welcome to the repository containing scarily bad code!                                                                                           |
        | =================================================================================================================================================|
        | The aim of this repository is to have fun exploring bad/unconventional features, and to exploit regular features to produce questionable code.   |
        | This repository does not aim to be a repository of low-quality/broken code.                                                                      |
        | All code posted to this repository must be functional, and interesting in some way.                                                              |
        ====================================================================================================================================================
        """);
    }
}