package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TxtFileCreator {
    public void createFile(String content, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
            writer.write(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}