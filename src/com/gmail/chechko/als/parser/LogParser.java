package com.gmail.chechko.als.parser;

import static com.gmail.chechko.als.parser.LogParserConstants.ELITE_GAME_LOGS_PATH;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Als
 */
public class LogParser {

    private String fileName;

    public LogParser(String fileName) {
        this.fileName = fileName;
    }

    public StringBuilder parse() {
        StringBuilder builder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(ELITE_GAME_LOGS_PATH + fileName));
            scanner.useDelimiter("\\r\\n");

            while (scanner.hasNext()) {
                String token = scanner.next();
                builder.append(token + " \n ");
                //System.out.printf("%s%n", token);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return builder;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
