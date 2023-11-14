package week1;

import java.io.File;

public class CheckedExceptionExample {

    public static void main(String[] args) throws CustomException {
        checkFileExists(null);
    }

    public static void checkFileExists(String filePath) throws CustomException {
        try{
            if(filePath == null || filePath.isEmpty()){
                throw new CustomException("File not found. Give a correct path.");
            }
            File file = new File(filePath);

            if (!file.exists()) {
                throw new CustomException("File not found. Give a correct path.");
            }
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
