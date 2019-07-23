package com.stackroute.pe3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileManipulation {
    public String getFileContent(String fileLocation) throws IOException {
        String line = null;
        try {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(fileLocation);

            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                return line;
            }
        } catch (IOException ex) {
            return "Error reading file named '" + fileLocation+ "'";
        }
        return line;
    }
}
