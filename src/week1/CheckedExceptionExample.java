package week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void main(String[] args) throws CustomException {

        // Printing the exact message and not including the detailed message.
        File file = new File("nonexistent.txt");
        try{
            if(!file.exists()){
                throw new CustomException("File not found. Give a correct path.");
            }
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }


    }
}
