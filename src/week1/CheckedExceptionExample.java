package week1;

import java.io.File;

public class CheckedExceptionExample {

    public static void main(String[] args) throws CustomException {
        checkFileExists("nonexistent.txt");
    }

    public static void checkFileExists(String filePath) throws CustomException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new CustomException("File not found. Give a correct path.");
        }
    }
}
