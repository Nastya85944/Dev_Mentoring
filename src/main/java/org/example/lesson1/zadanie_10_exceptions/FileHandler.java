package org.example.lesson1.zadanie_10_exceptions;

public class FileHandler {

    private final String filePath;
    private final int noConnectors;
    private final int maxFileSize;

    public FileHandler(String filePath, int noConnectors, int maxFileSize) throws InvalidDataException {
        if (filePath.isEmpty() || filePath == null) {
            throw new InvalidDataException("File Path can't be empty");
        }
        if (noConnectors > 10 || noConnectors < 0) {
            throw new InvalidDataException("Connection number must be from 1 to 10");
        }
        if (maxFileSize < 1000 || maxFileSize >= 10000) {
            throw new InvalidDataException("Max File Size should be four-digit number");
        }
        this.filePath = filePath;
        this.noConnectors = noConnectors;
        this.maxFileSize = maxFileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getNoConnectors() {
        return noConnectors;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void readContent() {
        System.out.println("Read file");
    }

    public void saveToFile(String content) {
        System.out.println("Save content: " + content);
    }


}
