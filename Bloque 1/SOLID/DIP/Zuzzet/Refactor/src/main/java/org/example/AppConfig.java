package org.example;

import java.lang.reflect.Type;

public class AppConfig {
    public static DocumentGenerator generateDocumentGenerator() {
        FileCreatorRegistry registry = new FileCreatorRegistry();
        registry.registerCreators(1, new TxtFileCreator(), TxtFileCreator.getType());

        InputReader inputReader = new ConsoleReaderInput();
        return new DocumentGenerator(inputReader, registry);
    }
}